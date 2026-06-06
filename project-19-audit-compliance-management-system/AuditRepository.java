package com.alhanoof.audit.repository;

import com.alhanoof.audit.entity.AuditRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AuditRepository extends JpaRepository<AuditRecord, Long> {

    List<AuditRecord> findByStatusIgnoreCase(String status);

    List<AuditRecord> findByAuditCategoryIgnoreCase(String auditCategory);
}
