package com.jiangsu.controller;


import com.jiangsu.entity.CtgChannel;
import com.jiangsu.entity.FenjuHigh;
import com.jiangsu.entity.ImportantTask;
import com.jiangsu.entity.MobileOrder;
import com.jiangsu.service.CtgChannelService;
import com.jiangsu.service.FenjuHighService;
import com.jiangsu.service.ImportantTaskService;
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

    @Autowired
    private FenjuHighService fenjuHighService;

    @Autowired
    private CtgChannelService ctgChannelService;

    @Autowired
    private ImportantTaskService importantTaskService;

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

  @RequestMapping(value = "/importantTask", method = RequestMethod.GET)
  public List<ImportantTask> getImportantTask(){
    return importantTaskService.findAllImportantTasks();
  }

}
