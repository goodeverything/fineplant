package com.david.fineframe.web;

import com.david.fineframe.dto.Distance;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunqinwei on 2017/6/26.
 */
@Controller
public class DistanceController {
    @RequestMapping(value = "/distance")
    @ResponseBody
    public Distance test(){
        return Distance.KILOMETER;
    }

}
