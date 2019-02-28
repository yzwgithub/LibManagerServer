package org.andios.service;

import org.andios.bean.ShowDetailsBean;

import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/25
 */
public interface ShowDetailsService {
    //保存的方法
    void save(ShowDetailsBean showDetailsBean);

    //更新的方法
    void update(ShowDetailsBean showDetailsBean);

    //通过ID进行查找
    ShowDetailsBean findUserById(int id);

    //通过HQL语句进行查找
    List<ShowDetailsBean> findUserByHQL(String hql);

    //通过ID进行删除
    void delete(int id);
}
