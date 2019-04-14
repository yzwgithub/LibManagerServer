package org.andios.bean;

/**
 * Created by ZheWenYang on 2019/2/28
 */
public class MyCollectionBean {
    private int collection_index;
    private int u_index;
    private int lib_id;

    public MyCollectionBean() {
    }

    public MyCollectionBean(int u_index, int lib_id) {
        this.u_index = u_index;
        this.lib_id = lib_id;
    }

    public MyCollectionBean(int collection_index, int u_index, int lib_id) {
        this.collection_index = collection_index;
        this.u_index = u_index;
        this.lib_id = lib_id;
    }

    public int getCollection_index() {
        return collection_index;
    }

    public void setCollection_index(int collection_index) {
        this.collection_index = collection_index;
    }

    public int getU_index() {
        return u_index;
    }

    public void setU_index(int u_index) {
        this.u_index = u_index;
    }

    public int getLib_id() {
        return lib_id;
    }

    public void setLib_id(int lib_id) {
        this.lib_id = lib_id;
    }
}
