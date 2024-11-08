package com.example.msassistance.service;

import com.example.msassistance.model.WorksheetCrew;
import com.example.msassistance.repository.WorksheetCrewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorksheetCrewService {

    @Autowired
    private WorksheetCrewRepository worksheetCrewRepository;

    public List<WorksheetCrew> getAllWorksheetCrews() {
        return worksheetCrewRepository.findAll();
    }

    public Optional<WorksheetCrew> getWorksheetCrewById(Integer id) {
        return worksheetCrewRepository.findById(id);
    }

    public WorksheetCrew createWorksheetCrew(WorksheetCrew worksheetCrew) {
        return worksheetCrewRepository.save(worksheetCrew);
    }

    public WorksheetCrew updateWorksheetCrew(Integer id, WorksheetCrew worksheetCrewDetails) {
        WorksheetCrew worksheetCrew = worksheetCrewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("WorksheetCrew not found"));
        worksheetCrew.setDate(worksheetCrewDetails.getDate());
        worksheetCrew.setTime(worksheetCrewDetails.getTime());
        worksheetCrew.setDetail(worksheetCrewDetails.getDetail());
        worksheetCrew.setShipId(worksheetCrewDetails.getShipId());
        worksheetCrew.setAgentId(worksheetCrewDetails.getAgentId());
        worksheetCrew.setCompanyId(worksheetCrewDetails.getCompanyId());
        worksheetCrew.setDockId(worksheetCrewDetails.getDockId());
        worksheetCrew.setNumberOfPeople(worksheetCrewDetails.getNumberOfPeople());
        worksheetCrew.setFlightNumber(worksheetCrewDetails.getFlightNumber());
        worksheetCrew.setFlightTime(worksheetCrewDetails.getFlightTime());
        worksheetCrew.setIsFlightTimeTomorrow(worksheetCrewDetails.getIsFlightTimeTomorrow());
        worksheetCrew.setPickup(worksheetCrewDetails.getPickup());
        worksheetCrew.setDropoff(worksheetCrewDetails.getDropoff());
        worksheetCrew.setStop(worksheetCrewDetails.getStop());
        worksheetCrew.setRemark(worksheetCrewDetails.getRemark());
        return worksheetCrewRepository.save(worksheetCrew);
    }

    public void deleteWorksheetCrew(Integer id) {
        worksheetCrewRepository.deleteById(id);
    }
}
