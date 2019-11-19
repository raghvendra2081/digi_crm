package com.digi.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.FileLog;

@Repository
public interface FileLogRepository extends JpaRepository<FileLog, Long>{

}
