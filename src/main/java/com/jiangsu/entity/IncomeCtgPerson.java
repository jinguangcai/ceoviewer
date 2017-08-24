package com.jiangsu.entity;

import javax.persistence.*;

/**
 * @author lepdou 2017-06-18
 */
@Entity
@Table(name = "t_income_ctg_person")
public class IncomeCtgPerson {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private int id;


  @Column(name = "cross_sale_peo")
  private String cross_sale_peo;

  @Column(name = "mon")
  private double mon;

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

  public double getMon() {
    return mon;
  }

  public void setMon(double mon) {
    this.mon = mon;
  }

  @Override
  public String toString() {
    return "IncomeCtgPerson{" +
            "id=" + id +
            ", cross_sale_peo='" + cross_sale_peo + '\'' +
            ", mon=" + mon +
            '}';
  }
}
