/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.service;

import co.usa.edu.co.mintic.last.model.Gama;
import co.usa.edu.co.mintic.last.repository.GamaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ana_o
 */
@Service
public class GamaService {
        
    @Autowired
    private GamaRepository gamaRepository;
    
    public List<Gama> getAll(){
        return (List<Gama>) gamaRepository.getAll();
    }
    
    public Optional<Gama> getGama(int idGama){
            return gamaRepository.getGama(idGama);
        }
    public Gama save (Gama g){
        if (g.getIdGama()==null){
            return gamaRepository.save(g);
        }else{
            Optional<Gama> gamaAuxiliar = gamaRepository.getGama(g.getIdGama());
            if (gamaAuxiliar.isEmpty()){
                return gamaRepository.save(g);
            }else{
                return g;
            }
        }
    }
}
