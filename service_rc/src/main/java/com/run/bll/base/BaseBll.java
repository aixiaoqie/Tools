package com.run.bll.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.run.bll.base.Interface.IBaseBll;
import com.run.dao.unity.base.IBaseUntDal;
import com.run.ent.extend.gp.GpOperLog;

@Service
@Transactional
public class BaseBll implements IBaseBll {
	@Value("${isLog.write}")
	protected boolean isLogWrite;

	@Value("${isLog.read}")
	protected boolean isLogRead;

	public static final Logger logger = LoggerFactory.getLogger(BaseBll.class);

	@Autowired
	protected IBaseUntDal<GpOperLog> operationLogDal;
}
