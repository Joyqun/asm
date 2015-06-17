package com.sam.yh.model;

import java.util.Date;

public class PubBatteryInfo {
    private Integer id;

    private Integer batteryId;

    private String btyPubSn;

    private String ownerPhone;

    private String longitude;

    private String latitude;

    private String temperature;

    private String voltage;

    private Boolean status;

    private Date receiveDate;

    private Date sampleDate;

    public PubBatteryInfo() {
        super();
    }

    public PubBatteryInfo(BatteryInfo batteryInfo) {
        this.id = batteryInfo.getId();
        this.batteryId = batteryInfo.getBatteryId();
        this.longitude = batteryInfo.getLongitude();
        this.latitude = batteryInfo.getLatitude();
        this.temperature = batteryInfo.getTemperature();
        this.voltage = batteryInfo.getVoltage();
        this.status = batteryInfo.getStatus();
        this.receiveDate = batteryInfo.getReceiveDate();
        this.sampleDate = batteryInfo.getSampleDate();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBatteryId() {
        return batteryId;
    }

    public void setBatteryId(Integer batteryId) {
        this.batteryId = batteryId;
    }

    public String getBtyPubSn() {
        return btyPubSn;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public void setBtyPubSn(String btyPubSn) {
        this.btyPubSn = btyPubSn == null ? null : btyPubSn.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage == null ? null : voltage.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public Date getSampleDate() {
        return sampleDate;
    }

    public void setSampleDate(Date sampleDate) {
        this.sampleDate = sampleDate;
    }
}