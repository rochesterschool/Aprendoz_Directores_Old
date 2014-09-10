
package com.aprendoz_test.data;

import java.util.Date;


/**
 *  aprendoz_test.BusRoute
 *  09/10/2014 12:43:01
 * 
 */
public class BusRoute {

    private Integer id;
    private BusBus busBus;
    private BusDriver busDriver;
    private Date date;
    private String startingPoint;
    private String endingPoint;
    private Date startingTime;
    private Date endingTime;
    private Date created;

    public BusRoute() {
    }

    public BusRoute(Integer id, Date date, String startingPoint, String endingPoint, Date startingTime, Date endingTime, Date created) {
        this.id = id;
        this.date = date;
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
        this.startingTime = startingTime;
        this.endingTime = endingTime;
        this.created = created;
    }

    public BusRoute(Integer id, BusBus busBus, BusDriver busDriver, Date date, String startingPoint, String endingPoint, Date startingTime, Date endingTime, Date created) {
        this.id = id;
        this.busBus = busBus;
        this.busDriver = busDriver;
        this.date = date;
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
        this.startingTime = startingTime;
        this.endingTime = endingTime;
        this.created = created;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BusBus getBusBus() {
        return busBus;
    }

    public void setBusBus(BusBus busBus) {
        this.busBus = busBus;
    }

    public BusDriver getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(BusDriver busDriver) {
        this.busDriver = busDriver;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getEndingPoint() {
        return endingPoint;
    }

    public void setEndingPoint(String endingPoint) {
        this.endingPoint = endingPoint;
    }

    public Date getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }

    public Date getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(Date endingTime) {
        this.endingTime = endingTime;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

}
