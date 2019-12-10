package com.run.ent.parameter.sr;

import java.util.*;

import com.run.ent.extend.sr.SrSpecification;
import com.run.ent.generate.sr.SrSpecificationGenEnt;
import com.run.ent.parameter.base.BaseParameter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * @author Zee
 * @createDate 2017/05/18 14:54:22
 * @updateDate 2019/9/27 17:55:27
 * @description 实体类SrSpecificationParameter，方法参数，自动生成。
 */

public class SrSpecificationParameter extends BaseParameter {

	@ApiModel(value = "SrSpecificationAddList", description = "批量添加SrSpecification所需参数")
	public static class AddList extends BaseParameter.BaseParamAddList {

		@ApiModelProperty(value = "要新增的记录列表 ", required = false)
		private ArrayList<SrSpecification> entityList = new ArrayList<SrSpecification>();

		public ArrayList<SrSpecification> getEntityList() {
			return entityList;
		}

		public void setEntityList(ArrayList<SrSpecification> entityList) {
			this.entityList = entityList;
		}

	}

	@ApiModel(value = "SrSpecificationDeleteByIdList", description = "批量删除SrSpecification所需参数")
	public static class DeleteByIdList extends BaseParameter.BaseParamDeleteByIdList {

	}

	@ApiModel(value = "SrSpecificationUpdateList", description = "批量修改SrSpecification所需参数")
	public static class UpdateList extends BaseParameter.BaseParamUpdateList {

		@ApiModelProperty(value = "要修改为的信息承载实体 ", required = false)
		private SrSpecification entity = new SrSpecification();

		public SrSpecification getEntity() {
			return entity;
		}

		public void setEntity(SrSpecification entity) {
			this.entity = entity;
		}

	}

	@ApiModel(value = "SrSpecificationGetList", description = "模糊查询SrSpecification所需参数")
	public static class GetList extends BaseParameter.BaseParamGetList {

		@ApiModelProperty(value = "实体相关的查询条件 ", required = false)
		private EntityRelated entityRelated = new EntityRelated();

		public EntityRelated getEntityRelated() {
			return entityRelated;
		}

		public void setEntityRelated(EntityRelated entityRelated) {
			this.entityRelated = entityRelated;
		}

		@ApiModel(value = "SrSpecificationGetListEntityRelated", description = "模糊查询SrSpecification所需的参数，实体类相关。")
		public static class EntityRelated extends SrSpecificationGenEnt{
        
		}
	}

}







