package com.example.msassistance.model.lookup;

import javax.persistence.*;

@Entity
@Table(name = "dock")
public class Dock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dockId;

    @Column(name = "dock_name")
    private String dockName;

    // Getters and Setters
    public Integer getDockId() { return dockId; }
    public void setDockId(Integer dockId) { this.dockId = dockId; }

    public String getDockName() { return dockName; }
    public void setDockName(String dockName) { this.dockName = dockName; }
}
