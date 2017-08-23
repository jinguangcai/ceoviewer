package com.jiangsu.repository;


import com.jiangsu.entity.MobileOrder;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface MobileRepo extends PagingAndSortingRepository<MobileOrder, Long> {

  public List<MobileOrder> findByIdOrderByNumber(int id);
  public List<MobileOrder> findByIdGreaterThan(int id);

}
