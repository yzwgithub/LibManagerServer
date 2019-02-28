package org.andios.bean;

/**
 * Created by ZheWenYang on 2019/2/25
 */
public class ShowDetailsBean {
    private int show_id;
    private String title;
    private String imgUrl;
    private String subTitle;
    private String content;

    public ShowDetailsBean() {
    }

    public ShowDetailsBean(String title, String imgUrl, String subTitle, String content) {
        this.title = title;
        this.imgUrl = imgUrl;
        this.subTitle = subTitle;
        this.content = content;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
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
