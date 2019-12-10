package com.run.ent.parameter.gp;

import java.util.*;

import com.run.ent.extend.gp.GpUser;
import com.run.ent.generate.gp.GpUserGenEnt;
import com.run.ent.parameter.base.BaseParameter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/27 17:55:27
 * @description 实体类GpUserParameter，方法参数，自动生成。
 */

public class GpUserParameter extends BaseParameter {

	@ApiModel(value = "GpUserAddList", description = "批量添加GpUser所需参数")
	public static class AddList extends BaseParameter.BaseParamAddList {

		@ApiModelProperty(value = "要新增的记录列表 ", required = false)
		private ArrayList<GpUser> entityList = new ArrayList<GpUser>();

		public ArrayList<GpUser> getEntityList() {
			return entityList;
		}

		public void setEntityList(ArrayList<GpUser> entityList) {
			this.entityList = entityList;
		}

	}

	@ApiModel(value = "GpUserDeleteByIdList", description = "批量删除GpUser所需参数")
	public static class DeleteByIdList extends BaseParameter.BaseParamDeleteByIdList {

	}

	@ApiModel(value = "GpUserUpdateList", description = "批量修改GpUser所需参数")
	public static class UpdateList extends BaseParameter.BaseParamUpdateList {

		@ApiModelProperty(value = "要修改为的信息承载实体 ", required = false)
		private GpUser entity = new GpUser();

		public GpUser getEntity() {
			return entity;
		}

		public void setEntity(GpUser entity) {
			this.entity = entity;
		}

	}

	@ApiModel(value = "GpUserGetList", description = "模糊查询GpUser所需参数")
	public static class GetList extends BaseParameter.BaseParamGetList {

		@ApiModelProperty(value = "实体相关的查询条件 ", required = false)
		private EntityRelated entityRelated = new EntityRelated();

		public EntityRelated getEntityRelated() {
			return entityRelated;
		}

		public void setEntityRelated(EntityRelated entityRelated) {
			this.entityRelated = entityRelated;
		}

		@ApiModel(value = "GpUserGetListEntityRelated", description = "模糊查询GpUser所需的参数，实体类相关。")
		public static class EntityRelated extends GpUserGenEnt{
        
        @ApiModelProperty(value="查询起止时间。",required=false)
		private Date beginAddTime;

        @ApiModelProperty(value="查询结束时间。",required=false)
		private Date endAddTime;

        @ApiModelProperty(value="查询起止时间。",required=false)
		private Date beginBirthTime;

        @ApiModelProperty(value="查询结束时间。",required=false)
		private Date endBirthTime;

        @ApiModelProperty(value="查询起止时间。",required=false)
		private Date beginLastLoginTime;

        @ApiModelProperty(value="查询结束时间。",required=false)
		private Date endLastLoginTime;

        @ApiModelProperty(value="查询起止时间。",required=false)
		private Date beginUpdateTime;

        @ApiModelProperty(value="查询结束时间。",required=false)
		private Date endUpdateTime;

		public Date getBeginAddTime() {
			return this.beginAddTime;
		}
        
		public void setBeginAddTime(Date beginAddTime) {
			this.beginAddTime = beginAddTime;
		}
        
        public Date getEndAddTime() {
			return this.endAddTime;
		}
        
		public void setEndAddTime(Date endAddTime) {
			this.endAddTime = endAddTime;
		}
        
		public Date getBeginBirthTime() {
			return this.beginBirthTime;
		}
        
		public void setBeginBirthTime(Date beginBirthTime) {
			this.beginBirthTime = beginBirthTime;
		}
        
        public Date getEndBirthTime() {
			return this.endBirthTime;
		}
        
		public void setEndBirthTime(Date endBirthTime) {
			this.endBirthTime = endBirthTime;
		}
        
		public Date getBeginLastLoginTime() {
			return this.beginLastLoginTime;
		}
        
		public void setBeginLastLoginTime(Date beginLastLoginTime) {
			this.beginLastLoginTime = beginLastLoginTime;
		}
        
        public Date getEndLastLoginTime() {
			return this.endLastLoginTime;
		}
        
		public void setEndLastLoginTime(Date endLastLoginTime) {
			this.endLastLoginTime = endLastLoginTime;
		}
        
		public Date getBeginUpdateTime() {
			return this.beginUpdateTime;
		}
        
		public void setBeginUpdateTime(Date beginUpdateTime) {
			this.beginUpdateTime = beginUpdateTime;
		}
        
        public Date getEndUpdateTime() {
			return this.endUpdateTime;
		}
        
		public void setEndUpdateTime(Date endUpdateTime) {
			this.endUpdateTime = endUpdateTime;
		}
        
		}
	}

}







