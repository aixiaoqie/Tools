package com.run.ent.parameter.sr;

import java.util.*;

import com.run.ent.extend.sr.SrResource;
import com.run.ent.generate.sr.SrResourceGenEnt;
import com.run.ent.parameter.base.BaseParameter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/27 17:55:27
 * @description 实体类SrResourceParameter，方法参数，自动生成。
 */

public class SrResourceParameter extends BaseParameter {

	@ApiModel(value = "SrResourceAddList", description = "批量添加SrResource所需参数")
	public static class AddList extends BaseParameter.BaseParamAddList {

		@ApiModelProperty(value = "要新增的记录列表 ", required = false)
		private ArrayList<SrResource> entityList = new ArrayList<SrResource>();

		public ArrayList<SrResource> getEntityList() {
			return entityList;
		}

		public void setEntityList(ArrayList<SrResource> entityList) {
			this.entityList = entityList;
		}

	}

	@ApiModel(value = "SrResourceDeleteByIdList", description = "批量删除SrResource所需参数")
	public static class DeleteByIdList extends BaseParameter.BaseParamDeleteByIdList {

	}

	@ApiModel(value = "SrResourceUpdateList", description = "批量修改SrResource所需参数")
	public static class UpdateList extends BaseParameter.BaseParamUpdateList {

		@ApiModelProperty(value = "要修改为的信息承载实体 ", required = false)
		private SrResource entity = new SrResource();

		public SrResource getEntity() {
			return entity;
		}

		public void setEntity(SrResource entity) {
			this.entity = entity;
		}

	}

	@ApiModel(value = "SrResourceGetList", description = "模糊查询SrResource所需参数")
	public static class GetList extends BaseParameter.BaseParamGetList {

		@ApiModelProperty(value = "实体相关的查询条件 ", required = false)
		private EntityRelated entityRelated = new EntityRelated();

		public EntityRelated getEntityRelated() {
			return entityRelated;
		}

		public void setEntityRelated(EntityRelated entityRelated) {
			this.entityRelated = entityRelated;
		}

		@ApiModel(value = "SrResourceGetListEntityRelated", description = "模糊查询SrResource所需的参数，实体类相关。")
		public static class EntityRelated extends SrResourceGenEnt{
        
		}
	}

}







