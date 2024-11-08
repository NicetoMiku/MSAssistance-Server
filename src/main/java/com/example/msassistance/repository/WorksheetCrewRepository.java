package com.example.msassistance.repository;

import com.example.msassistance.model.WorksheetCrew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorksheetCrewRepository extends JpaRepository<WorksheetCrew, Integer> {
}
