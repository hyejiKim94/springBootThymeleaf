package com.study.helloSpringBoot.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class ControllerConfig {

  @InitBinder
  void initBinder(final WebDataBinder binder) {
    // 空欄の文字列はNullで変換
    binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
  }
}
