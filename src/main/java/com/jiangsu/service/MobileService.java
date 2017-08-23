package com.jiangsu.service;


import com.jiangsu.entity.MobileOrder;
import com.jiangsu.repository.MobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class MobileService {

  @Autowired
  private MobileRepo mobileRepo;

  public List<MobileOrder> findMobiles(int id){
    return mobileRepo.findByIdOrderByNumber(id);
  }

  public List<MobileOrder> findAllMobiles(){
    return mobileRepo.findByIdGreaterThan(0);
  }
/*
  public List<Sale> findAll(){
    return saleRepo.findAllByHouseExist();
  }*/

}
