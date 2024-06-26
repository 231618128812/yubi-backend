package com.rainbow.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainbow.springbootinit.mapper.ChartMapper;
import com.rainbow.springbootinit.model.entity.Chart;
import com.rainbow.springbootinit.service.ChartService;
import org.springframework.stereotype.Service;


@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart> implements ChartService {

}




