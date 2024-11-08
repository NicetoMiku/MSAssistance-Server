package com.example.msassistance.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "worksheet_package")
public class WorksheetPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer worksheetPackageId;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private Short time;

    @Column(name = "air_waybill", nullable = false)
    private Integer airWaybill;

    @Column(name = "ship_id")
    private Integer shipId;

    @Column(name = "agent_id")
    private Integer agentId;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "dock_id")
    private Integer dockId;

    @Column(name = "pickup")
    private String pickup;

    @Column(name = "dropoff")
    private String dropoff;

    @Column(name = "stop")
    private String stop;

    @Column(name = "remark")
    private String remark;

    // Getters and Setters
    public Integer getWorksheetPackageId() { return worksheetPackageId; }
    public void setWorksheetPackageId(Integer worksheetPackageId) { this.worksheetPackageId = worksheetPackageId; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public Short getTime() { return time; }
    public void setTime(Short time) { this.time = time; }

    public Integer getAirWaybill() { return airWaybill; }
    public void setAirWaybill(Integer airWaybill) { this.airWaybill = airWaybill; }

    public Integer getShipId() { return shipId; }
    public void setShipId(Integer shipId) { this.shipId = shipId; }

    public Integer getAgentId() { return agentId; }
    public void setAgentId(Integer agentId) { this.agentId = agentId; }

    public Integer getCompanyId() { return companyId; }
    public void setCompanyId(Integer companyId) { this.companyId = companyId; }

    public Integer getDockId() { return dockId; }
    public void setDockId(Integer dockId) { this.dockId = dockId; }

    public String getPickup() { return pickup; }
    public void setPickup(String pickup) { this.pickup = pickup; }

    public String getDropoff() { return dropoff; }
    public void setDropoff(String dropoff) { this.dropoff = dropoff; }

    public String getStop() { return stop; }
    public void setStop(String stop) { this.stop = stop; }

    public String getRemark() { return remark; }
    public void setRemark(String remark) { this.remark = remark; }
}
