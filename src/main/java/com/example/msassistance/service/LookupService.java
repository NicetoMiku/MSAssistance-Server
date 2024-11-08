package com.example.msassistance.service;

import com.example.msassistance.model.lookup.Agent;
import com.example.msassistance.model.lookup.Company;
import com.example.msassistance.model.lookup.Dock;
import com.example.msassistance.model.lookup.Ship;
import com.example.msassistance.repository.lookup.AgentRepository;
import com.example.msassistance.repository.lookup.CompanyRepository;
import com.example.msassistance.repository.lookup.DockRepository;
import com.example.msassistance.repository.lookup.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LookupService {

    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private DockRepository dockRepository;

    @Autowired
    private ShipRepository shipRepository;

    // Retrieve all agents
    public List<Agent> getAllAgents() {
        return agentRepository.findAll();
    }

    // Retrieve all companies
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    // Retrieve all docks
    public List<Dock> getAllDocks() {
        return dockRepository.findAll();
    }

    // Retrieve all ships
    public List<Ship> getAllShips() {
        return shipRepository.findAll();
    }
}
