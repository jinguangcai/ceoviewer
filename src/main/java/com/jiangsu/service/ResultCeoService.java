package com.jiangsu.service;


import com.jiangsu.entity.CtgPerson;
import com.jiangsu.entity.ResultCeo;
import com.jiangsu.repository.CtgPersonDao;
import com.jiangsu.repository.ResultCeoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class ResultCeoService {

  @Autowired
  private ResultCeoDao resultCeoDao;


  public List<ResultCeo> findAllMobiles(){
    return resultCeoDao.findByIdGreaterThan(0);
  }
/*
  public List<Sale> findAll(){
    return saleRepo.findAllByHouseExist();
  }*/

}
