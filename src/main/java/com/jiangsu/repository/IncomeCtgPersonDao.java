package com.jiangsu.repository;




import com.jiangsu.entity.IncomeCtgPerson;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IncomeCtgPersonDao extends PagingAndSortingRepository<IncomeCtgPerson, Long> {

  public List<IncomeCtgPerson>  findByIdGreaterThan(int id);
}
