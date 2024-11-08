package com.example.msassistance.repository;

import com.example.msassistance.model.WorksheetPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorksheetPackageRepository extends JpaRepository<WorksheetPackage, Integer> {
}
