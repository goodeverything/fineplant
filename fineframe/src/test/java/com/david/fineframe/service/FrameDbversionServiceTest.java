package com.david.fineframe.service;

import com.david.fineframe.entity.FrameDbversion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by sunqinwei on 2017/6/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class FrameDbversionServiceTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    FrameDbversionService dbversionService;
    @Test
    public void update() throws Exception {
        FrameDbversion dbversion = new FrameDbversion("piping","V1.0","测试","sqw","sqw");
        FrameDbversion result = dbversionService.update(dbversion);
        logger.info("update更新结果{}",result);
    }

}