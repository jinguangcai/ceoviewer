package com.jiangsu.entity;

import javax.persistence.*;

/**
 * @author lepdou 2017-06-18
 */
@Entity
@Table(name = "t_income_fenju_desc")
public class FenjuIncomeDesc {
  @Id
  @GeneratedValue
  @Column(name = "Id")
  private int id;

  @Column(name = "mon")
  private double mon ;

  @Column(name = "LOC_STATION")
  private String location;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getMon() {
    return mon;
  }

  public void setMon(double mon) {
    this.mon = mon;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "FenjuIncomeDesc{" +
            "id=" + id +
            ", mon=" + mon +
            ", location='" + location + '\'' +
            '}';
  }
}
