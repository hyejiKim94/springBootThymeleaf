package com.study.helloSpringBoot.constants;

public enum CommonMasterCd {
    DEPARTMENT("01"),
    POSITION("02"),
    APPLY_STATUS("03"),
    WORK_TYPE("04");
    private final String masterCd;
    CommonMasterCd(String masterCdName) {
        this.masterCd = masterCdName;
    }
    public String getMasterCdName() {
        return masterCd;
    }
}
