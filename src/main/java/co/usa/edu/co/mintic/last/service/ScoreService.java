/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.service;

import co.usa.edu.co.mintic.last.model.Score;
import co.usa.edu.co.mintic.last.repository.ScoreRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ana_o
 */
public class ScoreService {
        
    @Autowired
    private ScoreRepository scoreRepository;
    
    public List<Score> getAll(){
        return scoreRepository.getAll();
    }
    
    /**
     *
     * @param idScore
     * @return
     */
    public Optional<Score> getScore(Integer idScore){
            return scoreRepository.getScore(idScore);
        }
    public Score save (Score s){
        if (s.getIdScore()==null){
            return scoreRepository.save(s);
        }else{
            Optional<Score> scoreAuxiliar = scoreRepository.getScore(s.getIdScore());
            if (scoreAuxiliar.isEmpty()){
                return scoreRepository.save(s);
            }else{
                return s;
            }
        }
    }
}