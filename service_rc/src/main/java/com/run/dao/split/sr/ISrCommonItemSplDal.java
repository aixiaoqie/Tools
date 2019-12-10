package com.run.dao.split.sr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.run.dao.split.base.IBaseSplDal;
import com.run.ent.extend.sr.SrCommonItem;



/**
 * @author Zee
 * @createDate 2017/05/22 14:01:41
 * @updateDate 2019/9/27 17:55:26
 * @description 扩展自实体类IBaseUntDal<SrCommonItem>，可手动更改。
 */

public interface ISrCommonItemSplDal extends IBaseSplDal {

	public int add(SrCommonItem srCommonItem);

	public int addList(ArrayList<SrCommonItem> srCommonItemList);

	public int delete(String id);

	public int deleteByIdList(ArrayList<String> idList);

	public int update(SrCommonItem srCommonItem);

	public SrCommonItem getModel(String id);

	public List<SrCommonItem> getList(Map<String, Object> map);

	public List<Map<String, Object>> getListBySQL(String sql);


}





