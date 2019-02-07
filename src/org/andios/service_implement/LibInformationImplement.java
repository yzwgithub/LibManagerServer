package org.andios.service_implement;

import org.andios.bean.LibInformationBean;
import org.andios.service.LibInformationService;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/7
 */

@Transactional
@Service("libInformationImplement")
public class LibInformationImplement implements LibInformationService {
    @Resource
    SessionFactory factory;


    @Override
    public void save(LibInformationBean informationBean) {
        factory.getCurrentSession().persist(informationBean);
    }

    @Override
    public void update(LibInformationBean informationBean) {
        factory.getCurrentSession().merge(informationBean);
    }

    @Override
    public LibInformationBean findUserById(int id) {
        return factory.getCurrentSession().get(LibInformationBean.class,id);
    }

    @Override
    public List<LibInformationBean> findUserByHQL(String hql) {
        Query hqlQuery=factory.getCurrentSession().createQuery(hql);
        return hqlQuery.list();
    }

    @Override
    public void delete(int id) {
        factory.getCurrentSession().delete(findUserById(id));
    }
}
