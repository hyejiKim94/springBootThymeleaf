package com.study.helloSpringBoot.repository;

import com.study.helloSpringBoot.vo.OvertimeApplyVo;
import com.study.helloSpringBoot.dto.apply.ApplySearchDto;
import com.study.helloSpringBoot.entity.OvertimeApply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OvertimeApplyRepository extends JpaRepository<OvertimeApply, Long> {

  @Query(value=
      """
          SELECT oa.APPLY_NO AS applyNo
               , oa.YEAR_AND_MONTH AS yearAndMonth
               , oa.APPLY_HOUR AS applyHour
               , oa.CREATED_DATE AS createdDate
               , ap.EMPLOYEE_NAME AS approvalEmployeeName
               , st.MASTER_VALUE AS statusCd
               , st.MASTER_VALUE_NAME AS status
               , oa.UPDATED_DATE AS updatedDate
          FROM EMPLOYEE em
            INNER JOIN OVERTIME_APPLY oa
              ON oa.APPLY_EMPLOYEE_ID = em.EMPLOYEE_ID
            INNER JOIN EMPLOYEE ap
              ON ap.EMPLOYEE_ID = oa.APPROVAL_EMPLOYEE_ID
            INNER JOIN COMMON_MASTER st
              ON st.MASTER_CD = '03'
             AND oa.STATUS = st.MASTER_VALUE
          WHERE em.EMPLOYEE_ID = :employeeId
          ORDER BY oa.APPLY_NO DESC
          """
  , nativeQuery = true)
  public List<OvertimeApplyVo> getApplyList(@Param("employeeId") Long employeeId);

  @Query(value =
      """
      SELECT oa.APPLY_NO AS applyNo
             , oa.YEAR_AND_MONTH AS yearAndMonth
             , oa.APPLY_HOUR AS applyHour
             , oa.CREATED_DATE AS createdDate
             , ap.EMPLOYEE_NAME AS approvalEmployeeName
             , st.MASTER_VALUE AS statusCd
             , st.MASTER_VALUE_NAME AS status
             , oa.UPDATED_DATE AS updatedDate
        FROM EMPLOYEE em
          INNER JOIN OVERTIME_APPLY oa
            ON oa.APPLY_EMPLOYEE_ID = em.EMPLOYEE_ID
          INNER JOIN EMPLOYEE ap
            ON ap.EMPLOYEE_ID = oa.APPROVAL_EMPLOYEE_ID
          INNER JOIN COMMON_MASTER st
            ON st.MASTER_CD = '03'
           AND oa.STATUS = st.MASTER_VALUE
        WHERE em.EMPLOYEE_ID = :employeeId
          AND (SUBSTR(oa.YEAR_AND_MONTH, 0, 4) = :#{#search.applyYear} OR :#{#search.applyYear} IS NULL)
          AND (SUBSTR(oa.YEAR_AND_MONTH, 5, 7) = LPAD(:#{#search.applyMonth}, 2, '0') OR :#{#search.applyMonth} IS NULL)
          AND (oa.APPLY_HOUR = :#{#search.applyHour} OR :#{#search.applyHour} IS NULL)
          AND (TO_CHAR(oa.CREATED_DATE, 'yyyy-mm-dd') >= :#{#search.applyDateFrom} OR :#{#search.applyDateFrom} IS NULL)
          AND (TO_CHAR(oa.CREATED_DATE, 'yyyy-mm-dd') <= :#{#search.applyDateTo} OR :#{#search.applyDateTo} IS NULL)
          AND (oa.STATUS = :#{#search.statusCd} OR :#{#search.statusCd} IS NULL)
        ORDER BY oa.APPLY_NO DESC
      """
  , nativeQuery = true)
  public List<OvertimeApplyVo> getApplyListByCondition(@Param("search") ApplySearchDto searchDto,@Param("employeeId") Long employeeId);
}
