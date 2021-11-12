/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.web;
import co.usa.edu.co.mintic.last.model.Message;
import co.usa.edu.co.mintic.last.service.MessageService;
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
@RequestMapping("api/Message")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class MessageController {
    
    @Autowired
    private MessageService messageService;
    
    //Get 
    @GetMapping ("/all")
    public List<Message> getClient(){
        return messageService.getAll();
    }
    
    //Get by ID

    /**
     *
     * @param messageId
     * @return
     */
    @GetMapping("/{id}")
    public Optional<Message> getCar(@PathVariable ("id") int id){
        return messageService.getMessage(id);
    }
    
    //Post 

    /**
     *
     * @param cl
     * @return
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message cl){
        return messageService.save(cl);
    }
    
}
