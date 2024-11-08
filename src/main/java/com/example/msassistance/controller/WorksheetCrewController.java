package com.example.msassistance.controller;

import com.example.msassistance.model.WorksheetCrew;
import com.example.msassistance.service.WorksheetCrewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/worksheet-crews")
public class WorksheetCrewController {

    @Autowired
    private WorksheetCrewService worksheetCrewService;

    @GetMapping
    public List<WorksheetCrew> getAllWorksheetCrews() {
        return worksheetCrewService.getAllWorksheetCrews();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorksheetCrew> getWorksheetCrewById(@PathVariable Integer id) {
        return worksheetCrewService.getWorksheetCrewById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public WorksheetCrew createWorksheetCrew(@RequestBody WorksheetCrew worksheetCrew) {
        return worksheetCrewService.createWorksheetCrew(worksheetCrew);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WorksheetCrew> updateWorksheetCrew(@PathVariable Integer id, @RequestBody WorksheetCrew worksheetCrewDetails) {
        return ResponseEntity.ok(worksheetCrewService.updateWorksheetCrew(id, worksheetCrewDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorksheetCrew(@PathVariable Integer id) {
        worksheetCrewService.deleteWorksheetCrew(id);
        return ResponseEntity.noContent().build();
    }
}
