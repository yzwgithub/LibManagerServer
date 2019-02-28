package org.andios.bean;

/**
 * Created by ZheWenYang on 2019/2/4
 */
public class ShowInformationBean {

    private int show_id;
    private String picture_url;
    private String show_information;

    public ShowInformationBean() {
    }

    public ShowInformationBean(String picture_url, String show_information) {
        this.picture_url = picture_url;
        this.show_information = show_information;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public String getShow_information() {
        return show_information;
    }

    public void setShow_information(String show_information) {
        this.show_information = show_information;
    }
}
