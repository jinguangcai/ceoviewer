package com.jiangsu.entity;

import javax.persistence.*;

/**
 * @author jinguangcai 2017-06-18
 */
@Entity
@Table(name = "t_result_importanttask")
public class ImportantTask {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private int id;


  @Column(name = "loc_station")
  private String location;

  @Column(name = "result")
  private double result;

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

  public double getResult() {
    return result;
  }

  public void setResult(double result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "ImportantTask{" +
            "id=" + id +
            ", location='" + location + '\'' +
            ", result=" + result +
            '}';
  }
}
