package org.andios.service;

import org.andios.bean.UserBean;

import java.util.List;

/**
 * Created by ZheWenYang on 2019/1/27
 */
public interface UserService {
    //保存的方法
    void save(UserBean bean);

    //更新的方法
    void update(UserBean bean);

    //通过ID进行查找
    UserBean findUserById(int id);

    //通过HQL语句进行查找
    List<UserBean> findUserByHQL(String hql);

    //通过ID进行删除
    void delete(int id);
}
