package com.jiangsu.entity;

import javax.persistence.*;

/**
 * @author lepdou 2017-06-18
 */
@Entity
@Table(name = "t_income_fenju_desc")
public class FenjuHighDesc {
  @Id
  @GeneratedValue
  @Column(name = "Id")
  private int id;

  @Column(name = "mon")
  private double mon ;

  @Column(name = "LOC_STATION")
  private String loc_station;

  public double getMon() {
    return mon;
  }

  public void setMon(double mon) {
    this.mon = mon;
  }

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

  @Override
  public String toString() {
    return "FenjuHighDesc{" +
            "id=" + id +
            ", mon=" + mon +
            ", loc_station='" + loc_station + '\'' +
            '}';
  }
}
