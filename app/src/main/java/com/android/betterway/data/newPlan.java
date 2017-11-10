package com.android.betterway.data;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author Jackdow
 * @version 1.0
 *          BetterWay
 */
@Entity
public class newPlan {
    private String location;
    private long startTime;
    private long endTime;
    @NotNull
    private int order;
    @NotNull
    private int moneySpend;
    @NotNull
    private int stayMinutes;
    @Id
    private long editFinishTime;
    private int type;
    private String statement;
    private double Lat;
    private double Lon;
    @Generated(hash = 1133175682)
    public newPlan(String location, long startTime, long endTime, int order,
            int moneySpend, int stayMinutes, long editFinishTime, int type,
            String statement, double Lat, double Lon) {
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
        this.order = order;
        this.moneySpend = moneySpend;
        this.stayMinutes = stayMinutes;
        this.editFinishTime = editFinishTime;
        this.type = type;
        this.statement = statement;
        this.Lat = Lat;
        this.Lon = Lon;
    }
    @Generated(hash = 1291828888)
    public newPlan() {
    }
    public String getLocation() {
        return this.location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public long getStartTime() {
        return this.startTime;
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public long getEndTime() {
        return this.endTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public int getOrder() {
        return this.order;
    }
    public void setOrder(int order) {
        this.order = order;
    }
    public int getMoneySpend() {
        return this.moneySpend;
    }
    public void setMoneySpend(int moneySpend) {
        this.moneySpend = moneySpend;
    }
    public int getStayMinutes() {
        return this.stayMinutes;
    }
    public void setStayMinutes(int stayMinutes) {
        this.stayMinutes = stayMinutes;
    }
    public long getEditFinishTime() {
        return this.editFinishTime;
    }
    public void setEditFinishTime(long editFinishTime) {
        this.editFinishTime = editFinishTime;
    }
    public int getType() {
        return this.type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getStatement() {
        return this.statement;
    }
    public void setStatement(String statement) {
        this.statement = statement;
    }
    public double getLat() {
        return this.Lat;
    }
    public void setLat(double Lat) {
        this.Lat = Lat;
    }
    public double getLon() {
        return this.Lon;
    }
    public void setLon(double Lon) {
        this.Lon = Lon;
    }
}
