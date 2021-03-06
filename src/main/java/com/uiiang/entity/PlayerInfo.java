package com.uiiang.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by fuliqiang on 2017/4/29.
 */
@Entity
public class PlayerInfo {

    /** The open id. */
    @Id
    private String openId;

    /** The nick name. */
    private String nickName;

    /** The avatar url. */
    private String avatarUrl;

    /** The gender. */
    private Integer gender;

    /** The language. */
    private String language;

    /** The city. */
    private String city;

    /** The province. */
    private String province;

    /** The country. */
    private String country;

    private String role;//player, admin

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
