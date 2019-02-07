package org.andios.service;

import org.andios.bean.ScanBean;

import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/3
 */
public interface ScanService {
    //保存的方法
    void save(ScanBean scanBean);

    //更新的方法
    void update(ScanBean scanBean);

    //通过ID进行查找
    ScanBean findUserById(int id);

    //通过HQL语句进行查找
    List<ScanBean> findUserByHQL(String hql);

    //通过ID进行删除
    void delete(int id);


}
