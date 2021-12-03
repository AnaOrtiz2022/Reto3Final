/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.repository;

import co.usa.edu.co.mintic.last.model.Reservation;
import co.usa.edu.co.mintic.last.repositoryCrud.ReservationRepositoryCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ana_o
 */
@Repository
public class ReservationRepository {
    
    @Autowired
    private ReservationRepositoryCrud reservationRepositoryCrud;
    
    public List<Reservation> getAll(){
        return (List<Reservation>) reservationRepositoryCrud.findAll();
    }
    
    /**
     *
     * @param idReservation
     * @return
     */
    public Optional<Reservation> getReservation(int idReservation){
        return reservationRepositoryCrud.findById(idReservation);
    }
    
    public Reservation save(Reservation r){
        return reservationRepositoryCrud.save(r);
    }
}
