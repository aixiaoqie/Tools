package com.run.ent.parameter.gp;

import java.util.*;

import com.run.ent.extend.gp.GpMessage;
import com.run.ent.generate.gp.GpMessageGenEnt;
import com.run.ent.parameter.base.BaseParameter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/27 17:55:27
 * @description 实体类GpMessageParameter，方法参数，自动生成。
 */

public class GpMessageParameter extends BaseParameter {

	@ApiModel(value = "GpMessageAddList", description = "批量添加GpMessage所需参数")
	public static class AddList extends BaseParameter.BaseParamAddList {

		@ApiModelProperty(value = "要新增的记录列表 ", required = false)
		private ArrayList<GpMessage> entityList = new ArrayList<GpMessage>();

		public ArrayList<GpMessage> getEntityList() {
			return entityList;
		}

		public void setEntityList(ArrayList<GpMessage> entityList) {
			this.entityList = entityList;
		}

	}

	@ApiModel(value = "GpMessageDeleteByIdList", description = "批量删除GpMessage所需参数")
	public static class DeleteByIdList extends BaseParameter.BaseParamDeleteByIdList {

	}

	@ApiModel(value = "GpMessageUpdateList", description = "批量修改GpMessage所需参数")
	public static class UpdateList extends BaseParameter.BaseParamUpdateList {

		@ApiModelProperty(value = "要修改为的信息承载实体 ", required = false)
		private GpMessage entity = new GpMessage();

		public GpMessage getEntity() {
			return entity;
		}

		public void setEntity(GpMessage entity) {
			this.entity = entity;
		}

	}

	@ApiModel(value = "GpMessageGetList", description = "模糊查询GpMessage所需参数")
	public static class GetList extends BaseParameter.BaseParamGetList {

		@ApiModelProperty(value = "实体相关的查询条件 ", required = false)
		private EntityRelated entityRelated = new EntityRelated();

		public EntityRelated getEntityRelated() {
			return entityRelated;
		}

		public void setEntityRelated(EntityRelated entityRelated) {
			this.entityRelated = entityRelated;
		}

		@ApiModel(value = "GpMessageGetListEntityRelated", description = "模糊查询GpMessage所需的参数，实体类相关。")
		public static class EntityRelated extends GpMessageGenEnt{
        
        @ApiModelProperty(value="查询起止时间。",required=false)
		private Date beginAddTime;

        @ApiModelProperty(value="查询结束时间。",required=false)
		private Date endAddTime;

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
        
		}
	}

}







