package com.run.ent.parameter.gp;

import java.util.*;

import com.run.ent.extend.gp.GpDictionary;
import com.run.ent.generate.gp.GpDictionaryGenEnt;
import com.run.ent.parameter.base.BaseParameter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/27 17:55:26
 * @description 实体类GpDictionaryParameter，方法参数，自动生成。
 */

public class GpDictionaryParameter extends BaseParameter {

	@ApiModel(value = "GpDictionaryAddList", description = "批量添加GpDictionary所需参数")
	public static class AddList extends BaseParameter.BaseParamAddList {

		@ApiModelProperty(value = "要新增的记录列表 ", required = false)
		private ArrayList<GpDictionary> entityList = new ArrayList<GpDictionary>();

		public ArrayList<GpDictionary> getEntityList() {
			return entityList;
		}

		public void setEntityList(ArrayList<GpDictionary> entityList) {
			this.entityList = entityList;
		}

	}

	@ApiModel(value = "GpDictionaryDeleteByIdList", description = "批量删除GpDictionary所需参数")
	public static class DeleteByIdList extends BaseParameter.BaseParamDeleteByIdList {

	}

	@ApiModel(value = "GpDictionaryUpdateList", description = "批量修改GpDictionary所需参数")
	public static class UpdateList extends BaseParameter.BaseParamUpdateList {

		@ApiModelProperty(value = "要修改为的信息承载实体 ", required = false)
		private GpDictionary entity = new GpDictionary();

		public GpDictionary getEntity() {
			return entity;
		}

		public void setEntity(GpDictionary entity) {
			this.entity = entity;
		}

	}

	@ApiModel(value = "GpDictionaryGetList", description = "模糊查询GpDictionary所需参数")
	public static class GetList extends BaseParameter.BaseParamGetList {

		@ApiModelProperty(value = "实体相关的查询条件 ", required = false)
		private EntityRelated entityRelated = new EntityRelated();

		public EntityRelated getEntityRelated() {
			return entityRelated;
		}

		public void setEntityRelated(EntityRelated entityRelated) {
			this.entityRelated = entityRelated;
		}

		@ApiModel(value = "GpDictionaryGetListEntityRelated", description = "模糊查询GpDictionary所需的参数，实体类相关。")
		public static class EntityRelated extends GpDictionaryGenEnt{
        
		}
	}

}







