package com.run.dao.split.gp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.run.dao.split.base.IBaseSplDal;
import com.run.ent.extend.gp.GprUserIcon;



/**
 * @author Zee
 * @createDate 2017/05/22 14:01:41
 * @updateDate 2019/9/27 17:55:26
 * @description 扩展自实体类IBaseUntDal<GprUserIcon>，可手动更改。
 */

public interface IGprUserIconSplDal extends IBaseSplDal {

	public int add(GprUserIcon gprUserIcon);

	public int addList(ArrayList<GprUserIcon> gprUserIconList);

	public int delete(String id);

	public int deleteByIdList(ArrayList<String> idList);

	public int update(GprUserIcon gprUserIcon);

	public GprUserIcon getModel(String id);

	public List<GprUserIcon> getList(Map<String, Object> map);

	public List<Map<String, Object>> getListBySQL(String sql);

}





