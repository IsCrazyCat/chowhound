package com.spring.mvc.service.impl;

import com.spring.mvc.dao.DelicacyDao;
import com.spring.mvc.dto.request.delicacy.DelicacyDTO;
import com.spring.mvc.model.DelicacyModel;
import com.spring.mvc.service.DelicacyService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * @author guojunguang
 * @date 2017/10/13
 * @decription
 */
@Service
public class DelicacyServiceImpl implements DelicacyService {

    @Inject
    private DelicacyDao delicacyDao;

    public List<DelicacyDTO> findDelicacy(DelicacyModel delicacyModel) {
        return delicacyDao.findDelicacy(delicacyModel);
    }
}
