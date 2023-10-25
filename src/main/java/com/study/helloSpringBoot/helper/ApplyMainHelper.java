package com.study.helloSpringBoot.helper;

import com.study.helloSpringBoot.dto.apply.ApplyMainDto;
import com.study.helloSpringBoot.vo.EmployeeBasicInfoVo;

public class ApplyMainHelper {

  public ApplyMainDto initApplyMainDto(EmployeeBasicInfoVo employeeInfo) {
    ApplyMainDto mainDto = new ApplyMainDto();
    mainDto.setEmployeeVo(employeeInfo);
    return mainDto;
  }
}
