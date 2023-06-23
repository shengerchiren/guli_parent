package com.liaoyu.service_edu.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 讲师
 * </p>
 *
 * @author liaoyu
 * @since 2023-06-14
 */
@Data
@TableName("edu_teacher")
@ApiModel(value = "EduTeacher对象", description = "讲师")
public class EduTeacher implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("讲师ID")
        private String id;

      @ApiModelProperty("讲师姓名")
      private String name;

      @ApiModelProperty("讲师简介")
      private String intro;

      @ApiModelProperty("讲师资历,一句话说明讲师")
      private String career;

      @ApiModelProperty("头衔 1高级讲师 2首席讲师")
      private Integer level;

      @ApiModelProperty("讲师头像")
      private String avatar;

      @ApiModelProperty("排序")
      private Integer sort;

      @ApiModelProperty("逻辑删除 1（true）已删除， 0（false）未删除")
      @TableLogic
      private Byte isDeleted;

      @ApiModelProperty("创建时间")
      private LocalDateTime gmtCreate;

      @ApiModelProperty("更新时间")
      private LocalDateTime gmtModified;
}
