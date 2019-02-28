package org.andios.service;

import org.andios.bean.ShowInformationBean;

import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/3
 */
public interface ShowInformationService {
    //保存的方法
    void save(ShowInformationBean showInformationBean);

    //更新的方法
    void update(ShowInformationBean showInformationBean);

    //通过ID进行查找
    ShowInformationBean findUserById(int id);

    //通过HQL语句进行查找
    List<ShowInformationBean> findUserByHQL(String hql);

    //通过ID进行删除
    void delete(int id);


}
