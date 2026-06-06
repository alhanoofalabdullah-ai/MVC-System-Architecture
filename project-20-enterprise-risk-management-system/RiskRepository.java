package com.alhanoof.erm.repository;

import com.alhanoof.erm.entity.RiskRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RiskRepository extends JpaRepository<RiskRecord, Long> {

    List<RiskRecord> findByStatusIgnoreCase(String status);

    List<RiskRecord> findByRiskCategoryIgnoreCase(String riskCategory);

    List<RiskRecord> findByRiskOwnerContainingIgnoreCase(String riskOwner);
}
