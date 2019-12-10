package com.run.ent.generate.sr;

import java.io.Serializable;

import com.run.ent.base.BaseEnt;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/29 12:00:30
 * @description 实体类SrSpecificationGenEnt，自动生成。服务规约，描述某一类服务资源需遵循的通用接口规范，包括服务功能、请求信息、响应信息和服务返回代码。
 */

public class SrSpecificationGenEnt extends BaseEnt implements Serializable {

	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "服务规约_版本号", hidden = false, required = true)
	private String fwgyBbh;
	@ApiModelProperty(value = "服务规约标识符", hidden = false, required = true)
	private String fwgybsf;
	@ApiModelProperty(value = "服务规约管理单位_公安机关机构代码", hidden = false, required = true)
	private String fwgygldwGajgjgdm;
	@ApiModelProperty(value = "服务规约名称", hidden = false, required = true)
	private String fwgymc;
	@ApiModelProperty(value = "服务规约描述", hidden = false, required = false)
	private String fwgyms;
	@ApiModelProperty(value = "pk", hidden = false, required = true)
	private String id;
	@ApiModelProperty(value = "接口定义内容", hidden = false, required = true)
	private String jkdynr;
	@ApiModelProperty(value = "接口定义语言", hidden = false, required = true)
	private String jkdyyy;
	@ApiModelProperty(value = "接口返回代码", hidden = false, required = true)
	private String jkfhdm;
	@ApiModelProperty(value = "数据服务资源标准编号", hidden = false, required = false)
	private String sjfwzybzbh;
	// 多对一关系中，一端实体对象

	// 一对多关系中，多端数据列表

	/**
	 * get方法。服务规约_版本号
	 */
	public String getFwgyBbh() {
		return this.fwgyBbh;
	}

	/**
	 * set方法。服务规约_版本号
	 */
	public void setFwgyBbh(String fwgyBbh) {
		this.fwgyBbh = fwgyBbh;
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
	 * get方法。服务规约管理单位_公安机关机构代码
	 */
	public String getFwgygldwGajgjgdm() {
		return this.fwgygldwGajgjgdm;
	}

	/**
	 * set方法。服务规约管理单位_公安机关机构代码
	 */
	public void setFwgygldwGajgjgdm(String fwgygldwGajgjgdm) {
		this.fwgygldwGajgjgdm = fwgygldwGajgjgdm;
	}

	/**
	 * get方法。服务规约名称
	 */
	public String getFwgymc() {
		return this.fwgymc;
	}

	/**
	 * set方法。服务规约名称
	 */
	public void setFwgymc(String fwgymc) {
		this.fwgymc = fwgymc;
	}

	/**
	 * get方法。服务规约描述
	 */
	public String getFwgyms() {
		return this.fwgyms;
	}

	/**
	 * set方法。服务规约描述
	 */
	public void setFwgyms(String fwgyms) {
		this.fwgyms = fwgyms;
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
	 * get方法。接口定义内容
	 */
	public String getJkdynr() {
		return this.jkdynr;
	}

	/**
	 * set方法。接口定义内容
	 */
	public void setJkdynr(String jkdynr) {
		this.jkdynr = jkdynr;
	}

	/**
	 * get方法。接口定义语言
	 */
	public String getJkdyyy() {
		return this.jkdyyy;
	}

	/**
	 * set方法。接口定义语言
	 */
	public void setJkdyyy(String jkdyyy) {
		this.jkdyyy = jkdyyy;
	}

	/**
	 * get方法。接口返回代码
	 */
	public String getJkfhdm() {
		return this.jkfhdm;
	}

	/**
	 * set方法。接口返回代码
	 */
	public void setJkfhdm(String jkfhdm) {
		this.jkfhdm = jkfhdm;
	}

	/**
	 * get方法。数据服务资源标准编号
	 */
	public String getSjfwzybzbh() {
		return this.sjfwzybzbh;
	}

	/**
	 * set方法。数据服务资源标准编号
	 */
	public void setSjfwzybzbh(String sjfwzybzbh) {
		this.sjfwzybzbh = sjfwzybzbh;
	}

	// 一对多关系中，多端数据列表

}
