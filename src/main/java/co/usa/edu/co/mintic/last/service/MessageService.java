/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.service;

import co.usa.edu.co.mintic.last.model.Message;
import co.usa.edu.co.mintic.last.repository.MessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ana_o
 */
@Service
public class MessageService {
    
    @Autowired
    private MessageRepository messageRepository;
    
    public List<Message> getAll(){
        return messageRepository.getAll();
    }
    
    /**
     *
     * @param idMessage
     * @return
     */
    public Optional<Message> getMessage(Integer idMessage){
        return messageRepository.getMessage(idMessage);
    }
    
    public Message save(Message m){
        if (m.getIdMessage()==null){
            return messageRepository.save(m);
        }else{
            Optional<Message> auxiliarMessage = messageRepository.getMessage(m.getIdMessage());
            if (auxiliarMessage.isEmpty()){
                return messageRepository.save(m);
            }else{
                return m;
            }
        }
    }  
}
