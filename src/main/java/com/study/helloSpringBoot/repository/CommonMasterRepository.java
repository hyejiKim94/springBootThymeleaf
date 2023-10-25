package com.study.helloSpringBoot.repository;

import com.study.helloSpringBoot.entity.CommonMaster;
import com.study.helloSpringBoot.entity.CommonMasterPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonMasterRepository extends JpaRepository<CommonMaster, CommonMasterPK> {

  List<CommonMaster> findByMasterCd(String masterCd);

}
