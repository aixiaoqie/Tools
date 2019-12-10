package com.run.ent.generate.gp;

import java.io.Serializable;
import java.math.BigDecimal;

import java.util.*;

import com.run.ent.base.BaseEnt;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;


/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/29 12:00:28
 * @description 实体类GpStationGenEnt，自动生成。岗位。
 */

public class GpStationGenEnt extends BaseEnt implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value="记录创建时间。",hidden=false,required=false)
    private Date addTime;
    @ApiModelProperty(value="主键。",hidden=false,required=true)
    private String id;
    @ApiModelProperty(value="名称。",hidden=false,required=false)
    private String name;
    @ApiModelProperty(value="备注字段。",hidden=false,required=false)
    private String remark;
    @ApiModelProperty(value="机构职能。",hidden=false,required=false)
    private String responsibility;
    @ApiModelProperty(value="编号。",hidden=false,required=false)
    private String serialNo;
    @ApiModelProperty(value="记录最后一次修改时间。",hidden=false,required=false)
    private Date updateTime;
    //多对一关系中，一端实体对象

    //一对多关系中，多端数据列表

	/**
	 * get方法。记录创建时间。
	 */
	public Date getAddTime() {
		return this.addTime;
	}

	/**
	 * set方法。记录创建时间。
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
    
	/**
	 * get方法。主键。
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * set方法。主键。
	 */
	public void setId(String id) {
		this.id = id;
	}
    
	/**
	 * get方法。名称。
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * set方法。名称。
	 */
	public void setName(String name) {
		this.name = name;
	}
    
	/**
	 * get方法。备注字段。
	 */
	public String getRemark() {
		return this.remark;
	}

	/**
	 * set方法。备注字段。
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
    
	/**
	 * get方法。机构职能。
	 */
	public String getResponsibility() {
		return this.responsibility;
	}

	/**
	 * set方法。机构职能。
	 */
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
    
	/**
	 * get方法。编号。
	 */
	public String getSerialNo() {
		return this.serialNo;
	}

	/**
	 * set方法。编号。
	 */
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
    
	/**
	 * get方法。记录最后一次修改时间。
	 */
	public Date getUpdateTime() {
		return this.updateTime;
	}

	/**
	 * set方法。记录最后一次修改时间。
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
    

    //一对多关系中，多端数据列表

}







