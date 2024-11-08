package com.example.msassistance.model.lookup;

import javax.persistence.*;

@Entity
@Table(name = "ship")
public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shipId;

    @Column(name = "ship_name")
    private String shipName;

    // Getters and Setters
    public Integer getShipId() { return shipId; }
    public void setShipId(Integer shipId) { this.shipId = shipId; }

    public String getShipName() { return shipName; }
    public void setShipName(String shipName) { this.shipName = shipName; }
}
