package com.study.helloSpringBoot.controller;

import com.study.helloSpringBoot.constants.CommonMasterCd;
import com.study.helloSpringBoot.dto.apply.ApplyMainDto;
import com.study.helloSpringBoot.entity.CommonMaster;
import com.study.helloSpringBoot.helper.ApplyMainHelper;
import com.study.helloSpringBoot.service.ApplyService;
import com.study.helloSpringBoot.service.CommonService;
import com.study.helloSpringBoot.service.EmployeeService;
import com.study.helloSpringBoot.vo.EmployeeBasicInfoVo;
import com.study.helloSpringBoot.vo.OvertimeApplyVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class baseController {

  private final EmployeeService employeeService;
  private final CommonService commonService;
  private final ApplyService applyService;

  private final ApplyMainHelper helper = new ApplyMainHelper();

  private final Long testEmployeeId = 3L;

  @GetMapping("/apply/init")
  public String applyList(Model model) {
    EmployeeBasicInfoVo employeeInfo = employeeService.getEmployeeBasicInfo(testEmployeeId);
    List<CommonMaster> applyStatusList = commonService.getCommonValueList(CommonMasterCd.APPLY_STATUS.getMasterCdName());
    List<OvertimeApplyVo> applyList = applyService.getAllList(testEmployeeId);
    ApplyMainDto mainDto = helper.initApplyMainDto(employeeInfo, applyStatusList, applyList);
    model.addAttribute("mainDto", mainDto);
    return "index";
  }
}
