package com.example.msassistance.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "worksheet_crew")
public class WorksheetCrew {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer worksheetCrewId;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private Short time;

    @Column(name = "detail")
    private String detail;

    @Column(name = "ship_id")
    private Integer shipId;

    @Column(name = "agent_id")
    private Integer agentId;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "dock_id")
    private Integer dockId;

    @Column(name = "number_of_people")
    private Byte numberOfPeople;

    @Column(name = "flight_number")
    private Integer flightNumber;

    @Column(name = "flight_time")
    private Short flightTime;

    @Column(name = "is_flight_time_tomorrow")
    private Boolean isFlightTimeTomorrow;

    @Column(name = "pickup")
    private String pickup;

    @Column(name = "dropoff")
    private String dropoff;

    @Column(name = "stop")
    private String stop;

    @Column(name = "remark")
    private String remark;

    // Getters and Setters
    public Integer getWorksheetCrewId() { return worksheetCrewId; }
    public void setWorksheetCrewId(Integer worksheetCrewId) { this.worksheetCrewId = worksheetCrewId; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public Short getTime() { return time; }
    public void setTime(Short time) { this.time = time; }

    public String getDetail() { return detail; }
    public void setDetail(String detail) { this.detail = detail; }

    public Integer getShipId() { return shipId; }
    public void setShipId(Integer shipId) { this.shipId = shipId; }

    public Integer getAgentId() { return agentId; }
    public void setAgentId(Integer agentId) { this.agentId = agentId; }

    public Integer getCompanyId() { return companyId; }
    public void setCompanyId(Integer companyId) { this.companyId = companyId; }

    public Integer getDockId() { return dockId; }
    public void setDockId(Integer dockId) { this.dockId = dockId; }

    public Byte getNumberOfPeople() { return numberOfPeople; }
    public void setNumberOfPeople(Byte numberOfPeople) { this.numberOfPeople = numberOfPeople; }

    public Integer getFlightNumber() { return flightNumber; }
    public void setFlightNumber(Integer flightNumber) { this.flightNumber = flightNumber; }

    public Short getFlightTime() { return flightTime; }
    public void setFlightTime(Short flightTime) { this.flightTime = flightTime; }

    public Boolean getIsFlightTimeTomorrow() { return isFlightTimeTomorrow; }
    public void setIsFlightTimeTomorrow(Boolean isFlightTimeTomorrow) { this.isFlightTimeTomorrow = isFlightTimeTomorrow; }

    public String getPickup() { return pickup; }
    public void setPickup(String pickup) { this.pickup = pickup; }

    public String getDropoff() { return dropoff; }
    public void setDropoff(String dropoff) { this.dropoff = dropoff; }

    public String getStop() { return stop; }
    public void setStop(String stop) { this.stop = stop; }

    public String getRemark() { return remark; }
    public void setRemark(String remark) { this.remark = remark; }
}
