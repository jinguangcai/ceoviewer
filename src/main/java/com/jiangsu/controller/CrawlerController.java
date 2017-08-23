package com.jiangsu.controller;


import com.jiangsu.crawler.Crawler;
import com.jiangsu.entity.Sale;
import com.jiangsu.service.SaleService;
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
public class CrawlerController {

  @Autowired
  private Crawler crawler;
  @Autowired
  private SaleService saleService;

  @RequestMapping(value = "/crawler", method = RequestMethod.GET)
  public String crawler() {
    try {
      crawler.run();
      return "Crawler success";
    } catch (Exception e) {
      return "Crawler failed";
    }
  }

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public List<Sale> test(){
    List<Sale> sales = saleService.find("主城区",1);
    for(Sale sale:sales){
      System.out.print(sale);
    }
    return sales;
  }
}
