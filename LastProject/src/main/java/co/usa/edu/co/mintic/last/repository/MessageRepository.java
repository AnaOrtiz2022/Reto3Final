/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.repository;

import co.usa.edu.co.mintic.last.model.Message;
import co.usa.edu.co.mintic.last.repositoryCrud.MessageRepositoryCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ana_o
 */

@Repository
public class MessageRepository {
    
    @Autowired
    private MessageRepositoryCrud messageRepositoryCrud;
    
    public List<Message> getAll(){
        return (List<Message>) messageRepositoryCrud.findAll();
    }
    
    public Optional<Message> getMessage(int idMessage){
        return messageRepositoryCrud.findById(idMessage);
    }
    
    public Message save(Message m){
        return messageRepositoryCrud.save(m);
    }
 
}