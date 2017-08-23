package com.jiangsu.repository;


import com.jiangsu.entity.CtgChannel;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CtgChannelDao extends PagingAndSortingRepository<CtgChannel, Long> {

  public List<CtgChannel> findByIdGreaterThan(int id);
}
