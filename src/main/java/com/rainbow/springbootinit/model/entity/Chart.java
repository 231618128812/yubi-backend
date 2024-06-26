package com.rainbow.springbootinit.model.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 图表表
*/
@Data
public class Chart implements Serializable {

    /**
    * id
    */
    @ApiModelProperty("id")
    private Long id;
    /**
    * 创建的用户id
    */
    @ApiModelProperty("创建的用户id")
    private Long userId;
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
    /**
    * AI生成的图表代码
    */
    @Size(max= -1,message="编码长度不能超过-1")
    @ApiModelProperty("AI生成的图表代码")
    private String genChart;
    /**
    * AI生产的图表结论
    */
    @Size(max= -1,message="编码长度不能超过-1")
    @ApiModelProperty("AI生产的图表结论")
    private String genResult;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private Date updateTime;
    /**
    * 逻辑删除(0-表示正常,1-表示删除)
    */
    @ApiModelProperty("逻辑删除(0-表示正常,1-表示删除)")
    private String delFlag;


}
