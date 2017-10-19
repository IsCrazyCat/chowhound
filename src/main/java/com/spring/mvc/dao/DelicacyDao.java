package com.spring.mvc.dao;

import com.spring.mvc.dto.request.delicacy.DelicacyDTO;
import com.spring.mvc.model.DelicacyModel;

import java.util.List;

/**
 * @author guojunguang
 * @date 2017/7/31
 * @decription
 */
public interface DelicacyDao {
    /**
     * 查询delicacy
     * @param delicacyModel 查询条件
     * @return
     */
    List<DelicacyDTO> findDelicacy(DelicacyModel delicacyModel);
}
