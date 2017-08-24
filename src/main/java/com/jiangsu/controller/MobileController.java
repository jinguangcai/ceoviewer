package com.jiangsu.controller;


import com.jiangsu.entity.*;
import com.jiangsu.service.*;
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

    @Autowired
    private FenjuHighService fenjuHighService;

    @Autowired
    private CtgChannelService ctgChannelService;

    @Autowired
    private CtgPersonService ctgPersonService;

    @Autowired
    private IncomeCtgPersonService incomeCtgPersonService;

    @Autowired
    private ResultCeoService resultCeoService;

    @Autowired
    private ImportantTaskService importantTaskService;

  @Autowired
  private FenjuHighDescService fenjuHighDescService;
  @Autowired
  private  FenjuNumDescService fenjuNumDescService;

    @RequestMapping(value = "/mobile", method = RequestMethod.GET)
  public List<MobileOrder> test(){
//   List<MobileOrder> mobileOrders = mobileService.findMobiles(1);
   List<MobileOrder> mobileOrders = mobileService.findAllMobiles();
    return mobileOrders;
  }

  @RequestMapping(value = "/fenjuHigh", method = RequestMethod.GET)
  public List<FenjuHigh> getFenjuHigh(){
    return fenjuHighService.findAllMobiles();
  }

  @RequestMapping(value = "/ctgChannel", method = RequestMethod.GET)
  public List<CtgChannel> getCtgChannel() {
    return ctgChannelService.findAllMobiles();
  }

  @RequestMapping(value = "/ctgPerson", method = RequestMethod.GET)
  public List<CtgPerson> getCtgPerson(){
      return ctgPersonService.findAllMobiles();
  }

    @RequestMapping(value = "/incomeCtgPerson", method = RequestMethod.GET)
    public List<IncomeCtgPerson> getIncomeCtgPerson() {
        return incomeCtgPersonService.findAllMobiles();
    }

    @RequestMapping(value = "/resultCeo", method = RequestMethod.GET)
    public List<ResultCeo> getResultCeo(){
        return resultCeoService.findAllMobiles();
    }

  @RequestMapping(value = "/importantTask", method = RequestMethod.GET)
  public List<ImportantTask> getImportantTask(){
    return importantTaskService.findAllImportantTasks();
  }

  @RequestMapping(value = "/fenjuHighDesc", method = RequestMethod.GET)
  public List<FenjuHighDesc> getFenjuHighDesc(){
    return fenjuHighDescService.findAllMobiles();
  }

  @RequestMapping(value = "/fenjunNumDesc", method = RequestMethod.GET)
  public List<FenjuNumDesc> getFenjuNumDesc(){
    return fenjuNumDescService.findAllMobiles();
  }

}
