package com.david.fineframe.dao;
import com.david.fineframe.entity.FrameDbversion;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by sunqinwei on 2017/6/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class FrameDbversionDaoTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private FrameDbversionDao dbversionDao;

    private  FrameDbversion dbversion;
    @Test
    public void insertDbversion() throws Exception {
        int insertCount = dbversionDao.insertDbversion(dbversion);
        assertEquals(1,insertCount);
        logger.info("insertDbversion插入成功,insertCount={}",insertCount);
        insertCount = dbversionDao.insertDbversion(dbversion);
        assertEquals(0,insertCount);
        logger.info("insertDbversion插入失败,insertCount={}",insertCount);
    }

    @Test
    public void deleteDbversion() throws Exception {
        dbversionDao.insertDbversion(dbversion);
        int deleteCount = dbversionDao.deleteDbversion("piping");
        assertEquals(1,deleteCount);
        logger.info("deleteDbversion删除成功,deletecount={}",deleteCount);

    }

    @Test
    public void updateDbversion() throws Exception {
        dbversionDao.insertDbversion(dbversion);
        dbversion = dbversionDao.selectDbversion("piping");
        dbversion.setVersion("v2.0updateDbversion");
        dbversion.setLog("第二次升级!");
        int updateCount = dbversionDao.updateDbversion(dbversion);
        assertEquals(1,updateCount);
        logger.info("updateDbversion修改成功,updateCount = {}",updateCount);
    }

    @Test
    public void selectDbversion() throws Exception {
        dbversionDao.insertDbversion(dbversion);
        FrameDbversion result = dbversionDao.selectDbversion("piping");
        assertNotNull(result);
        logger.info("selectDbversion查询成功,dbversion={}",result);
    }

    @Before
    public void setUp() throws Exception {
        dbversion = new FrameDbversion("piping","V1.0","测试升级","sqw","sqw");
    }

    @After
    public void tearDown() throws Exception {
        dbversionDao.deleteDbversion("piping");
    }
}