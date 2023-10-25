package com.study.helloSpringBoot.dto.apply;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApplySearchDto {

  private String applyYear;

  private String applyMonth;

  private String applyHour;

  private String applyDateFrom;

  private String applyDateTo;

  private String statusCd;

}
