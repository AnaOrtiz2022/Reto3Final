/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.web;

import co.usa.edu.co.mintic.last.model.Reservation;
import co.usa.edu.co.mintic.last.service.ReservationService;
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
@RequestMapping("api/Reservation")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ReservationController {
    
    @Autowired
    private ReservationService reservationService;
    
    //Get 
    @GetMapping ("/all")
    public List<Reservation> getReservation(){
        return reservationService.getAll();
    }
    
    //Get by ID

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<Reservation> getReservation(@PathVariable ("id") int id){
        return reservationService.getReservation(id);
    }
    
    //Post 

    /**
     *
     * @param r
     * @return
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation r){
        return reservationService.save(r);
    }
    
}
