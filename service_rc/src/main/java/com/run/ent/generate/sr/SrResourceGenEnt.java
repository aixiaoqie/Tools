package com.run.ent.generate.sr;

import java.io.Serializable;
import java.math.BigDecimal;

import java.util.*;

import com.run.ent.base.BaseEnt;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;


/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/29 12:00:30
 * @description 实体类SrResourceGenEnt，自动生成。服务资源
 */

public class SrResourceGenEnt extends BaseEnt implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value="服务访问地址",hidden=false,required=false)
    private String fwfwdz;
    @ApiModelProperty(value="服务规约标识符",hidden=false,required=true)
    private String fwgybsf;
    @ApiModelProperty(value="服务类型代码",hidden=false,required=true)
    private String fwlxdm;
    @ApiModelProperty(value="服务提供方式代码",hidden=false,required=true)
    private String fwtgfsdm;
    @ApiModelProperty(value="服务中介_应用资源标识符",hidden=false,required=false)
    private String fwzjYyzybsf;
    @ApiModelProperty(value="服务资源版本号",hidden=false,required=true)
    private String fwzyBbh;
    @ApiModelProperty(value="服务资源标识符,fk对应服务规约表主键",hidden=false,required=true)
    private String fwzybsf;
    @ApiModelProperty(value="服务资源管理单位_公安机关机构代码",hidden=false,required=true)
    private String fwzygldwGajgjgdm;
    @ApiModelProperty(value="服务资源名称",hidden=false,required=true)
    private String fwzymc;
    @ApiModelProperty(value="服务资源描述",hidden=false,required=false)
    private String fwzyms;
    @ApiModelProperty(value="服务资源事权单位_机构代码",hidden=false,required=true)
    private String fwzysqdwJgdm;
    @ApiModelProperty(value="服务资源状态代码",hidden=false,required=true)
    private String fwzyztdm;
    @ApiModelProperty(value="pk",hidden=false,required=true)
    private String id;
    @ApiModelProperty(value="提供服务资源的_应用资源标识",hidden=false,required=true)
    private String tgfwzydYyzybs;
    @ApiModelProperty(value="自用服务_判断标识",hidden=false,required=true)
    private String zyfwPdbs;
    //多对一关系中，一端实体对象

    //一对多关系中，多端数据列表

	/**
	 * get方法。服务访问地址
	 */
	public String getFwfwdz() {
		return this.fwfwdz;
	}

	/**
	 * set方法。服务访问地址
	 */
	public void setFwfwdz(String fwfwdz) {
		this.fwfwdz = fwfwdz;
	}
    
	/**
	 * get方法。服务规约标识符
	 */
	public String getFwgybsf() {
		return this.fwgybsf;
	}

	/**
	 * set方法。服务规约标识符
	 */
	public void setFwgybsf(String fwgybsf) {
		this.fwgybsf = fwgybsf;
	}
    
	/**
	 * get方法。服务类型代码
	 */
	public String getFwlxdm() {
		return this.fwlxdm;
	}

	/**
	 * set方法。服务类型代码
	 */
	public void setFwlxdm(String fwlxdm) {
		this.fwlxdm = fwlxdm;
	}
    
	/**
	 * get方法。服务提供方式代码
	 */
	public String getFwtgfsdm() {
		return this.fwtgfsdm;
	}

	/**
	 * set方法。服务提供方式代码
	 */
	public void setFwtgfsdm(String fwtgfsdm) {
		this.fwtgfsdm = fwtgfsdm;
	}
    
	/**
	 * get方法。服务中介_应用资源标识符
	 */
	public String getFwzjYyzybsf() {
		return this.fwzjYyzybsf;
	}

	/**
	 * set方法。服务中介_应用资源标识符
	 */
	public void setFwzjYyzybsf(String fwzjYyzybsf) {
		this.fwzjYyzybsf = fwzjYyzybsf;
	}
    
	/**
	 * get方法。服务资源版本号
	 */
	public String getFwzyBbh() {
		return this.fwzyBbh;
	}

	/**
	 * set方法。服务资源版本号
	 */
	public void setFwzyBbh(String fwzyBbh) {
		this.fwzyBbh = fwzyBbh;
	}
    
	/**
	 * get方法。服务资源标识符,fk对应服务规约表主键
	 */
	public String getFwzybsf() {
		return this.fwzybsf;
	}

	/**
	 * set方法。服务资源标识符,fk对应服务规约表主键
	 */
	public void setFwzybsf(String fwzybsf) {
		this.fwzybsf = fwzybsf;
	}
    
	/**
	 * get方法。服务资源管理单位_公安机关机构代码
	 */
	public String getFwzygldwGajgjgdm() {
		return this.fwzygldwGajgjgdm;
	}

	/**
	 * set方法。服务资源管理单位_公安机关机构代码
	 */
	public void setFwzygldwGajgjgdm(String fwzygldwGajgjgdm) {
		this.fwzygldwGajgjgdm = fwzygldwGajgjgdm;
	}
    
	/**
	 * get方法。服务资源名称
	 */
	public String getFwzymc() {
		return this.fwzymc;
	}

	/**
	 * set方法。服务资源名称
	 */
	public void setFwzymc(String fwzymc) {
		this.fwzymc = fwzymc;
	}
    
	/**
	 * get方法。服务资源描述
	 */
	public String getFwzyms() {
		return this.fwzyms;
	}

	/**
	 * set方法。服务资源描述
	 */
	public void setFwzyms(String fwzyms) {
		this.fwzyms = fwzyms;
	}
    
	/**
	 * get方法。服务资源事权单位_机构代码
	 */
	public String getFwzysqdwJgdm() {
		return this.fwzysqdwJgdm;
	}

	/**
	 * set方法。服务资源事权单位_机构代码
	 */
	public void setFwzysqdwJgdm(String fwzysqdwJgdm) {
		this.fwzysqdwJgdm = fwzysqdwJgdm;
	}
    
	/**
	 * get方法。服务资源状态代码
	 */
	public String getFwzyztdm() {
		return this.fwzyztdm;
	}

	/**
	 * set方法。服务资源状态代码
	 */
	public void setFwzyztdm(String fwzyztdm) {
		this.fwzyztdm = fwzyztdm;
	}
    
	/**
	 * get方法。pk
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * set方法。pk
	 */
	public void setId(String id) {
		this.id = id;
	}
    
	/**
	 * get方法。提供服务资源的_应用资源标识
	 */
	public String getTgfwzydYyzybs() {
		return this.tgfwzydYyzybs;
	}

	/**
	 * set方法。提供服务资源的_应用资源标识
	 */
	public void setTgfwzydYyzybs(String tgfwzydYyzybs) {
		this.tgfwzydYyzybs = tgfwzydYyzybs;
	}
    
	/**
	 * get方法。自用服务_判断标识
	 */
	public String getZyfwPdbs() {
		return this.zyfwPdbs;
	}

	/**
	 * set方法。自用服务_判断标识
	 */
	public void setZyfwPdbs(String zyfwPdbs) {
		this.zyfwPdbs = zyfwPdbs;
	}
    

    //一对多关系中，多端数据列表

}







