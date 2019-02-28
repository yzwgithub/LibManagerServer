package org.andios.service;

import org.andios.bean.MyAppointmentBean;

import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/28
 */
public interface MyAppointmentService {
    //保存的方法
    void save(MyAppointmentBean myAppointmentBean);

    //更新的方法
    void update(MyAppointmentBean myAppointmentBean);

    //通过ID进行查找
    MyAppointmentBean findUserById(int id);

    //通过HQL语句进行查找
    List<MyAppointmentBean> findUserByHQL(String hql);

    //通过ID进行删除
    void delete(int id);
}
