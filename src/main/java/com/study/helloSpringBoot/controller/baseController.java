package com.study.helloSpringBoot.controller;

import com.study.helloSpringBoot.dto.apply.ApplyMainDto;
import com.study.helloSpringBoot.helper.ApplyMainHelper;
import com.study.helloSpringBoot.service.EmployeeService;
import com.study.helloSpringBoot.vo.EmployeeBasicInfoVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class baseController {

  private final EmployeeService employeeService;

  private final ApplyMainHelper helper = new ApplyMainHelper();

  private final Long testEmployeeId = 3L;

  @GetMapping("/apply/init")
  public String applyList(Model model) {
    EmployeeBasicInfoVo employeeInfo = employeeService.getEmployeeBasicInfo(testEmployeeId);
    ApplyMainDto mainDto = helper.initApplyMainDto(employeeInfo);
    model.addAttribute("mainDto", mainDto);
    return "index";
  }
}
