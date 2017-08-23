package com.jiangsu.controller;


import com.jiangsu.entity.MobileOrder;
import com.jiangsu.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author lepdou 2017-06-18
 */
@RestController
@CrossOrigin
public class MobileController {

  @Autowired
  private MobileService mobileService;


  @RequestMapping(value = "/mobile", method = RequestMethod.GET)
  public List<MobileOrder> test(){
   List<MobileOrder> mobileOrders = mobileService.findMobiles(1);

    return mobileOrders;
  }
}
