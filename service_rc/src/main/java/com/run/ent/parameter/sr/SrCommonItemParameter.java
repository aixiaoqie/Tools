package com.run.ent.parameter.sr;

import java.util.*;

import com.run.ent.extend.sr.SrCommonItem;
import com.run.ent.generate.sr.SrCommonItemGenEnt;
import com.run.ent.parameter.base.BaseParameter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/27 17:55:27
 * @description 实体类SrCommonItemParameter，方法参数，自动生成。
 */

public class SrCommonItemParameter extends BaseParameter {

	@ApiModel(value = "SrCommonItemAddList", description = "批量添加SrCommonItem所需参数")
	public static class AddList extends BaseParameter.BaseParamAddList {

		@ApiModelProperty(value = "要新增的记录列表 ", required = false)
		private ArrayList<SrCommonItem> entityList = new ArrayList<SrCommonItem>();

		public ArrayList<SrCommonItem> getEntityList() {
			return entityList;
		}

		public void setEntityList(ArrayList<SrCommonItem> entityList) {
			this.entityList = entityList;
		}

	}

	@ApiModel(value = "SrCommonItemDeleteByIdList", description = "批量删除SrCommonItem所需参数")
	public static class DeleteByIdList extends BaseParameter.BaseParamDeleteByIdList {

	}

	@ApiModel(value = "SrCommonItemUpdateList", description = "批量修改SrCommonItem所需参数")
	public static class UpdateList extends BaseParameter.BaseParamUpdateList {

		@ApiModelProperty(value = "要修改为的信息承载实体 ", required = false)
		private SrCommonItem entity = new SrCommonItem();

		public SrCommonItem getEntity() {
			return entity;
		}

		public void setEntity(SrCommonItem entity) {
			this.entity = entity;
		}

	}

	@ApiModel(value = "SrCommonItemGetList", description = "模糊查询SrCommonItem所需参数")
	public static class GetList extends BaseParameter.BaseParamGetList {

		@ApiModelProperty(value = "实体相关的查询条件 ", required = false)
		private EntityRelated entityRelated = new EntityRelated();

		public EntityRelated getEntityRelated() {
			return entityRelated;
		}

		public void setEntityRelated(EntityRelated entityRelated) {
			this.entityRelated = entityRelated;
		}

		@ApiModel(value = "SrCommonItemGetListEntityRelated", description = "模糊查询SrCommonItem所需的参数，实体类相关。")
		public static class EntityRelated extends SrCommonItemGenEnt{
        
		}
	}

}







