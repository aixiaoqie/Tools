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
 * @updateDate 2019/9/29 12:00:26
 * @description 实体类GpMessageGenEnt，自动生成。系统消息。
 */

public class GpMessageGenEnt extends BaseEnt implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value="记录创建时间。",hidden=false,required=false)
    private Date addTime;
    @ApiModelProperty(value="消息内容。",hidden=false,required=false)
    private String content;
    @ApiModelProperty(value="主键。",hidden=false,required=true)
    private String id;
    @ApiModelProperty(value="备注字段。",hidden=false,required=false)
    private String remark;
    @ApiModelProperty(value="消息标题",hidden=false,required=false)
    private String title;
    @ApiModelProperty(value="消息类型。",allowableValues="0,1",hidden=false,required=false)
    private Byte typeCode;
    @ApiModelProperty(value="消息类型。",hidden=false,required=false)
    private String typeText;
    @ApiModelProperty(value="消息创建者。外键，引用系统用户表（user）的主键。",hidden=false,required=false)
    private String userId;
    @ApiModelProperty(value="消息创建者。登录名称，和系统用户表（user）的登录名称（user_name）对应。",hidden=false,required=false)
    private String userName;
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
	 * get方法。消息内容。
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 * set方法。消息内容。
	 */
	public void setContent(String content) {
		this.content = content;
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
	 * get方法。消息标题
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * set方法。消息标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
    
	/**
	 * get方法。消息类型。
	 */
	public Byte getTypeCode() {
		return this.typeCode;
	}

	/**
	 * set方法。消息类型。
	 */
	public void setTypeCode(Byte typeCode) {
		this.typeCode = typeCode;
	}
    
	/**
	 * get方法。消息类型。
	 */
	public String getTypeText() {
		return this.typeText;
	}

	/**
	 * set方法。消息类型。
	 */
	public void setTypeText(String typeText) {
		this.typeText = typeText;
	}
    
	/**
	 * get方法。消息创建者。外键，引用系统用户表（user）的主键。
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * set方法。消息创建者。外键，引用系统用户表（user）的主键。
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
    
	/**
	 * get方法。消息创建者。登录名称，和系统用户表（user）的登录名称（user_name）对应。
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * set方法。消息创建者。登录名称，和系统用户表（user）的登录名称（user_name）对应。
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
    

    //一对多关系中，多端数据列表

}







