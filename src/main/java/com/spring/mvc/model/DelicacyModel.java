package com.spring.mvc.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @author guojunguang
 * @date 2017/7/28
 * @decription 美食model类
 */
public class DelicacyModel extends BaseModel implements Serializable{

    private static final long serialVersionUID = 6340166357728132564L;

    private String id;
    private String name;
    private String nickname;
    private String type;
    private String country;
    private String isSend;
    private String territoryId;
    private String chowhoundId;
    private String lovecount;
    private String hatecount;
    private String createtime;
    private boolean flag;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend;
    }

    public String getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }

    public String getChowhoundId() {
        return chowhoundId;
    }

    public void setChowhoundId(String chowhoundId) {
        this.chowhoundId = chowhoundId;
    }

    public String getLovecount() {
        return lovecount;
    }

    public void setLovecount(String lovecount) {
        this.lovecount = lovecount;
    }

    public String getHatecount() {
        return hatecount;
    }

    public void setHatecount(String hatecount) {
        this.hatecount = hatecount;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString(){return ToStringBuilder.reflectionToString(this);}
}
