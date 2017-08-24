package com.jiangsu.repository;



import com.jiangsu.entity.FenjuIncomeDesc;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FenjuIncomeDescDao extends PagingAndSortingRepository<FenjuIncomeDesc, Long> {

  public List<FenjuIncomeDesc>  findByIdGreaterThan(int id);
}
