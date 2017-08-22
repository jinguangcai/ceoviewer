package com.jiangsu.repository;


import com.jiangsu.entity.Sale;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface SaleRepo extends PagingAndSortingRepository<Sale, Long> {

  void deleteByCreateDate(String createDate);

  List<Sale> findByHouseAndCreateDateAfterOrderByCreateDate(String house, String date);
}
