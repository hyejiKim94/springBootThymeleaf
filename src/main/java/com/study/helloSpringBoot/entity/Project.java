package com.study.helloSpringBoot.entity;

import com.study.helloSpringBoot.util.BooleanConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Project extends BaseEntity {

  @Id
  private Long projectNo;

  @Column
  private String projectName;

  @Column
  private String workTypeCd;

  @Column
  private String workPlace;

  @Column
  private String managerEmployeeNo;

  @Column
  private Date startDate;

  @Column
  private Date endDate;

  @Convert(converter = BooleanConverter.class)
  private boolean deleteFlag;

}
