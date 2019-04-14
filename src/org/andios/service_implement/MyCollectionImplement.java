package org.andios.service_implement;

import org.andios.bean.MyCollectionBean;
import org.andios.service.MyCollectionService;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/28
 */
@Transactional
@Service("myCollectionImplement")
public class MyCollectionImplement implements MyCollectionService {
    @Resource
    SessionFactory factory;

    @Override
    public void save(MyCollectionBean myCollectionBean) {
        factory.getCurrentSession().persist(myCollectionBean);
    }

    @Override
    public void update(MyCollectionBean myCollectionBean) {
        factory.getCurrentSession().merge(myCollectionBean);
    }

    @Override
    public MyCollectionBean findUserById(int id) {
        return factory.getCurrentSession().get(MyCollectionBean.class,id);
    }

    @Override
    public List<MyCollectionBean> findUserByHQL(String hql) {
        Query hqlQuery=factory.getCurrentSession().createQuery(hql);
        return hqlQuery.list();
    }

    @Override
    public void delete(int id) {
        factory.getCurrentSession().delete(findUserById(id));
    }

    @Override
    public void delete(String hql) {
        factory.getCurrentSession().createQuery(hql);
    }
}
