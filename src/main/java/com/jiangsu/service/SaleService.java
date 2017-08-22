package com.jiangsu.service;


import com.jiangsu.entity.Sale;
import com.jiangsu.repository.SaleRepo;
import com.jiangsu.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class SaleService {

  @Autowired
  private SaleRepo saleRepo;

  @Transactional
  public void save(List<Sale> sales) {
    String createDate = sales.get(0).getCreateDate();
    saleRepo.deleteByCreateDate(createDate);

    saleRepo.save(sales);
  }

  public List<Sale> find(String house, int offset) {
    String beginDate = DateUtils.getDateOffset(-offset);
    return saleRepo.findByHouseAndCreateDateAfterOrderByCreateDate(house, beginDate);
  }
}
