package com.jiangsu.service;


import com.jiangsu.entity.CtgChannel;

import com.jiangsu.repository.CtgChannelDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class CtgChannelService {

  @Autowired
  private CtgChannelDao ctgChannelDao;


  public List<CtgChannel> findAllMobiles(){
    return ctgChannelDao.findByIdGreaterThan(0);
  }
/*
  public List<Sale> findAll(){
    return saleRepo.findAllByHouseExist();
  }*/

}
