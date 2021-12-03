/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.repository;

import co.usa.edu.co.mintic.last.model.Gama;
import co.usa.edu.co.mintic.last.repositoryCrud.GamaRepositoryCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ana_o
 */
@Repository
public class GamaRepository {
    
    @Autowired
    private GamaRepositoryCrud gamaRepositoryCrud;
    
    public List<Gama> getAll(){
        return (List<Gama>) gamaRepositoryCrud.findAll();
    }
    
    public Optional<Gama> getGama(int idGama){
        return gamaRepositoryCrud.findById(idGama);
    }
    public Gama save(Gama g){
        return gamaRepositoryCrud.save(g);
    } 
}
