package com.jiangsu.service;


import com.jiangsu.entity.FenjuHighDesc;
import com.jiangsu.entity.FenjuIncomeDesc;
import com.jiangsu.repository.FenjuHighDescDao;
import com.jiangsu.repository.FenjuIncomeDescDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class FenjuIncomeDescService {

  @Autowired
  private FenjuIncomeDescDao fenjuIncomeDescDao;


  public List<FenjuIncomeDesc> findFenjuIncomes(){
    return fenjuIncomeDescDao.findByIdGreaterThan(0);
  }
/*
  public List<Sale> findAll(){
    return saleRepo.findAllByHouseExist();
  }*/

}
