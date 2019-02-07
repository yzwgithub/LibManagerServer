package org.andios.service_implement;

import org.andios.bean.UserBean;
import org.andios.service.UserService;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZheWenYang on 2019/1/27
 */
@Transactional
@Service("userImplement")
public class UserImplement implements UserService {
    @Resource
    SessionFactory factory;

    @Override
    public void save(UserBean bean) {
        factory.getCurrentSession().persist(bean);
    }

    @Override
    public void update(UserBean bean) {
        factory.getCurrentSession().merge(bean);
    }

    @Override
    public UserBean findUserById(int id) {
        return factory.getCurrentSession().get(UserBean.class,id);
    }

    @Override
    public List<UserBean> findUserByHQL(String hql) {
        Query hqlQuery=factory.getCurrentSession().createQuery(hql);
        return hqlQuery.list();
    }


    @Override
    public void delete(int id) {
        factory.getCurrentSession().delete(findUserById(id));
    }
}
