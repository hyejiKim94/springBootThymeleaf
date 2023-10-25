package com.study.helloSpringBoot.dto.apply;

import com.study.helloSpringBoot.vo.EmployeeBasicInfoVo;
import com.study.helloSpringBoot.vo.OvertimeApplyVo;
import com.study.helloSpringBoot.entity.CommonMaster;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplyMainDto {
  // employee info
  private EmployeeBasicInfoVo employeeVo;

  // default year list
  private List<Integer> yearList;

  // apply status list
  private List<CommonMaster> statusList;

  // overtime apply list
  private List<OvertimeApplyVo> applyList;

  // search condition
  private ApplySearchDto searchDto;
}
