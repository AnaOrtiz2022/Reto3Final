/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.service;

import co.usa.edu.co.mintic.last.model.Reservation;
import co.usa.edu.co.mintic.last.repository.ReservationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ana_o
 */
@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository reservationRepository;
    
    /**
     *
     * @return
     */
    public List<Reservation> getAll(){
        return (List<Reservation>) reservationRepository.getAll();
    }
    
    public Optional<Reservation> getReservation(int idReservation){
        return reservationRepository.getReservation(idReservation);
    }
    public Reservation save(Reservation r){ 
       if(r.getIdReservation()== null){
           return reservationRepository.save(r);    
       }else{
           Optional<Reservation> auxiliarReservation = reservationRepository.getReservation(r.getIdReservation());
           if (auxiliarReservation.isEmpty()){
               return reservationRepository.save(r);
           }else{
               return r;
           }
       }
   }   
    
}
