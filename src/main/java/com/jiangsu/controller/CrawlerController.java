package com.jiangsu.controller;


import com.jiangsu.crawler.Crawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author lepdou 2017-06-18
 */
@RestController
public class CrawlerController {

  @Autowired
  private Crawler crawler;

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
  public String test(){
    return "hello world...";
  }
}
