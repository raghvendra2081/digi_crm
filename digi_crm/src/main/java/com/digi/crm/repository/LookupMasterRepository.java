package com.digi.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.LookUpMaster;

@Repository
public interface LookupMasterRepository extends JpaRepository<LookUpMaster, Long>{

	List<LookUpMaster> findLookUpMasterListByParentLookupValueOrLookupGroupAndLookupNameAndBuId(String parentLookupValue,String lookupGroup,String lookupName,String buId);

}
