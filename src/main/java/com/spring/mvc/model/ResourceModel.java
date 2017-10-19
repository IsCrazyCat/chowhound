package com.spring.mvc.model;

/**
 * @author guojunguang
 * @date 2017/7/28
 * @decription 资源Model表
 */
public class ResourceModel {

    private String id;
    private String name;
    private String url;
    private String suffix;//文件后缀
    private String type;//文件类型
    private String chowhoundId;
    private String createtime;
    private String flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
