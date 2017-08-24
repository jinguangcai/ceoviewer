package com.jiangsu.entity;

import javax.persistence.*;

/**
 * @author lepdou 2017-06-18
 */
@Entity
@Table(name = "t_result_ceo")
public class ResultCeo {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private int id;


  @Column(name = "loc_station")
  private String loc_station;

  @Column(name = "result")
  private double result;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLoc_station() {
    return loc_station;
  }

  public void setLoc_station(String loc_station) {
    this.loc_station = loc_station;
  }

  public double getResult() {
    return result;
  }

  public void setResult(double result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "ResultCeo{" +
            "id=" + id +
            ", loc_station='" + loc_station + '\'' +
            ", result=" + result +
            '}';
  }

}
