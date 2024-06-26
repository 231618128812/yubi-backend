package com.rainbow.springbootinit.model.dto.chart;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class ChartAddRequest {
    /**
     * 图表名称
     */
    @NotBlank(message="[图表名称]不能为空")
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("图表名称")
    private String name;
    /**
     * 图表类型
     */
    @NotBlank(message="[图表类型]不能为空")
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("图表类型")
    private String chartType;
    /**
     * 分析目标
     */
    @NotBlank(message="[分析目标]不能为空")
    @Size(max= 1024,message="编码长度不能超过1024")
    @ApiModelProperty("分析目标")
    private String goal;
}
