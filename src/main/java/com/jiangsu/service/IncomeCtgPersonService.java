package com.jiangsu.service;



import com.jiangsu.entity.IncomeCtgPerson;

import com.jiangsu.repository.IncomeCtgPersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class IncomeCtgPersonService {

  @Autowired
  private IncomeCtgPersonDao incomeCtgPersonDao;


  public List<IncomeCtgPerson> findAllMobiles(){
    return incomeCtgPersonDao.findByIdGreaterThan(0);
  }
/*
  public List<Sale> findAll(){
    return saleRepo.findAllByHouseExist();
  }*/

}
