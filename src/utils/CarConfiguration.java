/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author prath
 */
public class CarConfiguration {

    private static CarConfiguration carManager;
    private CarProperties cp = new CarProperties();
    public static List<CarProperties> carList;
    private SimpleDateFormat sdf = new SimpleDateFormat("MM-dd hh:mm");
    private Date time = cp.getTimeStamp();
    private String day = sdf.format(time);
    LocalDateTime now = LocalDateTime.now();
    Date yourDate = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());

    private CarConfiguration() {
        carList = new ArrayList<>();
        CarProperties car1 = new CarProperties("Hyundai", "Elantra", "Boston", 123, 5, 1, false, 2018, false, yourDate);
        CarProperties car2 = new CarProperties("Hyundai", "Tucson", "Boston", 234, 7, 1, true, 2020, false, yourDate);
        CarProperties car3 = new CarProperties("Hyundai", "Jetta", "New York", 132, 7, 1, true, 2019, true, yourDate);
        CarProperties car4 = new CarProperties("Honda", "City", "Boston", 124, 5, 1, true, 2021, true, yourDate);
        CarProperties car5 = new CarProperties("Honda", "Civic", "New Jersey", 221, 5, 1, true, 2020, false, yourDate);
        CarProperties car6 = new CarProperties("Honda", "CR-V", "Boston", 244, 5, 1, true, 2021, true, yourDate);
        CarProperties car7 = new CarProperties("Toyota", "Camry", "Boston", 786, 5, 1, true, 2016, true, yourDate);
        CarProperties car8 = new CarProperties("Toyota", "Corolla", "New Jersey", 785, 5, 1, true, 2017, true, yourDate);
        CarProperties car9 = new CarProperties("Tesla", "Model 3", "New York", 1234, 5, 1, true, 2021, true, yourDate);
        CarProperties car10 = new CarProperties("Tesla", "Model S", "Boston", 2234, 5, 1, true, 2020, true, yourDate);
        CarProperties car11 = new CarProperties("Chevrolet", "Spark", "Boston", 11, 4, 1, true, 2018, true, yourDate);
        CarProperties car12 = new CarProperties("Chevrolet", "Impala", "Boston", 21, 5, 1, true, 2020, true, yourDate);
        CarProperties car13 = new CarProperties("BMW", "i8", "California", 7045, 2, 1, true, 2021, true, yourDate);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
    }

    public static CarConfiguration getCarList() {
        carManager = new CarConfiguration();
        return carManager;
    }

    public static List<CarProperties> searchSerial(int serialNo) {
        List<CarProperties> toUpdateCar = new ArrayList<CarProperties>();
        for (CarProperties carProperties : carList) {
            if (carProperties.getCarSerialNumber() == serialNo) {
                toUpdateCar.add(carProperties);
            }
        }
        return toUpdateCar;
    }

}
