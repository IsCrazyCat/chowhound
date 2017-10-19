package com.spring.mvc.service;

import com.spring.mvc.dto.request.delicacy.DelicacyDTO;
import com.spring.mvc.model.DelicacyModel;

import java.util.List;

/**
 * @author guojunguang
 * @date 2017/10/13
 * @decription 美食类相关service
 */
public interface DelicacyService {
    /**
     * 查询delicacy
     * @param delicacyModel 查询条件
     * @return
     */
    List<DelicacyDTO> findDelicacy(DelicacyModel delicacyModel);
}
