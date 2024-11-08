package com.example.msassistance.repository.lookup;

import com.example.msassistance.model.lookup.Dock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DockRepository extends JpaRepository<Dock, Integer> {
}
