/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.repository;

import co.usa.edu.co.mintic.last.model.Client;
import co.usa.edu.co.mintic.last.repositoryCrud.ClientRepositoryCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ana_o
 */
@Repository
public class ClientRepository {
    
    @Autowired
    private ClientRepositoryCrud clientRepositoryCrud;
    
    /**
     * 
     * @return 
     */
    public List<Client> getAll(){
        return (List<Client>) clientRepositoryCrud.findAll();
    }
    
    /**
     * 
     * @param clientId
     * @return 
     */
    public Optional<Client> getClient (int clientId){
        return clientRepositoryCrud.findById(clientId);
    }
    
    /**
     * 
     * @param cl
     * @return 
     */
    public Client save (Client cl){
            return clientRepositoryCrud.save(cl);
    }
}