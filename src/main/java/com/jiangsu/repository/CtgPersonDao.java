package com.jiangsu.repository;



import com.jiangsu.entity.CtgPerson;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CtgPersonDao extends PagingAndSortingRepository<CtgPerson, Long> {

  public List<CtgPerson>  findByIdGreaterThan(int id);
}
