package com.study.helloSpringBoot.service;

import com.study.helloSpringBoot.repository.EmployeeRepository;
import com.study.helloSpringBoot.vo.EmployeeBasicInfoVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

  private final EmployeeRepository employeeRepo;

  public EmployeeBasicInfoVo getEmployeeBasicInfo(Long employeeId) {
    Optional<EmployeeBasicInfoVo> employeeInfo = employeeRepo.getEmployeeBaseInfo(employeeId);
    if (employeeInfo.isPresent()) {
      return employeeInfo.get();
    } else {
      return null;
    }
  }
}
