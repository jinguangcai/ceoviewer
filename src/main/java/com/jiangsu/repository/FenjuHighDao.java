package com.jiangsu.repository;


import com.jiangsu.entity.FenjuHigh;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FenjuHighDao extends PagingAndSortingRepository<FenjuHigh, Long> {

  public List<FenjuHigh> findByIdGreaterThan(int id);
}
