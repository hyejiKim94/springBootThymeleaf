package com.study.helloSpringBoot.service;

import com.study.helloSpringBoot.entity.CommonMaster;
import com.study.helloSpringBoot.repository.CommonMasterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommonService {

  private final CommonMasterRepository commonMasterRepo;

  public List<CommonMaster> getCommonValueList(String masterCd) {
    return commonMasterRepo.findByMasterCd(masterCd);
  }
}
