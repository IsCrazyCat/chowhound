package com.spring.mvc.model;

/**
 * @author guojunguang
 * @date 2017/7/28
 * @decription 评价model类
 */
public class OpinionModel {

    private String id;
    private String resource;
    private String description;
    private String type;
    private String opinionObj;
    private String opinionObjId;
    private String chowhoundId;
    private String createtime;
    private String flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOpinionObj() {
        return opinionObj;
    }

    public void setOpinionObj(String opinionObj) {
        this.opinionObj = opinionObj;
    }

    public String getOpinionObjId() {
        return opinionObjId;
    }

    public void setOpinionObjId(String opinionObjId) {
        this.opinionObjId = opinionObjId;
    }

    public String getChowhoundId() {
        return chowhoundId;
    }

    public void setChowhoundId(String chowhoundId) {
        this.chowhoundId = chowhoundId;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
