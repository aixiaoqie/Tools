package com.run.ent.parameter.gp;

import java.util.*;

import com.run.ent.extend.gp.GprMessageUser;
import com.run.ent.generate.gp.GprMessageUserGenEnt;
import com.run.ent.parameter.base.BaseParameter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/27 17:55:26
 * @description 实体类GprMessageUserParameter，方法参数，自动生成。
 */

public class GprMessageUserParameter extends BaseParameter {

	@ApiModel(value = "GprMessageUserAddList", description = "批量添加GprMessageUser所需参数")
	public static class AddList extends BaseParameter.BaseParamAddList {

		@ApiModelProperty(value = "要新增的记录列表 ", required = false)
		private ArrayList<GprMessageUser> entityList = new ArrayList<GprMessageUser>();

		public ArrayList<GprMessageUser> getEntityList() {
			return entityList;
		}

		public void setEntityList(ArrayList<GprMessageUser> entityList) {
			this.entityList = entityList;
		}

	}

	@ApiModel(value = "GprMessageUserDeleteByIdList", description = "批量删除GprMessageUser所需参数")
	public static class DeleteByIdList extends BaseParameter.BaseParamDeleteByIdList {

	}

	@ApiModel(value = "GprMessageUserUpdateList", description = "批量修改GprMessageUser所需参数")
	public static class UpdateList extends BaseParameter.BaseParamUpdateList {

		@ApiModelProperty(value = "要修改为的信息承载实体 ", required = false)
		private GprMessageUser entity = new GprMessageUser();

		public GprMessageUser getEntity() {
			return entity;
		}

		public void setEntity(GprMessageUser entity) {
			this.entity = entity;
		}

	}

	@ApiModel(value = "GprMessageUserGetList", description = "模糊查询GprMessageUser所需参数")
	public static class GetList extends BaseParameter.BaseParamGetList {

		@ApiModelProperty(value = "实体相关的查询条件 ", required = false)
		private EntityRelated entityRelated = new EntityRelated();

		public EntityRelated getEntityRelated() {
			return entityRelated;
		}

		public void setEntityRelated(EntityRelated entityRelated) {
			this.entityRelated = entityRelated;
		}

		@ApiModel(value = "GprMessageUserGetListEntityRelated", description = "模糊查询GprMessageUser所需的参数，实体类相关。")
		public static class EntityRelated extends GprMessageUserGenEnt{
        
        @ApiModelProperty(value="查询起止时间。",required=false)
		private Date beginAddTime;

        @ApiModelProperty(value="查询结束时间。",required=false)
		private Date endAddTime;

        @ApiModelProperty(value="查询起止时间。",required=false)
		private Date beginReadTime;

        @ApiModelProperty(value="查询结束时间。",required=false)
		private Date endReadTime;

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
        
		public Date getBeginReadTime() {
			return this.beginReadTime;
		}
        
		public void setBeginReadTime(Date beginReadTime) {
			this.beginReadTime = beginReadTime;
		}
        
        public Date getEndReadTime() {
			return this.endReadTime;
		}
        
		public void setEndReadTime(Date endReadTime) {
			this.endReadTime = endReadTime;
		}
        
		}
	}

}







