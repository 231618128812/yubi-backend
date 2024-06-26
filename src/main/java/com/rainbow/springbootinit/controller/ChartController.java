package com.rainbow.springbootinit.controller;

import com.rainbow.springbootinit.model.dto.chart.ChartAddRequest;
import com.rainbow.springbootinit.model.entity.Chart;
import com.rainbow.springbootinit.service.ChartService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController // @responseBody + @controller
@RequestMapping("chart")
public class ChartController {

    @Resource
    private ChartService chartService;

    /**
     * 同步生成controller
     */
    @PostMapping("gen")
    public void gen(@RequestPart("file") MultipartFile multipartFile,
                    ChartAddRequest chartAddRequest, HttpServletRequest request){
    }
}
