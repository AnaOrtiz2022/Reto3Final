/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author ana_o
 */
@Entity
@Table(name = "score")

public class Score implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idScore;
    private Integer score;
    private String textScore;
    
    @OneToOne
    private Reservation reservations;

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getTextScore() {
        return textScore;
    }

    public void setTextScore(String textScore) {
        this.textScore = textScore;
    }

    public Reservation getReservation() {
        return reservations;
    }

    public void setReservation(Reservation reservations) {
        this.reservations = reservations;
    }      
}
