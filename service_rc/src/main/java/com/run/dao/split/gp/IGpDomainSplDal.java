package com.run.dao.split.gp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.run.dao.split.base.IBaseSplDal;
import com.run.ent.extend.gp.GpDomain;



/**
 * @author Zee
 * @createDate 2017/05/22 14:01:41
 * @updateDate 2019/9/27 17:55:26
 * @description 扩展自实体类IBaseUntDal<GpDomain>，可手动更改。
 */

public interface IGpDomainSplDal extends IBaseSplDal {

	public int add(GpDomain gpDomain);

	public int addList(ArrayList<GpDomain> gpDomainList);

	public int delete(String id);

	public int deleteByIdList(ArrayList<String> idList);

	public int update(GpDomain gpDomain);

	public GpDomain getModel(String id);

	public List<GpDomain> getList(Map<String, Object> map);

	public List<Map<String, Object>> getListBySQL(String sql);

}





