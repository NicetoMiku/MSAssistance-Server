package com.example.msassistance.controller;

import com.example.msassistance.model.lookup.Agent;
import com.example.msassistance.model.lookup.Company;
import com.example.msassistance.model.lookup.Dock;
import com.example.msassistance.model.lookup.Ship;
import com.example.msassistance.service.LookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lookup")
public class LookupController {

    @Autowired
    private LookupService lookupService;

    // Endpoint to retrieve all agents
    @GetMapping("/agents")
    public List<Agent> getAllAgents() {
        return lookupService.getAllAgents();
    }

    // Endpoint to retrieve all companies
    @GetMapping("/companies")
    public List<Company> getAllCompanies() {
        return lookupService.getAllCompanies();
    }

    // Endpoint to retrieve all docks
    @GetMapping("/docks")
    public List<Dock> getAllDocks() {
        return lookupService.getAllDocks();
    }

    // Endpoint to retrieve all ships
    @GetMapping("/ships")
    public List<Ship> getAllShips() {
        return lookupService.getAllShips();
    }
}
