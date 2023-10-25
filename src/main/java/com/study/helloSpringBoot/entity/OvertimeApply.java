package com.study.helloSpringBoot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OvertimeApply extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long applyNo;

  @Column
  private Long applyEmployeeId;

  @Column
  private String approvalEmployeeId;

  @Column(length = 8)
  private String yearAndMonth;

  @Column(length = 2)
  private int applyHour;

  @Column
  private String status;

  @Column(length = 255)
  private String reason;

  @Column(length = 255)
  private String comment;
}
