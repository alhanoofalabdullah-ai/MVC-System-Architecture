package com.alhanoof.govservices.repository;

import com.alhanoof.govservices.entity.ServiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Long> {

    List<ServiceRequest> findByStatusIgnoreCase(String status);

    List<ServiceRequest> findByDepartmentIgnoreCase(String department);
}
