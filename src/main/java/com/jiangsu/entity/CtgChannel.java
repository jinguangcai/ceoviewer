package com.jiangsu.entity;

import javax.persistence.*;

/**
 * @author lepdou 2017-06-18
 */
@Entity
@Table(name = "t_num_ctg_channel")
public class CtgChannel {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private int id;


  @Column(name = "CH_NAME_S")
  private String ch_name_s;

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

  public String getCh_name_s() {
    return ch_name_s;
  }

  public void setCh_name_s(String ch_name_s) {
    this.ch_name_s = ch_name_s;
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
    return "CtgChannel{" +
            "id=" + id +
            ", ch_name_s='" + ch_name_s + '\'' +
            ", esurfing=" + esurfing +
            ", band=" + band +
            ", itv=" + itv +
            '}';
  }
}
