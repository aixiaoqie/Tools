package com.run.ent.parameter.gp;

import java.util.*;

import com.run.ent.extend.gp.GpOperLogLogin;
import com.run.ent.generate.gp.GpOperLogLoginGenEnt;
import com.run.ent.parameter.base.BaseParameter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/27 17:55:27
 * @description 实体类GpOperLogLoginParameter，方法参数，自动生成。
 */

public class GpOperLogLoginParameter extends BaseParameter {

	@ApiModel(value = "GpOperLogLoginAddList", description = "批量添加GpOperLogLogin所需参数")
	public static class AddList extends BaseParameter.BaseParamAddList {

		@ApiModelProperty(value = "要新增的记录列表 ", required = false)
		private ArrayList<GpOperLogLogin> entityList = new ArrayList<GpOperLogLogin>();

		public ArrayList<GpOperLogLogin> getEntityList() {
			return entityList;
		}

		public void setEntityList(ArrayList<GpOperLogLogin> entityList) {
			this.entityList = entityList;
		}

	}

	@ApiModel(value = "GpOperLogLoginDeleteByIdList", description = "批量删除GpOperLogLogin所需参数")
	public static class DeleteByIdList extends BaseParameter.BaseParamDeleteByIdList {

	}

	@ApiModel(value = "GpOperLogLoginUpdateList", description = "批量修改GpOperLogLogin所需参数")
	public static class UpdateList extends BaseParameter.BaseParamUpdateList {

		@ApiModelProperty(value = "要修改为的信息承载实体 ", required = false)
		private GpOperLogLogin entity = new GpOperLogLogin();

		public GpOperLogLogin getEntity() {
			return entity;
		}

		public void setEntity(GpOperLogLogin entity) {
			this.entity = entity;
		}

	}

	@ApiModel(value = "GpOperLogLoginGetList", description = "模糊查询GpOperLogLogin所需参数")
	public static class GetList extends BaseParameter.BaseParamGetList {

		@ApiModelProperty(value = "实体相关的查询条件 ", required = false)
		private EntityRelated entityRelated = new EntityRelated();

		public EntityRelated getEntityRelated() {
			return entityRelated;
		}

		public void setEntityRelated(EntityRelated entityRelated) {
			this.entityRelated = entityRelated;
		}

		@ApiModel(value = "GpOperLogLoginGetListEntityRelated", description = "模糊查询GpOperLogLogin所需的参数，实体类相关。")
		public static class EntityRelated extends GpOperLogLoginGenEnt{
        
		}
	}

}







