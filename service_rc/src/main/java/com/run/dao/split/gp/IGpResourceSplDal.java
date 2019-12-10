package com.run.dao.split.gp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.run.dao.split.base.IBaseSplDal;
import com.run.ent.extend.gp.GpResource;



/**
 * @author Zee
 * @createDate 2017/05/22 14:01:41
 * @updateDate 2019/9/27 17:55:26
 * @description 扩展自实体类IBaseUntDal<GpResource>，可手动更改。
 */

public interface IGpResourceSplDal extends IBaseSplDal {

	public int add(GpResource gpResource);

	public int addList(ArrayList<GpResource> gpResourceList);

	public int delete(String id);

	public int deleteByIdList(ArrayList<String> idList);

	public int update(GpResource gpResource);

	public GpResource getModel(String id);

	public List<GpResource> getList(Map<String, Object> map);

	public List<Map<String, Object>> getListBySQL(String sql);

}





