/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.usa.edu.co.mintic.last.repositoryCrud;

import co.usa.edu.co.mintic.last.model.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ana_o
 */
public interface MessageRepositoryCrud extends CrudRepository<Message, Integer>{
    
}
