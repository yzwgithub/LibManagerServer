package org.andios.service_implement;

import org.andios.bean.LibDetailsBean;
import org.andios.service.LibDetailsService;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/27
 */
@Transactional
@Service("libDetailsImplement")
public class LibDetailsImplement implements LibDetailsService {
    @Resource
    SessionFactory factory;

    @Override
    public void save(LibDetailsBean libDetailsBean) {
        factory.getCurrentSession().persist(libDetailsBean);
    }

    @Override
    public void update(LibDetailsBean libDetailsBean) {
        factory.getCurrentSession().merge(libDetailsBean);
    }

    @Override
    public LibDetailsBean findUserById(int id) {
        return factory.getCurrentSession().get(LibDetailsBean.class,id);
    }

    @Override
    public List<LibDetailsBean> findUserByHQL(String hql) {
        Query hqlQuery=factory.getCurrentSession().createQuery(hql);
        return hqlQuery.list();
    }

    @Override
    public void delete(int id) {
        factory.getCurrentSession().delete(findUserById(id));
    }
}
