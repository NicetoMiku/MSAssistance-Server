package com.example.msassistance.controller;

import com.example.msassistance.model.WorksheetPackage;
import com.example.msassistance.service.WorksheetPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/worksheet-packages")
public class WorksheetPackageController {

    @Autowired
    private WorksheetPackageService worksheetPackageService;

    @GetMapping
    public List<WorksheetPackage> getAllWorksheetPackages() {
        return worksheetPackageService.getAllWorksheetPackages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorksheetPackage> getWorksheetPackageById(@PathVariable Integer id) {
        return worksheetPackageService.getWorksheetPackageById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public WorksheetPackage createWorksheetPackage(@RequestBody WorksheetPackage worksheetPackage) {
        return worksheetPackageService.createWorksheetPackage(worksheetPackage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WorksheetPackage> updateWorksheetPackage(@PathVariable Integer id, @RequestBody WorksheetPackage worksheetPackageDetails) {
        return ResponseEntity.ok(worksheetPackageService.updateWorksheetPackage(id, worksheetPackageDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorksheetPackage(@PathVariable Integer id) {
        worksheetPackageService.deleteWorksheetPackage(id);
        return ResponseEntity.noContent().build();
    }
}
