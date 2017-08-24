package com.jiangsu.entity;

import javax.persistence.*;

/**
 * @author lepdou 2017-06-18
 */
@Entity
@Table(name = "t_num_ctg_person")
public class CtgPerson {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private int id;


  @Column(name = "cross_sale_peo")
  private String cross_sale_peo;

  @Column(name = "esurfing")
  private int esurfing;

  @Column(name = "band")
  private int band;

  @Column(name = "itv")
  private int itv;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCross_sale_peo() {
    return cross_sale_peo;
  }

  public void setCross_sale_peo(String cross_sale_peo) {
    this.cross_sale_peo = cross_sale_peo;
  }

  public int getEsurfing() {
    return esurfing;
  }

  public void setEsurfing(int esurfing) {
    this.esurfing = esurfing;
  }

  public int getBand() {
    return band;
  }

  public void setBand(int band) {
    this.band = band;
  }

  public int getItv() {
    return itv;
  }

  public void setItv(int itv) {
    this.itv = itv;
  }

  @Override
  public String toString() {
    return "CtgPerson{" +
            "id=" + id +
            ", cross_sale_peo='" + cross_sale_peo + '\'' +
            ", esurfing=" + esurfing +
            ", band=" + band +
            ", itv=" + itv +
            '}';
  }

}
