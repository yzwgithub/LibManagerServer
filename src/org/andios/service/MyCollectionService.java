package org.andios.service;

import org.andios.bean.MyCollectionBean;

import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/28
 */
public interface MyCollectionService {
    //保存的方法
    void save(MyCollectionBean myCollectionBean);

    //更新的方法
    void update(MyCollectionBean myCollectionBean);

    //通过ID进行查找
    MyCollectionBean findUserById(int id);

    //通过HQL语句进行查找
    List<MyCollectionBean> findUserByHQL(String hql);

    //通过ID进行删除
    void delete(int id);

    //通过字段HQL语句删除
    void delete(String hql);
}
