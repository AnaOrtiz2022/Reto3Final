/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.service;

import co.usa.edu.co.mintic.last.model.Client;
import co.usa.edu.co.mintic.last.repository.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ana_o
 */

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepository;
    
    public List<Client> getAll(){
        return clientRepository.getAll();
    }
    
    public Optional<Client> getClient(Integer clientId){
        return clientRepository.getClient(clientId);
    }
    
    public Client save(Client cl){
       if(cl.getIdClient()== null){
            return clientRepository.save(cl);
       }else{
            Optional<Client> auxiliarClient = clientRepository.getClient(cl.getIdClient());
            if (auxiliarClient.isEmpty()){
                return clientRepository.save(cl);
            }else{
                return cl;
            }
        }
    }
}
