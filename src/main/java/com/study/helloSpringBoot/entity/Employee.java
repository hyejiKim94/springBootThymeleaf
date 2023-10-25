package com.study.helloSpringBoot.entity;

import com.study.helloSpringBoot.util.BooleanConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor  // 1つのパラメータももらわないコンストラクター生成
@AllArgsConstructor // 全てのフィールドの値をパラメータでもらうコンストラクター生成
@Entity // データベースのテーブルを表すクラスを指す
public class Employee extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long employeeId;

  @Column(length = 8)
  private String birth;

  @Column(length = 50)
  private String employeeName;

  @Column
  private String departmentCd;

  @Column
  private String positionCd;

  @Column
  private Long projectNo;

  @Column(length = 1)
  @Convert(converter = BooleanConverter.class)
  private boolean deleteFlag;

}
