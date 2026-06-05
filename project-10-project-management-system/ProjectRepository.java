package com.alhanoof.pms.repository;

import com.alhanoof.pms.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findByStatusIgnoreCase(String status);

    List<Project> findByProjectManagerContainingIgnoreCase(String projectManager);
}
