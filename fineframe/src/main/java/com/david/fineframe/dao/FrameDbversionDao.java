package com.david.fineframe.dao;

import com.david.fineframe.entity.FrameDbversion;

/**
 * Created by sunqinwei on 2017/6/21.
 */
public interface FrameDbversionDao {
    int insertDbversion(FrameDbversion dbversion);

    int deleteDbversion(String software);

    int updateDbversion(FrameDbversion dbversion);

    FrameDbversion selectDbversion(String software);
}
