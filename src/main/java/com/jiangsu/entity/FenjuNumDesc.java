package com.jiangsu.entity;

import javax.persistence.*;

/**
 * @author lepdou 2017-06-18
 */
@Entity
@Table(name = "t_num_fenju_desc")
public class FenjuNumDesc {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;

    @Column(name = "LOC_STATION")
    private String location;

    @Column(name = "number")
    private String number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "FenjuNumDesc{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
