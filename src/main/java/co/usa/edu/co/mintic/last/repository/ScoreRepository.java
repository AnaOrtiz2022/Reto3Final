/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.repository;

import co.usa.edu.co.mintic.last.model.Score;
import co.usa.edu.co.mintic.last.repositoryCrud.ScoreRepositoryCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ana_o
 */
@Repository
public class ScoreRepository {
    @Autowired
    private ScoreRepositoryCrud scoreRepositoryCrud;
    
    public List<Score> getAll(){
        return (List<Score>) scoreRepositoryCrud.findAll();
    }
    public Optional <Score> getScore(int id){
        return scoreRepositoryCrud.findById(id);
    }
    
    public Score save(Score score){
        return scoreRepositoryCrud.save(score);
    } 
}
