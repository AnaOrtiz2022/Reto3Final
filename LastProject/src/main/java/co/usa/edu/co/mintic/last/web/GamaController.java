/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.web;

import co.usa.edu.co.mintic.last.model.Gama;
import co.usa.edu.co.mintic.last.service.GamaService;
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
@RequestMapping("api/Gama")
@CrossOrigin (origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class GamaController {
    
    @Autowired
    private GamaService gamaService;
    
    //Get
    @GetMapping ("/all")
    public List<Gama> getGama(){
        return gamaService.getAll();
    }
    
    // Get by ID

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<Gama> getGama(@PathVariable ("id") int id){
        return gamaService.getGama(id);
    }
    
    //Post
    @PostMapping ("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Gama save(@RequestBody Gama g){
        return gamaService.save(g);
    }
}
