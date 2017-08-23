package com.jiangsu.service;


import com.jiangsu.entity.FenjuHigh;
import com.jiangsu.entity.MobileOrder;
import com.jiangsu.repository.FenjuHighDao;
import com.jiangsu.repository.MobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class FenjuHighService {

  @Autowired
  private FenjuHighDao fenjuHighDao;


  public List<FenjuHigh> findAllMobiles(){
    return fenjuHighDao.findByIdGreaterThan(0);
  }
/*
  public List<Sale> findAll(){
    return saleRepo.findAllByHouseExist();
  }*/

}
