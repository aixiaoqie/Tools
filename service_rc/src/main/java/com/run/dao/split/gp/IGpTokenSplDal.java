package com.run.dao.split.gp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.run.dao.split.base.IBaseSplDal;
import com.run.ent.extend.gp.GpToken;



/**
 * @author Zee
 * @createDate 2017/05/22 14:01:41
 * @updateDate 2019/9/27 17:55:26
 * @description 扩展自实体类IBaseUntDal<GpToken>，可手动更改。
 */

public interface IGpTokenSplDal extends IBaseSplDal {

	public int add(GpToken gpToken);

	public int addList(ArrayList<GpToken> gpTokenList);

	public int delete(String id);

	public int deleteByIdList(ArrayList<String> idList);

	public int update(GpToken gpToken);

	public GpToken getModel(String id);

	public List<GpToken> getList(Map<String, Object> map);

	public List<Map<String, Object>> getListBySQL(String sql);

}





