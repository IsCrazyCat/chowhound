package com.spring.mvc.controller;

import com.spring.mvc.dto.request.delicacy.DelicacyDTO;
import com.spring.mvc.dto.response.ResponseDTO;
import com.spring.mvc.enums.ResponseEnum;
import com.spring.mvc.model.DelicacyModel;
import com.spring.mvc.service.DelicacyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * @author guojunguang
 * @date 2017/10/13
 * @decription
 */
@Controller
@RequestMapping("/delicacy")
public class DelicacyController {
    private final static Logger LOGGER = LoggerFactory.getLogger(DelicacyController.class);

    @Inject
    private DelicacyService delicacyService;

    @RequestMapping("/delicacy")
    public String goDelicacyList(){
        return "/delicacy/delicacy";
    }

    /**
     * 获取delicacy列表
     * @param delicacyDTO
     * @return
     */
    @RequestMapping(value = "/delicacys",method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<List<DelicacyDTO>> delicacyList(DelicacyDTO delicacyDTO){
        ResponseDTO<List<DelicacyDTO>> responseDTO = new ResponseDTO<List<DelicacyDTO>>();
        try{
            DelicacyModel delicacyModel = new DelicacyModel();
            BeanUtils.copyProperties(delicacyDTO,delicacyModel);
            responseDTO.setResponseData(delicacyService.findDelicacy(delicacyModel));
            responseDTO.setCode(ResponseEnum.SUCCESS.getCode());
        }catch (Exception e){
            LOGGER.error("ERROR delicacyList POST {}",e.toString());
            e.printStackTrace();
        }
        return responseDTO;
    }
}
