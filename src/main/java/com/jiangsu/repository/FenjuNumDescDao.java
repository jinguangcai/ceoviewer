package com.jiangsu.repository;


import com.jiangsu.entity.FenjuNumDesc;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FenjuNumDescDao extends PagingAndSortingRepository<FenjuNumDesc, Long> {

  public List<FenjuNumDesc> findByIdGreaterThan(int id);
  public List<FenjuNumDesc> findByLocationIsLike(String location);
}
