/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.co.mintic.last.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author ana_o
 */
@Entity
@Table(name = "gama")
public class Gama implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGama;
    private String gamaName;
    private String gamaDescription;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="gama")
    @JsonIgnoreProperties("gama")
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    
    public Integer getIdGama() {
        return idGama;
    }
    
    public void setIdGama(Integer idGama) {
        this.idGama = idGama;
    }


    public String getGamaName() {
        return gamaName;
    }

    public void setGamaName(String gamaName) {
        this.gamaName = gamaName;
    }

    public String getGamaDescription() {
        return gamaDescription;
    }

    public void setGamaDescription(String gamaDescription) {
        this.gamaDescription = gamaDescription;
    }
}