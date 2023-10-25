package com.study.helloSpringBoot.service;

import com.study.helloSpringBoot.repository.OvertimeApplyRepository;
import com.study.helloSpringBoot.vo.OvertimeApplyVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplyService {

  private final OvertimeApplyRepository applyRepo;

  public List<OvertimeApplyVo> getAllList(Long employeeId) {
    return applyRepo.getApplyList(employeeId);
  }
}
