/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.store;

/**
 *
 * @author Jimma University
 */
public class Available_drugs {
    private int serial_number;
    private int qty;
    private String expiry_date;
    private String drug_name;
    private String unit;
    private String batch_number;
    private Double unit_price;

    public Available_drugs(int serial_number, String drug_name, String unit, Double unit_price,String expiry_date,  String batch_number, int qty) {
        this.serial_number = serial_number;
        this.qty = qty;
        this.expiry_date = expiry_date;
        this.drug_name = drug_name;
        this.unit = unit;
        this.batch_number = batch_number;
        this.unit_price = unit_price;
    }

    
    
    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getExpiry_date() {
        return expiry_date;
    }
    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }
    public String getBatch_number() {
        return batch_number;
    }
    public void setBatch_number(String batch_number) {
        this.batch_number = batch_number;
    }
    public Double getUnit_price() {
        return unit_price;
    }
    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }   
}
