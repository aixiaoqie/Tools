package com.run.dao.split.sr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.run.dao.split.base.IBaseSplDal;
import com.run.ent.extend.sr.SrSpecification;



/**
 * @author Zee
 * @createDate 2017/05/22 14:01:41
 * @updateDate 2019/9/27 17:55:26
 * @description 扩展自实体类IBaseUntDal<SrSpecification>，可手动更改。
 */

public interface ISrSpecificationSplDal extends IBaseSplDal {

	public int add(SrSpecification srSpecification);

	public int addList(ArrayList<SrSpecification> srSpecificationList);

	public int delete(String id);

	public int deleteByIdList(ArrayList<String> idList);

	public int update(SrSpecification srSpecification);

	public SrSpecification getModel(String id);

	public List<SrSpecification> getList(Map<String, Object> map);

	public List<Map<String, Object>> getListBySQL(String sql);

}





