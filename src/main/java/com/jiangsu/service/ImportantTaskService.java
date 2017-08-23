package com.jiangsu.service;


import com.jiangsu.entity.ImportantTask;
import com.jiangsu.repository.ImportantTaskDao;
import com.jiangsu.repository.MobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinguangcai 2017-06-18
 */
@Service
public class ImportantTaskService {

  @Autowired
  private ImportantTaskDao importantTaskDao;


  public List<ImportantTask> findAllImportantTasks(){
    return importantTaskDao.findByIdGreaterThan(0);
  }

/*
  public List<Sale> findAll(){
    return saleRepo.findAllByHouseExist();
  }*/

}
