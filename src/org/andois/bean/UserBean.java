package org.andois.bean;

/**
 * Created by ZheWenYang on 2019/1/9
 */
public class UserBean {
    String u_id;
    String u_name;
    String u_password;
    String u_nickName;

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public void setU_nickName(String u_nickName) {
        this.u_nickName = u_nickName;
    }

    public String getU_id() {
        return u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public String getU_password() {
        return u_password;
    }

    public String getU_nickName() {
        return u_nickName;
    }

}