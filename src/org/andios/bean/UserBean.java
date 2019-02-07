package org.andios.bean;

/**
 * Created by ZheWenYang on 2019/1/9
 */
public class UserBean {
    private int u_index;
    private int u_id;
    private String u_name;
    private String u_password;
    private String u_nickName;

    public UserBean() {
    }

    public UserBean(int u_id, String u_name, String u_password, String u_nickName) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_password = u_password;
        this.u_nickName = u_nickName;
    }

    public void setU_index(int u_index) {
        this.u_index = u_index;
    }
    public void setU_id(int u_id) {
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

    public int getU_index() {
        return u_index;
    }
    public int getU_id() {
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

    @Override
    public String toString() {
        return "UserBean{" +
                "u_id='" + u_id + '\'' +
                ", u_name='" + u_name + '\'' +
                ", u_password='" + u_password + '\'' +
                ", u_nickName='" + u_nickName + '\'' +
                '}';
    }
}
