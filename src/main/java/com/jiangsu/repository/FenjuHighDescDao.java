package com.jiangsu.repository;



import com.jiangsu.entity.CtgPerson;
import com.jiangsu.entity.FenjuHighDesc;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FenjuHighDescDao extends PagingAndSortingRepository<FenjuHighDesc, Long> {

  public List<FenjuHighDesc>  findByIdGreaterThan(int id);
}
