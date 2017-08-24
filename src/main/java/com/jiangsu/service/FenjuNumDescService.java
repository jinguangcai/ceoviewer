package com.jiangsu.service;


import com.jiangsu.entity.FenjuHigh;
import com.jiangsu.entity.FenjuNumDesc;
import com.jiangsu.repository.FenjuHighDao;
import com.jiangsu.repository.FenjuNumDescDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class FenjuNumDescService {

  @Autowired
  private FenjuNumDescDao fenjuNumDescDao;


  public List<FenjuNumDesc> findAllMobiles(){
    return fenjuNumDescDao.findByIdGreaterThan(0);
  }
/*
  public List<Sale> findAll(){
    return saleRepo.findAllByHouseExist();
  }*/

}
