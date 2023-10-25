package com.study.helloSpringBoot.helper;

import com.study.helloSpringBoot.dto.apply.ApplyMainDto;
import com.study.helloSpringBoot.entity.CommonMaster;
import com.study.helloSpringBoot.vo.EmployeeBasicInfoVo;
import com.study.helloSpringBoot.vo.OvertimeApplyVo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ApplyMainHelper {

  /**
   * 初期画面表示設定
   * @param employeeInfo - 社員情報
   * @return
   */
  public ApplyMainDto initApplyMainDto(EmployeeBasicInfoVo employeeInfo, List<CommonMaster> applyStatusList
    , List<OvertimeApplyVo> applyList) {
    ApplyMainDto mainDto = new ApplyMainDto();
    // Header 社員情報
    mainDto.setEmployeeVo(employeeInfo);
    // Search area
    mainDto.setYearList(this.getDefaultYearList());
    mainDto.setStatusList(applyStatusList);
    // Result list area
    mainDto.setApplyList(applyList);
    return mainDto;
  }

  /**
   * セレクトボックスリスト設定 - 申請年度
   * @return
   */
  private List<Integer> getDefaultYearList() {
    Calendar cal = Calendar.getInstance();
    int currentYear = cal.get(Calendar.YEAR);
    List<Integer> yearList = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      yearList.add(currentYear - i);
    }
    return yearList;
  }


}
