/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.web;

import co.usa.edu.co.mintic.last.model.Score;
import co.usa.edu.co.mintic.last.service.ScoreService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author ana_o
 */
public class ScoreController {
    
    @Autowired
    private ScoreService scoreService;
    
    //Get 
    @GetMapping ("/all")
    public List<Score> getReservation(){
        return scoreService.getAll();
    }
    
    //Get by ID

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<Score> getReservation(@PathVariable ("id") int id){
        return scoreService.getScore(id);
    }
    
    //Post 

    /**
     *
     * @param s
     * @return
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score save(@RequestBody Score s){
        return scoreService.save(s);
    }
    
}
