package com.run.ent.parameter.gp;

import java.util.*;

import com.run.ent.extend.gp.GpLoginLog;
import com.run.ent.generate.gp.GpLoginLogGenEnt;
import com.run.ent.parameter.base.BaseParameter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/27 17:55:26
 * @description 实体类GpLoginLogParameter，方法参数，自动生成。
 */

public class GpLoginLogParameter extends BaseParameter {

	@ApiModel(value = "GpLoginLogAddList", description = "批量添加GpLoginLog所需参数")
	public static class AddList extends BaseParameter.BaseParamAddList {

		@ApiModelProperty(value = "要新增的记录列表 ", required = false)
		private ArrayList<GpLoginLog> entityList = new ArrayList<GpLoginLog>();

		public ArrayList<GpLoginLog> getEntityList() {
			return entityList;
		}

		public void setEntityList(ArrayList<GpLoginLog> entityList) {
			this.entityList = entityList;
		}

	}

	@ApiModel(value = "GpLoginLogDeleteByIdList", description = "批量删除GpLoginLog所需参数")
	public static class DeleteByIdList extends BaseParameter.BaseParamDeleteByIdList {

	}

	@ApiModel(value = "GpLoginLogUpdateList", description = "批量修改GpLoginLog所需参数")
	public static class UpdateList extends BaseParameter.BaseParamUpdateList {

		@ApiModelProperty(value = "要修改为的信息承载实体 ", required = false)
		private GpLoginLog entity = new GpLoginLog();

		public GpLoginLog getEntity() {
			return entity;
		}

		public void setEntity(GpLoginLog entity) {
			this.entity = entity;
		}

	}

	@ApiModel(value = "GpLoginLogGetList", description = "模糊查询GpLoginLog所需参数")
	public static class GetList extends BaseParameter.BaseParamGetList {

		@ApiModelProperty(value = "实体相关的查询条件 ", required = false)
		private EntityRelated entityRelated = new EntityRelated();

		public EntityRelated getEntityRelated() {
			return entityRelated;
		}

		public void setEntityRelated(EntityRelated entityRelated) {
			this.entityRelated = entityRelated;
		}

		@ApiModel(value = "GpLoginLogGetListEntityRelated", description = "模糊查询GpLoginLog所需的参数，实体类相关。")
		public static class EntityRelated extends GpLoginLogGenEnt{
        
        @ApiModelProperty(value="查询起止时间。",required=false)
		private Date beginLoginTime;

        @ApiModelProperty(value="查询结束时间。",required=false)
		private Date endLoginTime;

        @ApiModelProperty(value="查询起止时间。",required=false)
		private Date beginLogoutTime;

        @ApiModelProperty(value="查询结束时间。",required=false)
		private Date endLogoutTime;

		public Date getBeginLoginTime() {
			return this.beginLoginTime;
		}
        
		public void setBeginLoginTime(Date beginLoginTime) {
			this.beginLoginTime = beginLoginTime;
		}
        
        public Date getEndLoginTime() {
			return this.endLoginTime;
		}
        
		public void setEndLoginTime(Date endLoginTime) {
			this.endLoginTime = endLoginTime;
		}
        
		public Date getBeginLogoutTime() {
			return this.beginLogoutTime;
		}
        
		public void setBeginLogoutTime(Date beginLogoutTime) {
			this.beginLogoutTime = beginLogoutTime;
		}
        
        public Date getEndLogoutTime() {
			return this.endLogoutTime;
		}
        
		public void setEndLogoutTime(Date endLogoutTime) {
			this.endLogoutTime = endLogoutTime;
		}
        
		}
	}

}







