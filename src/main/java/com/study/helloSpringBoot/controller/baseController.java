package com.study.helloSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class baseController {

  @GetMapping("/apply/init")
  public String applyList() {
    return "index";
  }
}
