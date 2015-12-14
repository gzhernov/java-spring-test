package com.person.domain;

import javax.persistence.*;

/**
 * Created by ПК on 13.12.2015.
 */
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name = "housnumber")
    private int housNumber;

    @Column(name = "streetname")
    private String streetName;

    @Column(name = "city")
    private String city;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHousNumber() {
        return housNumber;
    }

    public void setHousNumber(int housNumber) {
        this.housNumber = housNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
