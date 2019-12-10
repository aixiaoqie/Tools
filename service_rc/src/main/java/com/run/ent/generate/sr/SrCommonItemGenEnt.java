package com.run.ent.generate.sr;

import java.io.Serializable;
import java.util.Date;

import com.run.ent.base.BaseEnt;

import io.swagger.annotations.ApiModelProperty;


/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/29 12:00:29
 * @description 实体类SrCommonItemGenEnt，自动生成。公共数据项
 */

public class SrCommonItemGenEnt extends BaseEnt implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value="pk",hidden=false,required=true)
    private String id;
    @ApiModelProperty(value="信息操作_时间",hidden=false,required=true)
    private Date xxczSj;
    @ApiModelProperty(value="信息操作单位_公安机关机构代码",hidden=false,required=true)
    private String xxczdwGajgjgdm;
    @ApiModelProperty(value="信息操作人员_公民身份号码",hidden=false,required=true)
    private String xxczryGmsfhm;
    @ApiModelProperty(value="信息操作人员_姓名",hidden=false,required=true)
    private String xxczryXm;
    @ApiModelProperty(value="信息登记_时间",hidden=false,required=true)
    private Date xxdjSj;
    @ApiModelProperty(value="信息登记单位_公安机关机构代码",hidden=false,required=true)
    private String xxdjdwGajgjgdm;
    @ApiModelProperty(value="信息登记人员_公民身份号码",hidden=false,required=true)
    private String xxdjryGmsfhm;
    @ApiModelProperty(value="信息登记人员_姓名",hidden=false,required=true)
    private String xxdjryXm;
    //多对一关系中，一端实体对象

    //一对多关系中，多端数据列表

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
	 * get方法。信息操作_时间
	 */
	public Date getXxczSj() {
		return this.xxczSj;
	}

	/**
	 * set方法。信息操作_时间
	 */
	public void setXxczSj(Date xxczSj) {
		this.xxczSj = xxczSj;
	}
    
	/**
	 * get方法。信息操作单位_公安机关机构代码
	 */
	public String getXxczdwGajgjgdm() {
		return this.xxczdwGajgjgdm;
	}

	/**
	 * set方法。信息操作单位_公安机关机构代码
	 */
	public void setXxczdwGajgjgdm(String xxczdwGajgjgdm) {
		this.xxczdwGajgjgdm = xxczdwGajgjgdm;
	}
    
	/**
	 * get方法。信息操作人员_公民身份号码
	 */
	public String getXxczryGmsfhm() {
		return this.xxczryGmsfhm;
	}

	/**
	 * set方法。信息操作人员_公民身份号码
	 */
	public void setXxczryGmsfhm(String xxczryGmsfhm) {
		this.xxczryGmsfhm = xxczryGmsfhm;
	}
    
	/**
	 * get方法。信息操作人员_姓名
	 */
	public String getXxczryXm() {
		return this.xxczryXm;
	}

	/**
	 * set方法。信息操作人员_姓名
	 */
	public void setXxczryXm(String xxczryXm) {
		this.xxczryXm = xxczryXm;
	}
    
	/**
	 * get方法。信息登记_时间
	 */
	public Date getXxdjSj() {
		return this.xxdjSj;
	}

	/**
	 * set方法。信息登记_时间
	 */
	public void setXxdjSj(Date xxdjSj) {
		this.xxdjSj = xxdjSj;
	}
    
	/**
	 * get方法。信息登记单位_公安机关机构代码
	 */
	public String getXxdjdwGajgjgdm() {
		return this.xxdjdwGajgjgdm;
	}

	/**
	 * set方法。信息登记单位_公安机关机构代码
	 */
	public void setXxdjdwGajgjgdm(String xxdjdwGajgjgdm) {
		this.xxdjdwGajgjgdm = xxdjdwGajgjgdm;
	}
    
	/**
	 * get方法。信息登记人员_公民身份号码
	 */
	public String getXxdjryGmsfhm() {
		return this.xxdjryGmsfhm;
	}

	/**
	 * set方法。信息登记人员_公民身份号码
	 */
	public void setXxdjryGmsfhm(String xxdjryGmsfhm) {
		this.xxdjryGmsfhm = xxdjryGmsfhm;
	}
    
	/**
	 * get方法。信息登记人员_姓名
	 */
	public String getXxdjryXm() {
		return this.xxdjryXm;
	}

	/**
	 * set方法。信息登记人员_姓名
	 */
	public void setXxdjryXm(String xxdjryXm) {
		this.xxdjryXm = xxdjryXm;
	}
    

    //一对多关系中，多端数据列表

}







