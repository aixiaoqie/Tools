package com.run.bll.extend.split.sr;

import com.run.dao.split.sr.ISrCommonItemSplDal;
import com.run.ent.custom.ResultModel;
import com.run.utl.SymbolicConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.run.bll.generate.split.sr.SrCommonItemGenSplBll;

import java.util.List;
import java.util.Map;


/**
 * @author Zee
 * @createDate 2017/05/22 14:39:59
 * @updateDate 2019/9/27 17:55:26
 * @description  业务逻辑处理类，扩展自BaseSplBll<SrCommonItem>，可手动更改。
 */
@Service("srCommonItemSplBll")
public class SrCommonItemSplBll extends SrCommonItemGenSplBll {

    @Autowired
    private ISrCommonItemSplDal iSrCommonItemSplDal;


    public ResultModel getList(String sql) {
        List<Map<String, Object>> listBySQL = iSrCommonItemSplDal.getListBySQL(sql);
        ResultModel model = new ResultModel();
        model.setResultMessage("查询成功");
        model.setIsSuccessCode(SymbolicConstant.DCODE_BOOLEAN_T);
        model.setResultCode(200);
        model.setTotalCount(listBySQL.size());
        model.setData(listBySQL);
        return model;
    }
}





