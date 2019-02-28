package org.andios.service;

import org.andios.bean.LibDetailsBean;

import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/27
 */
public interface LibDetailsService {
    //保存的方法
    void save(LibDetailsBean libDetailsBean);

    //更新的方法
    void update(LibDetailsBean libDetailsBean);

    //通过ID进行查找
    LibDetailsBean findUserById(int id);

    //通过HQL语句进行查找
    List<LibDetailsBean> findUserByHQL(String hql);

    //通过ID进行删除
    void delete(int id);
}
