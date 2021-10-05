/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class CarManager {
    
    private static CarManager carManager;
    public static List<CarProperties> carList;
    
    private CarManager () {
        carList = new ArrayList<>();
        CarProperties car1 = new CarProperties("Hyundai", "Elantra", "Boston", 123, 5, 1, false, 2018, true);
        CarProperties car2 = new CarProperties("Hyundai", "Tucson", "Boston", 234, 7, 1, true, 2020, true);
        CarProperties car3 = new CarProperties("Hyundai", "Jetta", "New York", 132, 7, 1, true, 2019, true);
        CarProperties car4 = new CarProperties("Honda", "City", "Boston", 124, 5, 1, true, 2021, true);
        CarProperties car5 = new CarProperties("Honda", "Civic", "New Jersey", 221, 5, 1, true, 2020, false);
        CarProperties car6 = new CarProperties("Honda", "CR-V", "Boston", 244, 5, 1, true, 2021, true);
        CarProperties car7 = new CarProperties("Toyota", "Camry", "Boston", 786, 5, 1, true, 2016, true);
        CarProperties car8 = new CarProperties("Toyota", "Corolla", "New Jersey", 785, 5, 1, true, 2017, true);
        CarProperties car9 = new CarProperties("Tesla", "Model 3", "New York", 1234, 5, 1, true, 2021, true);
        CarProperties car10 = new CarProperties("Tesla", "Model S", "Boston", 2234, 5, 1, true, 2020, true);
        CarProperties car11 = new CarProperties("Chevrolet", "Spark", "Boston", 11, 4, 1, true, 2018, true);
        CarProperties car12 = new CarProperties("Chevrolet", "Impala", "Boston", 21, 5, 1, true, 2020, true);
        CarProperties car13 = new CarProperties("BMW", "i8", "California", 7045, 2, 1, true, 2021, true);
        
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
    }
    
    public static CarManager getCarList() {
        carManager = new CarManager();
        return carManager;
    }

    public static List<CarProperties> searchModel(String modelName){
        List<CarProperties> toUpdateCar = new ArrayList<CarProperties>();
        for (CarProperties carProperties: carList) {
            if(carProperties.getModelName() == null ? modelName == null : carProperties.getModelName().equals(modelName)){
                toUpdateCar.add(carProperties);
            } 
        }
        return toUpdateCar;
    }
    
    
}
