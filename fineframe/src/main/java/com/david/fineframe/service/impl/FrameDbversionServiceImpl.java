package com.david.fineframe.service.impl;

import com.david.fineframe.dao.FrameDbversionDao;
import com.david.fineframe.entity.FrameDbversion;
import com.david.fineframe.service.FrameDbversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunqinwei on 2017/6/22.
 */
@Service
public class FrameDbversionServiceImpl implements FrameDbversionService {
    @Autowired
    private FrameDbversionDao dbversionDao;

    @Override
    public FrameDbversion update(FrameDbversion dbversion) throws RuntimeException{
        FrameDbversion result = dbversionDao.selectDbversion(dbversion.getSoftware());
        if (result == null) {
            int inserCount = dbversionDao.insertDbversion(dbversion);
            if (inserCount == 0) throw new RuntimeException("升级失败!");
            result = dbversion;
        }
        else{
            result.setVersion(dbversion.getVersion());
            result.setLog(dbversion.getLog());
            result.setCreatedBy(dbversion.getCreatedBy());
            result.setUpdatedBy(dbversion.getUpdatedBy());
        }

        int updateCount = dbversionDao.updateDbversion(result);
        if (updateCount == 0) throw new RuntimeException("升级失败!");
        return dbversionDao.selectDbversion(dbversion.getSoftware());
    }
}
