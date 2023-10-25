package com.study.helloSpringBoot.repository;

import com.study.helloSpringBoot.vo.EmployeeBasicInfoVo;
import com.study.helloSpringBoot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

  @Query(value=
      """
          SELECT em.EMPLOYEE_ID AS employeeId
               , em.BIRTH AS birth
               , em.EMPLOYEE_NAME AS employeeName
               , em.DEPARTMENT_CD AS departmentCd
               , dp.MASTER_VALUE_NAME AS departmentName
               , em.POSITION_CD AS positionCd
               , po.MASTER_VALUE_NAME AS positionName
               , em.PROJECT_NO AS projectNo
               , pr.PROJECT_NAME AS projectName
               , em.DELETE_FLAG AS deleteFlag
          FROM EMPLOYEE em
          INNER JOIN COMMON_MASTER dp
                  ON dp.MASTER_CD = '01'
                 AND dp.MASTER_VALUE = em.department_cd
          INNER JOIN COMMON_MASTER po
                  ON po.MASTER_CD = '02'
                 AND po.MASTER_VALUE = em.POSITION_CD
          LEFT OUTER JOIN PROJECT pr
                  ON pr.PROJECT_NO = em.PROJECT_NO
          WHERE em.EMPLOYEE_ID = :employeeId
          """, nativeQuery = true)
  public Optional<EmployeeBasicInfoVo> getEmployeeBaseInfo(@Param("employeeId") Long employeeId);
}
