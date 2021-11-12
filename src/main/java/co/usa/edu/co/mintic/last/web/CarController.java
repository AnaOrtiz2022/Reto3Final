/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.web;

import co.usa.edu.co.mintic.last.model.Car;
import co.usa.edu.co.mintic.last.service.CarService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author ana_o
 */

@RestController
@RequestMapping("api/Car")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CarController {
    
    @Autowired
    private CarService carService;
    
    //Get 

    /**
     *
     * @return
     */
    @GetMapping ("/all")
    public List<Car> getCar(){
        return carService.getAll();
    }
    
    //Get by ID

    /**
     *
     * @param idCar
     * @return
     */
    @GetMapping("/{id}")
    public Optional<Car> getCar(@PathVariable ("id") int idCar){
        return carService.getCar(idCar);
    }
    
    //Post 

    /**
     *
     * @param c
     * @return
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Car save(@RequestBody Car c){
        return carService.save(c);
    }
}

