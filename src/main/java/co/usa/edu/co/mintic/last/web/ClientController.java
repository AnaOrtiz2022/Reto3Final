/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.web;

import co.usa.edu.co.mintic.last.model.Client;
import co.usa.edu.co.mintic.last.service.ClientService;
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
@RequestMapping("api/Client")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ClientController {
    @Autowired
    private ClientService clientService;
    
    //Get 
    @GetMapping ("/all")
    public List<Client> getClient(){
        return clientService.getAll();
    }
    
    //Get by ID

    /**
     *
     * @param clientId
     * @return
     */
    @GetMapping("/{clientId}")
    public Optional<Client> getCar(@PathVariable ("clientId") int clientId){
        return clientService.getClient(clientId);
    }
    
    //Post 

    /**
     *
     * @param cl
     * @return
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client cl){
        return clientService.save(cl);
    }
}
