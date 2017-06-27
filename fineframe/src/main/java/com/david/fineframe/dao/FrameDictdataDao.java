package com.david.fineframe.dao;

import com.david.fineframe.entity.FrameDictdata;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by sunqinwei on 2017/6/21.
 */
public interface FrameDictdataDao {
    int insertDictData(FrameDictdata dictdata);

    int deleteDictData(@Param("dictcode") String dictcode, @Param("datacode") String datacode);

    int updateDictData(FrameDictdata dictdata);

    FrameDictdata selectDictData(@Param("dictcode") String dictcode, @Param("datacode") String datacode);

    List<FrameDictdata> selectAllByDictcode(String dictcode);
}
