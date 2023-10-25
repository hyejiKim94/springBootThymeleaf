package com.study.helloSpringBoot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@AllArgsConstructor
@IdClass(CommonMasterPK.class)
public class CommonMaster extends BaseEntity {

  @Id
  @Column
  private String masterCd;

  @Id
  @Column
  private String masterValue;

  @Column
  private String masterCdName;

  @Column
  private String masterValueName;

  private int displayOrder;

}
