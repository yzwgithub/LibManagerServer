package org.andios.bean;

/**
 * Created by ZheWenYang on 2019/2/27
 */
public class LibDetailsBean {
    private int lib_id;
    private String title;
    private String imgUrl;
    private String subTitle;
    private String content;

    public LibDetailsBean() {
    }

    public LibDetailsBean(String title, String imgUrl, String subTitle, String content) {
        this.title = title;
        this.imgUrl = imgUrl;
        this.subTitle = subTitle;
        this.content = content;
    }

    public int getLib_id() {
        return lib_id;
    }

    public void setLib_id(int lib_id) {
        this.lib_id = lib_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
