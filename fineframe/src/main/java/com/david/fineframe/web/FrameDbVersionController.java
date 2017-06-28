package com.david.fineframe.web;

import com.david.fineframe.entity.FrameDbversion;
import com.david.fineframe.service.FrameDbversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunqinwei on 2017/6/26.
 */
@Controller
public class FrameDbVersionController {
    @Autowired
    FrameDbversionService dbversionService;

    @RequestMapping(value = "/dbversion")
    @ResponseBody
    public FrameDbversion update(@RequestBody FrameDbversion dbversion, Model model){
        return dbversionService.update(dbversion);
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public FrameDbversion update(){
        FrameDbversion dbversion = new FrameDbversion("piping","V2.0","controller测试","david","david");
        return dbversionService.update(dbversion);
    }
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String main(){
        return "test";
    }

}
