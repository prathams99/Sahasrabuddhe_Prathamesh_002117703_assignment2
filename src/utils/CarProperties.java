/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author prath
 */
public class CarProperties {
    
    private String brandName;
    private String modelName;
    private String carCity;
    private int carSerialNumber;
    private int carMaxSeats;
    private int carMinSeats;
    private boolean carMaintenanceCertificate;
    private int carYear;
    private boolean isAvailable;
    private Date carDate;
    private Date timeStamp;
    
    // Input validators
    private final String nameRegex = "^[a-zA-Z]+$";
    private final String numberRegex = "^[0-9]*$";
    private final String nameNumberRegex = "^[a-zA-Z0-9]+$";

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public CarProperties(){
        this.timeStamp = new Date();
    }
    
    public boolean validateName(String inputName) {
        return inputName.matches(nameRegex);
    }
    
    public boolean validateNumber(String numberInput) {
        return numberInput.matches(numberRegex);
    }
    
    public boolean validateNameNumber(String nameNumberInput) {
        return nameNumberInput.matches(nameNumberRegex);
    }
    
    public CarProperties(String brandName, String modelName, String carCity, int carSerialNumber, int carMaxSeats, int carMinSeats, boolean carMaintenanceCertificate, int carYear, boolean isAvailable, Date timeStamp) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.carCity = carCity;
        this.carSerialNumber = carSerialNumber;
        this.carMaxSeats = carMaxSeats;
        this.carMinSeats = carMinSeats;
        this.brandName = brandName;
        this.carMaintenanceCertificate = carMaintenanceCertificate;
        this.carYear = carYear;
        this.isAvailable = isAvailable;
        this.timeStamp = timeStamp;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCarCity() {
        return carCity;
    }

    public void setCarCity(String carCity) {
        this.carCity = carCity;
    }

    public int getCarSerialNumber() {
        return carSerialNumber;
    }

    public void setCarSerialNumber(int carSerialNumber) {
        this.carSerialNumber = carSerialNumber;
    }

    public int getCarMaxSeats() {
        return carMaxSeats;
    }

    public void setCarMaxSeats(int carMaxSeats) {
        this.carMaxSeats = carMaxSeats;
    }

    public int getCarMinSeats() {
        return carMinSeats;
    }

    public void setCarMinSeats(int carMinSeats) {
        this.carMinSeats = carMinSeats;
    }

    public boolean isCarMaintenanceCertificate() {
        return carMaintenanceCertificate;
    }

    public void setCarMaintenanceCertificate(boolean carMaintenanceCertificate) {
        this.carMaintenanceCertificate = carMaintenanceCertificate;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Date getCarDate() {
        return carDate;
    }

    public void setCarDate(Date carDate) {
        this.carDate = carDate;
    }
    
    @Override
    public String toString(){
       return this.getCarSerialNumber()+" "+this.getBrandName()+" "+this.getModelName()+" "+this.getCarYear()+
               " "+this.getCarMinSeats()+" "+this.getCarMaxSeats()+" "+this.getCarCity()+" "+isAvailable()+" "+isCarMaintenanceCertificate();
    }
}
