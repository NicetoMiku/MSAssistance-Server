package com.example.msassistance.service;

import com.example.msassistance.model.WorksheetPackage;
import com.example.msassistance.repository.WorksheetPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorksheetPackageService {

    @Autowired
    private WorksheetPackageRepository worksheetPackageRepository;

    public List<WorksheetPackage> getAllWorksheetPackages() {
        return worksheetPackageRepository.findAll();
    }

    public Optional<WorksheetPackage> getWorksheetPackageById(Integer id) {
        return worksheetPackageRepository.findById(id);
    }

    public WorksheetPackage createWorksheetPackage(WorksheetPackage worksheetPackage) {
        return worksheetPackageRepository.save(worksheetPackage);
    }

    public WorksheetPackage updateWorksheetPackage(Integer id, WorksheetPackage worksheetPackageDetails) {
        WorksheetPackage worksheetPackage = worksheetPackageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("WorksheetPackage not found"));
        worksheetPackage.setDate(worksheetPackageDetails.getDate());
        worksheetPackage.setTime(worksheetPackageDetails.getTime());
        worksheetPackage.setAirWaybill(worksheetPackageDetails.getAirWaybill());
        worksheetPackage.setShipId(worksheetPackageDetails.getShipId());
        worksheetPackage.setAgentId(worksheetPackageDetails.getAgentId());
        worksheetPackage.setCompanyId(worksheetPackageDetails.getCompanyId());
        worksheetPackage.setDockId(worksheetPackageDetails.getDockId());
        worksheetPackage.setPickup(worksheetPackageDetails.getPickup());
        worksheetPackage.setDropoff(worksheetPackageDetails.getDropoff());
        worksheetPackage.setStop(worksheetPackageDetails.getStop());
        worksheetPackage.setRemark(worksheetPackageDetails.getRemark());
        return worksheetPackageRepository.save(worksheetPackage);
    }

    public void deleteWorksheetPackage(Integer id) {
        worksheetPackageRepository.deleteById(id);
    }
}
