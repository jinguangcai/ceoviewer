package com.jiangsu.controller;


import com.jiangsu.entity.Sale;
import com.jiangsu.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@RestController
public class SaleController {

  @Autowired
  private SaleService saleService;

  @RequestMapping(value = "/sales", method = RequestMethod.GET)
  public List<Sale> querySales(@RequestParam String house,
                               @RequestParam int offset) {
    return saleService.find(house, offset);
  }

}
