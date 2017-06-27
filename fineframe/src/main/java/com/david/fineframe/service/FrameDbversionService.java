package com.david.fineframe.service;

import com.david.fineframe.entity.FrameDbversion;

/**
 *
 * Created by sunqinwei on 2017/6/22.
 */
public interface FrameDbversionService {
   FrameDbversion update(FrameDbversion dbversion) throws RuntimeException;
}
