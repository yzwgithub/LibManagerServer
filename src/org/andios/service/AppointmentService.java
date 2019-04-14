package org.andios.service;

import org.andios.bean.AppointmentBean;

import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/18
 */
public interface AppointmentService {
    //保存的方法
    void save(AppointmentBean informationBean);

    //更新的方法
    void update(AppointmentBean informationBean);

    //通过ID进行查找
    AppointmentBean findUserById(int id);

    //通过HQL语句进行查找
    List<AppointmentBean> findUserByHQL(String hql);

    //通过ID进行删除
//    void delete(int id);
}
