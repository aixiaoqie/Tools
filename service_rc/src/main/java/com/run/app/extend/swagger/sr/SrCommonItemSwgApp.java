package com.run.app.extend.swagger.sr;

import com.run.bll.extend.split.sr.SrCommonItemSplBll;
import com.run.ent.custom.ResultModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.run.app.generate.swagger.sr.SrCommonItemGenSwgApp;


/**
 * @author Zee
 * @createDate 2017/05/22 15:10:18
 * @updateDate 2019/9/27 17:55:26
 * @description  对外接口，扩展自SrCommonItemGenSwgApp ，可手动更改。
 */
@RestController
@RequestMapping(value = "/extend/swagger/sr/srCommonItem")
public class  SrCommonItemSwgApp extends  SrCommonItemGenSwgApp {

    @Autowired
    private SrCommonItemSplBll srCommonItemSplBll;
    @ApiOperation(value = "根据sql查询内容",notes = "根据sql查询内容")
    @RequestMapping(value = "/queryBySql",method = RequestMethod.GET)
    public ResultModel getList(String sql){
        return srCommonItemSplBll.getList(sql);
    }

}



