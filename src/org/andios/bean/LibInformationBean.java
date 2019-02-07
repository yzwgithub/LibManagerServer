package org.andios.bean;

/**
 * Created by ZheWenYang on 2019/2/4
 */
public class LibInformationBean {

    private int lib_id;
    private String picture_url;
    private String lib_information;

    public LibInformationBean() {
    }

    public LibInformationBean(String picture_url, String lib_information) {
        this.picture_url = picture_url;
        this.lib_information = lib_information;
    }

    public int getLib_id() {
        return lib_id;
    }

    public void setLib_id(int lib_id) {
        this.lib_id = lib_id;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public String getLib_information() {
        return lib_information;
    }

    public void setLib_information(String lib_information) {
        this.lib_information = lib_information;
    }
}
