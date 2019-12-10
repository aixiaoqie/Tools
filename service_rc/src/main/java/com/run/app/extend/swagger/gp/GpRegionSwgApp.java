package com.run.app.extend.swagger.gp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.run.app.generate.swagger.gp.GpRegionGenSwgApp;


/**
 * @author Zee
 * @createDate 2017/05/22 15:10:18
 * @updateDate 2019/9/27 17:55:26
 * @description  对外接口，扩展自GpRegionGenSwgApp ，可手动更改。
 */
@RestController
@RequestMapping(value = "/extend/swagger/gp/gpRegion")
public class  GpRegionSwgApp extends  GpRegionGenSwgApp {

}



