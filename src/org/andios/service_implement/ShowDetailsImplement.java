package org.andios.service_implement;

import org.andios.bean.ShowDetailsBean;
import org.andios.service.ShowDetailsService;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/25
 */
@Transactional
@Service("showDetailsImplement")
public class ShowDetailsImplement implements ShowDetailsService {
    @Resource
    SessionFactory factory;

    @Override
    public void save(ShowDetailsBean showDetailsBean) {
        factory.getCurrentSession().persist(showDetailsBean);
    }

    @Override
    public void update(ShowDetailsBean showDetailsBean) {
        factory.getCurrentSession().merge(showDetailsBean);
    }

    @Override
    public ShowDetailsBean findUserById(int id) {
        return factory.getCurrentSession().get(ShowDetailsBean.class,id);
    }

    @Override
    public List<ShowDetailsBean> findUserByHQL(String hql) {
        Query hqlQuery=factory.getCurrentSession().createQuery(hql);
        return hqlQuery.list();
    }

    @Override
    public void delete(int id) {
        factory.getCurrentSession().delete(findUserById(id));
    }
}
