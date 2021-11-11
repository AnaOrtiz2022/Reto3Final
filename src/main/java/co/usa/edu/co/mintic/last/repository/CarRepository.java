/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.repository;


import co.usa.edu.co.mintic.last.model.Car;
import co.usa.edu.co.mintic.last.repositoryCrud.CarRepositoryCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author ana_o
 */
@Repository
public class CarRepository {
    
    @Autowired
    private CarRepositoryCrud carRepositoryCrud;
    
    public List<Car> getAll(){
        return (List<Car>) carRepositoryCrud.findAll();
    }
    
    /**
     *
     * @param idCar
     * @return
     */
    public Optional<Car> getCar(int idCar){
        return carRepositoryCrud.findById(idCar);
    }
    
    public Car save(Car c){
        return carRepositoryCrud.save(c);
    }
}
