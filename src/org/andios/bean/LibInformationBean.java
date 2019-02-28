package org.andios.bean;

/**
 * Created by ZheWenYang on 2019/1/31
 */

public class LibInformationBean {

    private int lib_id;
    private String picture_url;
    private String show_title;
    private String show_information;

    public LibInformationBean() {

    }

    public LibInformationBean(String picture_url, String show_title, String show_information) {
        this.picture_url = picture_url;
        this.show_title = show_title;
        this.show_information = show_information;
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

    public String getShow_title() {
        return show_title;
    }

    public void setShow_title(String show_title) {
        this.show_title = show_title;
    }

    public String getShow_information() {
        return show_information;
    }

    public void setShow_information(String show_information) {
        this.show_information = show_information;
    }
}
