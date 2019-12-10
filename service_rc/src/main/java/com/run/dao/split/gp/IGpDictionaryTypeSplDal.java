package com.run.dao.split.gp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.run.dao.split.base.IBaseSplDal;
import com.run.ent.extend.gp.GpDictionaryType;



/**
 * @author Zee
 * @createDate 2017/05/22 14:01:41
 * @updateDate 2019/9/27 17:55:26
 * @description 扩展自实体类IBaseUntDal<GpDictionaryType>，可手动更改。
 */

public interface IGpDictionaryTypeSplDal extends IBaseSplDal {

	public int add(GpDictionaryType gpDictionaryType);

	public int addList(ArrayList<GpDictionaryType> gpDictionaryTypeList);

	public int delete(String id);

	public int deleteByIdList(ArrayList<String> idList);

	public int update(GpDictionaryType gpDictionaryType);

	public GpDictionaryType getModel(String id);

	public List<GpDictionaryType> getList(Map<String, Object> map);

	public List<Map<String, Object>> getListBySQL(String sql);

}





