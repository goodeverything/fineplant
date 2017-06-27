package com.david.fineframe.dao;

import com.david.fineframe.entity.FrameDictdata;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by sunqinwei on 2017/6/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class FrameDictdataDaoTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private FrameDictdataDao dictdataDao;

    private FrameDictdata dictdata_man;
    private FrameDictdata dictdata_woman;

    @Before
    public void setUp() throws Exception {
        dictdata_man = new FrameDictdata("sex", "1", "男");
        dictdata_woman = new FrameDictdata("sex", "2", "女");
    }

    @After
    public void tearDown() throws Exception {
        dictdataDao.deleteDictData("sex", "1");
        dictdataDao.deleteDictData("sex", "2");
    }

    @Test
    public void insertDictData() throws Exception {
        int insertCount1 = dictdataDao.insertDictData(dictdata_man);
        int insertCount2 = dictdataDao.insertDictData(dictdata_woman);
        assertEquals(1, insertCount1);
        assertEquals(1, insertCount2);
    }

    @Test
    public void deleteDictData() throws Exception {
        int insertCount1 = dictdataDao.insertDictData(dictdata_man);
        int deleteCount = dictdataDao.deleteDictData("sex", "1");
        assertEquals(1,deleteCount);
    }

    @Test
    public void updateDictData() throws Exception {
        int insertCount1 = dictdataDao.insertDictData(dictdata_man);
        dictdata_man = dictdataDao.selectDictData("sex", "1");
        dictdata_man.setDataname("不男不女");
        int updateCount = dictdataDao.updateDictData(dictdata_man);
        assertEquals(1,updateCount);
    }

    @Test
    public void selectDictData() throws Exception {
        int insertCount1 = dictdataDao.insertDictData(dictdata_man);
        dictdata_man = dictdataDao.selectDictData("sex", "1");
        assertNotNull(dictdata_man);
    }

    @Test
    public void selectAll() throws Exception {
        int insertCount1 = dictdataDao.insertDictData(dictdata_man);
        int insertCount2 = dictdataDao.insertDictData(dictdata_woman);
        List<FrameDictdata> datalist = dictdataDao.selectAllByDictcode("sex");
        assertEquals(2,datalist.size());
    }

}