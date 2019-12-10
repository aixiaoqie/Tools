package com.run.bll.generate.split.gp;

import org.springframework.beans.factory.annotation.Autowired;

import com.run.bll.generate.split.base.BaseSplBll;
import com.run.dao.split.gp.IGpMessageSplDal;



/**
 * @author Zee
 * @createDate 2017/05/22 14:35:56
 * @updateDate 2019/9/27 17:55:27
 * @description  业务逻辑处理类，扩展自BaseSplBll<GpMessage>，自动生成。
 */
public class GpMessageGenSplBll extends BaseSplBll {

	@Autowired
	protected IGpMessageSplDal gpMessageSplDal;

}





