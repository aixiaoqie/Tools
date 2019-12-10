package com.run.ent.generate.gp;

import java.io.Serializable;
import java.util.Date;

import com.run.ent.base.BaseEnt;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/29 12:00:27
 * @description 实体类GpOperLogGenEnt，自动生成。操作日志。
 */

public class GpOperLogGenEnt extends BaseEnt implements Serializable {

	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "记录创建时间。", hidden = false, required = false)
	private Date addTime;
	@ApiModelProperty(value = "应用领域。外键，引用应用领域表（domain）的主键。", hidden = false, required = false)
	private String domainId;
	@ApiModelProperty(value = "主键。", hidden = false, required = true)
	private String id;
	@ApiModelProperty(value = "传入参数。记录调用BLL层方法时传入的参数值，对象的话序列化成JSON字符串保存。", hidden = false, required = false)
	private String incomeValue;
	@ApiModelProperty(value = "操作是否成功。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。 ", allowableValues = "0,1", hidden = false, required = false)
	private Byte isSuccessCode;
	@ApiModelProperty(value = "操作记录主键。只记录单条记录操作时的主键，暂不考虑记录针对多条记录操作的主键列表。", hidden = false, required = false)
	private String objectId;
	@ApiModelProperty(value = "操作类型。", allowableValues = "0,1", hidden = false, required = false)
	private Byte operTypeCode;
	@ApiModelProperty(value = "操作类型。", hidden = false, required = false)
	private String operTypeText;
	@ApiModelProperty(value = "备注字段。", hidden = false, required = false)
	private String remark;
	@ApiModelProperty(value = "操作结果编码。操作结果和一套编码表对应，暂不进行具体设计，只是在程序根据现有代码设计给出了一部分编码规则。", allowableValues = "0,1", hidden = false, required = false)
	private Integer resultCode;
	@ApiModelProperty(value = "提示信息。BLL层方法执行后返回给调用者的提示信息。", hidden = false, required = false)
	private String resultMessage;
	@ApiModelProperty(value = "返回值。记录调用BLL层方法时返回的参数值，对象的话序列化成JSON字符串保存。", hidden = false, required = false)
	private String returnValue;
	@ApiModelProperty(value = "操作表名。只记录核心表名，暂不考虑记录操作动作涉及的所有表名列表。", hidden = false, required = false)
	private String tableName;
	@ApiModelProperty(value = "记录总数。", hidden = false, required = false)
	private long totalCount;
	// 多对一关系中，一端实体对象

	// 一对多关系中，多端数据列表

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
	 * get方法。应用领域。外键，引用应用领域表（domain）的主键。
	 */
	public String getDomainId() {
		return this.domainId;
	}

	/**
	 * set方法。应用领域。外键，引用应用领域表（domain）的主键。
	 */
	public void setDomainId(String domainId) {
		this.domainId = domainId;
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
	 * get方法。传入参数。记录调用BLL层方法时传入的参数值，对象的话序列化成JSON字符串保存。
	 */
	public String getIncomeValue() {
		return this.incomeValue;
	}

	/**
	 * set方法。传入参数。记录调用BLL层方法时传入的参数值，对象的话序列化成JSON字符串保存。
	 */
	public void setIncomeValue(String incomeValue) {
		this.incomeValue = incomeValue;
	}

	/**
	 * get方法。操作是否成功。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。 
	 */
	public Byte getIsSuccessCode() {
		return this.isSuccessCode;
	}

	/**
	 * set方法。操作是否成功。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。 
	 */
	public void setIsSuccessCode(Byte isSuccessCode) {
		this.isSuccessCode = isSuccessCode;
	}

	/**
	 * get方法。操作记录主键。只记录单条记录操作时的主键，暂不考虑记录针对多条记录操作的主键列表。
	 */
	public String getObjectId() {
		return this.objectId;
	}

	/**
	 * set方法。操作记录主键。只记录单条记录操作时的主键，暂不考虑记录针对多条记录操作的主键列表。
	 */
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	/**
	 * get方法。操作类型。
	 */
	public Byte getOperTypeCode() {
		return this.operTypeCode;
	}

	/**
	 * set方法。操作类型。
	 */
	public void setOperTypeCode(Byte operTypeCode) {
		this.operTypeCode = operTypeCode;
	}

	/**
	 * get方法。操作类型。
	 */
	public String getOperTypeText() {
		return this.operTypeText;
	}

	/**
	 * set方法。操作类型。
	 */
	public void setOperTypeText(String operTypeText) {
		this.operTypeText = operTypeText;
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
	 * get方法。操作结果编码。操作结果和一套编码表对应，暂不进行具体设计，只是在程序根据现有代码设计给出了一部分编码规则。
	 */
	public Integer getResultCode() {
		return this.resultCode;
	}

	/**
	 * set方法。操作结果编码。操作结果和一套编码表对应，暂不进行具体设计，只是在程序根据现有代码设计给出了一部分编码规则。
	 */
	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	/**
	 * get方法。提示信息。BLL层方法执行后返回给调用者的提示信息。
	 */
	public String getResultMessage() {
		return this.resultMessage;
	}

	/**
	 * set方法。提示信息。BLL层方法执行后返回给调用者的提示信息。
	 */
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	/**
	 * get方法。返回值。记录调用BLL层方法时返回的参数值，对象的话序列化成JSON字符串保存。
	 */
	public String getReturnValue() {
		return this.returnValue;
	}

	/**
	 * set方法。返回值。记录调用BLL层方法时返回的参数值，对象的话序列化成JSON字符串保存。
	 */
	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}

	/**
	 * get方法。操作表名。只记录核心表名，暂不考虑记录操作动作涉及的所有表名列表。
	 */
	public String getTableName() {
		return this.tableName;
	}

	/**
	 * set方法。操作表名。只记录核心表名，暂不考虑记录操作动作涉及的所有表名列表。
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * get方法。记录总数。
	 */
	public long getTotalCount() {
		return this.totalCount;
	}

	/**
	 * set方法。记录总数。
	 */
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	// 一对多关系中，多端数据列表

}
