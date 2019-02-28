package org.andios.service_implement;

import org.andios.bean.ShowInformationBean;
import org.andios.service.ShowInformationService;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/3
 */

@Transactional
@Service("showInformationImplement")

public class ShowInformationImplement implements ShowInformationService {
    @Resource
    SessionFactory factory;

    @Override
    public void save(ShowInformationBean showInformationBean) {
        factory.getCurrentSession().persist(showInformationBean);
    }

    @Override
    public void update(ShowInformationBean showInformationBean) {
        factory.getCurrentSession().merge(showInformationBean);
    }

    @Override
    public ShowInformationBean findUserById(int id) {
        return factory.getCurrentSession().get(ShowInformationBean.class,id);
    }

    @Override
    public List<ShowInformationBean> findUserByHQL(String hql) {
        Query hqlQuery=factory.getCurrentSession().createQuery(hql);
        return hqlQuery.list();
    }

    @Override
    public void delete(int id) {
        factory.getCurrentSession().delete(findUserById(id));
    }
}
