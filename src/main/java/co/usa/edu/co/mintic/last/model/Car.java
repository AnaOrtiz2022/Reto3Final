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
@Table(name = "car")
public class Car implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    /*
    Indica id
    */
    private Integer idCar;

    private String name;
    
    private String brand;
    /*
    Indica year
    */
    private Integer year;
    /*
    Indica category
    */
    private String description;
    
    @ManyToOne
    @JoinColumn(name ="idGama")
    @JsonIgnoreProperties("cars")
    /*
    indica gama
    */
    private Gama gama;
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="car")
    @JsonIgnoreProperties({"car" , "client"})
    
    private List<Message> messages;
    
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="car")
    @JsonIgnoreProperties({"car" , "client"})
    /*
    Lista message
    */
    private List<Reservation> reservations;

    
    public List<Message> getMessage() {
        return messages;
    }

    public void setMessage(List<Message> message) {
        this.messages = message;
    }

    /*
    LISTA RESERVATION
    */
    public List<Reservation> getReservation() {
        return reservations;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservations = reservations;
    }
    
    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Gama getGama() {
        return gama;
    }
    
    public void setGama(Gama gama) {
        this.gama = gama;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
