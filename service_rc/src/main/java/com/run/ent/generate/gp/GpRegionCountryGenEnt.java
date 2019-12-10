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
 * @description 实体类GpRegionCountryGenEnt，自动生成。地区信息。
 */

public class GpRegionCountryGenEnt extends BaseEnt implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value="国家面积。单位平方公里（ SquareKilometer sq . km ）。",hidden=false,required=false)
    private Integer area;
    @ApiModelProperty(value="中文名称。",hidden=false,required=false)
    private String chineseName;
    @ApiModelProperty(value="英文名称。",hidden=false,required=false)
    private String englishName;
    @ApiModelProperty(value="主键",hidden=false,required=true)
    private String id;
    @ApiModelProperty(value="是否显示。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。默认值0。",allowableValues="0,1",hidden=false,required=false)
    private Byte isDisplayCode;
    @ApiModelProperty(value="国家编码。使用ISO-3166-1标准中的Alpha3编码。",allowableValues="0,1",hidden=false,required=false)
    private String isoCode;
    @ApiModelProperty(value="地区纬度。",hidden=false,required=false)
    private String latitude;
    @ApiModelProperty(value="地区经度。",hidden=false,required=false)
    private String longitude;
    @ApiModelProperty(value="备注字段。",hidden=false,required=false)
    private String remark;
    //多对一关系中，一端实体对象

    //一对多关系中，多端数据列表

	/**
	 * get方法。国家面积。单位平方公里（ SquareKilometer sq . km ）。
	 */
	public Integer getArea() {
		return this.area;
	}

	/**
	 * set方法。国家面积。单位平方公里（ SquareKilometer sq . km ）。
	 */
	public void setArea(Integer area) {
		this.area = area;
	}
    
	/**
	 * get方法。中文名称。
	 */
	public String getChineseName() {
		return this.chineseName;
	}

	/**
	 * set方法。中文名称。
	 */
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
    
	/**
	 * get方法。英文名称。
	 */
	public String getEnglishName() {
		return this.englishName;
	}

	/**
	 * set方法。英文名称。
	 */
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
    
	/**
	 * get方法。主键
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * set方法。主键
	 */
	public void setId(String id) {
		this.id = id;
	}
    
	/**
	 * get方法。是否显示。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。默认值0。
	 */
	public Byte getIsDisplayCode() {
		return this.isDisplayCode;
	}

	/**
	 * set方法。是否显示。对应数据字典表（dictionary）中的编码字段（code）。布尔型字段，两种类型：0是，1否。默认值0。
	 */
	public void setIsDisplayCode(Byte isDisplayCode) {
		this.isDisplayCode = isDisplayCode;
	}
    
	/**
	 * get方法。国家编码。使用ISO-3166-1标准中的Alpha3编码。
	 */
	public String getIsoCode() {
		return this.isoCode;
	}

	/**
	 * set方法。国家编码。使用ISO-3166-1标准中的Alpha3编码。
	 */
	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}
    
	/**
	 * get方法。地区纬度。
	 */
	public String getLatitude() {
		return this.latitude;
	}

	/**
	 * set方法。地区纬度。
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
    
	/**
	 * get方法。地区经度。
	 */
	public String getLongitude() {
		return this.longitude;
	}

	/**
	 * set方法。地区经度。
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
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
    

    //一对多关系中，多端数据列表

}







