package com.david.fineframe.web;

import com.david.fineframe.dto.JsonResult;
import com.david.fineframe.entity.FrameDbversion;
import com.david.fineframe.service.FrameDbversionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by sunqinwei on 2017/6/26.
 */
@Controller
public class FrameDbVersionController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    FrameDbversionService dbversionService;

    @RequestMapping(value = "/dbversion", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult<FrameDbversion> update(@Valid @RequestBody FrameDbversion dbversion, BindingResult result) {
        JsonResult<FrameDbversion> jsonResult;
        if (result.hasErrors()) {
            List<FieldError> list = result.getFieldErrors();
            String messageError = "";
            for (FieldError error : list) {
                messageError = messageError + error.getField() + ":" + error.getDefaultMessage();
                logger.info(error.getField() + ":" + error.getDefaultMessage());
            }

            jsonResult = new JsonResult<FrameDbversion>(false, "-1", messageError);
        } else {
            FrameDbversion updateResult = dbversionService.update(dbversion);
            jsonResult = new JsonResult<FrameDbversion>(true, updateResult);
            return jsonResult;
        }
        return jsonResult;
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public FrameDbversion update() {
        FrameDbversion dbversion = new FrameDbversion("piping", "V2.0", "controller测试", "david", "david");
        return dbversionService.update(dbversion);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "test";
    }

    @ResponseBody
    @RequestMapping(value = "/resources", method = RequestMethod.GET)
    public String messageResources() {
        ResourceBundle myResources = ResourceBundle.getBundle("messages");
        return myResources.getString("FrameDbversion.software.notnull");
    }

}
