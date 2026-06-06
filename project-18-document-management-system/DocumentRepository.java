package com.alhanoof.dms.repository;

import com.alhanoof.dms.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {

    List<Document> findByStatusIgnoreCase(String status);

    List<Document> findByDocumentTypeIgnoreCase(String documentType);
}
