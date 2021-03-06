package org.andios.service;

import org.andios.bean.LibInformationBean;
import org.andios.bean.ShowInformationBean;

import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/7
 */
public interface LibInformationService {
    //保存的方法
    void save(LibInformationBean libInformationBean);

    //更新的方法
    void update(LibInformationBean libInformationBean);

    //通过ID进行查找
    LibInformationBean findUserById(int id);

    //通过HQL语句进行查找
    List<LibInformationBean> findUserByHQL(String hql);

    //通过ID进行删除
    void delete(int id);
}
