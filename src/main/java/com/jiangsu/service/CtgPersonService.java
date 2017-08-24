package com.jiangsu.service;


import com.jiangsu.entity.CtgChannel;
import com.jiangsu.entity.CtgPerson;
import com.jiangsu.repository.CtgChannelDao;
import com.jiangsu.repository.CtgPersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class CtgPersonService {

  @Autowired
  private CtgPersonDao ctgPersonDao;


  public List<CtgPerson> findAllMobiles(){
    return ctgPersonDao.findByIdGreaterThan(0);
  }
/*
  public List<Sale> findAll(){
    return saleRepo.findAllByHouseExist();
  }*/

}
