package com.jiangsu.repository;



import com.jiangsu.entity.CtgPerson;
import com.jiangsu.entity.ResultCeo;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ResultCeoDao extends PagingAndSortingRepository<ResultCeo, Long> {

  public List<ResultCeo>  findByIdGreaterThan(int id);
}
