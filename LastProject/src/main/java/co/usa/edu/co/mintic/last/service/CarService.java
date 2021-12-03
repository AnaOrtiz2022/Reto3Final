/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.service;

import co.usa.edu.co.mintic.last.model.Car;
import co.usa.edu.co.mintic.last.repository.CarRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ana_o
 */

@Service
public class CarService {
    
    @Autowired
    private CarRepository carRepository;
    
    /**
     *
     * @return
     */
    public List<Car> getAll(){
        return carRepository.getAll();
    }
    
    public Optional<Car> getCar(Integer idCar){
        return carRepository.getCar(idCar);
    }
    public Car save(Car c){ 
        if (c.getIdCar() == null){
           return carRepository.save(c);    
        }else{
           Optional<Car> auxiliarCar = carRepository.getCar(c.getIdCar());
            if (auxiliarCar.isEmpty()){
               return carRepository.save(c);
            }else{
               return c;
            }    
        }
    }   
}

