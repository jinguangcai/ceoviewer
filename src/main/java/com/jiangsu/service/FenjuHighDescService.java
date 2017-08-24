package com.jiangsu.service;


import com.jiangsu.entity.CtgPerson;
import com.jiangsu.entity.FenjuHighDesc;
import com.jiangsu.repository.CtgPersonDao;
import com.jiangsu.repository.FenjuHighDescDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class FenjuHighDescService {

  @Autowired
  private FenjuHighDescDao fenjuHgihDescDao;


  public List<FenjuHighDesc> findAllMobiles(){
    return fenjuHgihDescDao.findByIdGreaterThan(0);
  }
/*
  public List<Sale> findAll(){
    return saleRepo.findAllByHouseExist();
  }*/

}
