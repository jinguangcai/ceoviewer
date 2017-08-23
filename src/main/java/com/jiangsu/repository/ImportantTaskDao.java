package com.jiangsu.repository;


import com.jiangsu.entity.ImportantTask;
import com.jiangsu.entity.MobileOrder;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ImportantTaskDao extends PagingAndSortingRepository<ImportantTask, Long> {

  public List<ImportantTask> findByIdGreaterThan(int id);

}
