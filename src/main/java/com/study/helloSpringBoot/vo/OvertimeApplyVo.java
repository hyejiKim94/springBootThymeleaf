package com.study.helloSpringBoot.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public interface OvertimeApplyVo {
  Long getApplyNo();

  String getYearAndMonth();

  int getApplyHour();

  @DateTimeFormat(pattern = "yyyy/MM/dd")
  LocalDate getCreatedDate();

  String getApprovalEmployeeName();

  String getStatusCd();

  String getStatus();

  @DateTimeFormat(pattern = "yyyy/MM/dd")
  LocalDate getUpdatedDate();
}
