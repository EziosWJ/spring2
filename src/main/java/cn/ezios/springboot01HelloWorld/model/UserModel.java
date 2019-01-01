package cn.ezios.springboot01HelloWorld.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @ClassName UserModel
 * @Description TODO
 * @Date 2019/1/1 17:19
 * @Creaded By Wangj
 */
public class UserModel {
    @JsonProperty("ppd")
    private String id;
    private String name;
    @JsonIgnore
    private String password;
    private int sex;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phone;
    @JsonFormat(pattern = "yyyy-MM-DD hh:mm:ss" ,locale = "zh",timezone = "GMT+8")
    private Date createTime;

    public UserModel() {
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public UserModel(String id, String name, String password, int sex, String phone, Date createTime) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.phone = phone;
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
