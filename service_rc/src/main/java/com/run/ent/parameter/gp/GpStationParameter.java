package com.run.ent.parameter.gp;

import java.util.*;

import com.run.ent.extend.gp.GpStation;
import com.run.ent.generate.gp.GpStationGenEnt;
import com.run.ent.parameter.base.BaseParameter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/27 17:55:27
 * @description 实体类GpStationParameter，方法参数，自动生成。
 */

public class GpStationParameter extends BaseParameter {

	@ApiModel(value = "GpStationAddList", description = "批量添加GpStation所需参数")
	public static class AddList extends BaseParameter.BaseParamAddList {

		@ApiModelProperty(value = "要新增的记录列表 ", required = false)
		private ArrayList<GpStation> entityList = new ArrayList<GpStation>();

		public ArrayList<GpStation> getEntityList() {
			return entityList;
		}

		public void setEntityList(ArrayList<GpStation> entityList) {
			this.entityList = entityList;
		}

	}

	@ApiModel(value = "GpStationDeleteByIdList", description = "批量删除GpStation所需参数")
	public static class DeleteByIdList extends BaseParameter.BaseParamDeleteByIdList {

	}

	@ApiModel(value = "GpStationUpdateList", description = "批量修改GpStation所需参数")
	public static class UpdateList extends BaseParameter.BaseParamUpdateList {

		@ApiModelProperty(value = "要修改为的信息承载实体 ", required = false)
		private GpStation entity = new GpStation();

		public GpStation getEntity() {
			return entity;
		}

		public void setEntity(GpStation entity) {
			this.entity = entity;
		}

	}

	@ApiModel(value = "GpStationGetList", description = "模糊查询GpStation所需参数")
	public static class GetList extends BaseParameter.BaseParamGetList {

		@ApiModelProperty(value = "实体相关的查询条件 ", required = false)
		private EntityRelated entityRelated = new EntityRelated();

		public EntityRelated getEntityRelated() {
			return entityRelated;
		}

		public void setEntityRelated(EntityRelated entityRelated) {
			this.entityRelated = entityRelated;
		}

		@ApiModel(value = "GpStationGetListEntityRelated", description = "模糊查询GpStation所需的参数，实体类相关。")
		public static class EntityRelated extends GpStationGenEnt{
        
        @ApiModelProperty(value="查询起止时间。",required=false)
		private Date beginAddTime;

        @ApiModelProperty(value="查询结束时间。",required=false)
		private Date endAddTime;

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







