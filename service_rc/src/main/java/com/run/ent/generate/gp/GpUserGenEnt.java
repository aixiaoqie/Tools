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
 * @updateDate 2019/9/29 12:00:29
 * @description 实体类GpUserGenEnt，自动生成。系统用户。
 */

public class GpUserGenEnt extends BaseEnt implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value="记录创建时间。",hidden=false,required=false)
    private Date addTime;
    @ApiModelProperty(value="年龄。",hidden=false,required=false)
    private Byte age;
    @ApiModelProperty(value="出生日期。",hidden=false,required=false)
    private Date birthTime;
    @ApiModelProperty(value="邮箱。",hidden=false,required=false)
    private String email;
    @ApiModelProperty(value="性别。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0男，1女。",allowableValues="0,1",hidden=false,required=false)
    private Byte genderCode;
    @ApiModelProperty(value="头像图片存放路径。",hidden=false,required=false)
    private String icon;
    @ApiModelProperty(value="主键。",hidden=false,required=true)
    private String id;
    @ApiModelProperty(value="是否管理员。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。默认值0。",allowableValues="0,1",hidden=false,required=true)
    private Byte isAdminCode;
    @ApiModelProperty(value="是否禁用。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。默认值0。",allowableValues="0,1",hidden=false,required=true)
    private Byte isDisabledCode;
    @ApiModelProperty(value="是否已婚。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。",allowableValues="0,1",hidden=false,required=false)
    private Byte isMarriageCode;
    @ApiModelProperty(value="最后登录IP。",hidden=false,required=false)
    private String lastLoginIp;
    @ApiModelProperty(value="最后登录时间。",hidden=false,required=false)
    private Date lastLoginTime;
    @ApiModelProperty(value="登录次数。",hidden=false,required=false)
    private Integer loginCount;
    @ApiModelProperty(value="登录密码。",hidden=false,required=false)
    private String password;
    @ApiModelProperty(value="电话号码。",hidden=false,required=false)
    private String phone;
    @ApiModelProperty(value="QQ号",hidden=false,required=false)
    private String qq;
    @ApiModelProperty(value="真实姓名。",hidden=false,required=false)
    private String realName;
    @ApiModelProperty(value="注册IP。",hidden=false,required=false)
    private String registerIp;
    @ApiModelProperty(value="备注字段。",hidden=false,required=false)
    private String remark;
    @ApiModelProperty(value="记录最后一次修改时间。",hidden=false,required=false)
    private Date updateTime;
    @ApiModelProperty(value="登录账号。",hidden=false,required=false)
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
	 * get方法。年龄。
	 */
	public Byte getAge() {
		return this.age;
	}

	/**
	 * set方法。年龄。
	 */
	public void setAge(Byte age) {
		this.age = age;
	}
    
	/**
	 * get方法。出生日期。
	 */
	public Date getBirthTime() {
		return this.birthTime;
	}

	/**
	 * set方法。出生日期。
	 */
	public void setBirthTime(Date birthTime) {
		this.birthTime = birthTime;
	}
    
	/**
	 * get方法。邮箱。
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * set方法。邮箱。
	 */
	public void setEmail(String email) {
		this.email = email;
	}
    
	/**
	 * get方法。性别。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0男，1女。
	 */
	public Byte getGenderCode() {
		return this.genderCode;
	}

	/**
	 * set方法。性别。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0男，1女。
	 */
	public void setGenderCode(Byte genderCode) {
		this.genderCode = genderCode;
	}
    
	/**
	 * get方法。头像图片存放路径。
	 */
	public String getIcon() {
		return this.icon;
	}

	/**
	 * set方法。头像图片存放路径。
	 */
	public void setIcon(String icon) {
		this.icon = icon;
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
	 * get方法。是否管理员。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。默认值0。
	 */
	public Byte getIsAdminCode() {
		return this.isAdminCode;
	}

	/**
	 * set方法。是否管理员。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。默认值0。
	 */
	public void setIsAdminCode(Byte isAdminCode) {
		this.isAdminCode = isAdminCode;
	}
    
	/**
	 * get方法。是否禁用。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。默认值0。
	 */
	public Byte getIsDisabledCode() {
		return this.isDisabledCode;
	}

	/**
	 * set方法。是否禁用。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。默认值0。
	 */
	public void setIsDisabledCode(Byte isDisabledCode) {
		this.isDisabledCode = isDisabledCode;
	}
    
	/**
	 * get方法。是否已婚。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。
	 */
	public Byte getIsMarriageCode() {
		return this.isMarriageCode;
	}

	/**
	 * set方法。是否已婚。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。
	 */
	public void setIsMarriageCode(Byte isMarriageCode) {
		this.isMarriageCode = isMarriageCode;
	}
    
	/**
	 * get方法。最后登录IP。
	 */
	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	/**
	 * set方法。最后登录IP。
	 */
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
    
	/**
	 * get方法。最后登录时间。
	 */
	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}

	/**
	 * set方法。最后登录时间。
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
    
	/**
	 * get方法。登录次数。
	 */
	public Integer getLoginCount() {
		return this.loginCount;
	}

	/**
	 * set方法。登录次数。
	 */
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}
    
	/**
	 * get方法。登录密码。
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * set方法。登录密码。
	 */
	public void setPassword(String password) {
		this.password = password;
	}
    
	/**
	 * get方法。电话号码。
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * set方法。电话号码。
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
    
	/**
	 * get方法。QQ号
	 */
	public String getQq() {
		return this.qq;
	}

	/**
	 * set方法。QQ号
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}
    
	/**
	 * get方法。真实姓名。
	 */
	public String getRealName() {
		return this.realName;
	}

	/**
	 * set方法。真实姓名。
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
    
	/**
	 * get方法。注册IP。
	 */
	public String getRegisterIp() {
		return this.registerIp;
	}

	/**
	 * set方法。注册IP。
	 */
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
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
    
	/**
	 * get方法。登录账号。
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * set方法。登录账号。
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
    

    //一对多关系中，多端数据列表

}







