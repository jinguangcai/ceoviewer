package com.jiangsu.entity;

import javax.persistence.*;

/**
 * @author lepdou 2017-06-18
 */
@Entity
@Table(name = "t_num_fenju_high")
public class FenjuHigh {
  @Id
  @GeneratedValue
  @Column(name = "Id")
  private int id;

  @Column(name = "number")
  private String number;

  @Column(name = "LOC_STATION")
  private String location;

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "MobileOrder{" +
            "number='" + number + '\'' +
            ", location='" + location + '\'' +
            '}';
  }
}
