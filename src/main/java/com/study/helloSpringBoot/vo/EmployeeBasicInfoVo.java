package com.study.helloSpringBoot.vo;

public interface EmployeeBasicInfoVo {

  // 社員ID
  Long getEmployeeId();

  // 生年月日
  String getBirth();

  // 氏名
  String getEmployeeName();

  // 配属部署コード
  String getDepartmentCd();

  // 配属部署名
  String getDepartmentName();

  // 役職コード
  String getPositionCd();

  // 役職名
  String getPositionName();

  // 配属プロジェクト番号
  Long getProjectNo();

  // 配属プロジェクト名
  String getProjectName();

  // 削除フラグ
  boolean getDeleteFlag();
}
