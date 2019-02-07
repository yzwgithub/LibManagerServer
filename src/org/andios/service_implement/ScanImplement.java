package org.andios.service_implement;

import org.andios.bean.ScanBean;
import org.andios.service.ScanService;
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
@Service("showImplement")

public class ScanImplement implements ScanService {
    @Resource
    SessionFactory factory;

    @Override
    public void save(ScanBean scanBean) {
        factory.getCurrentSession().persist(scanBean);
    }

    @Override
    public void update(ScanBean scanBean) {
        factory.getCurrentSession().merge(scanBean);
    }

    @Override
    public ScanBean findUserById(int id) {
        return factory.getCurrentSession().get(ScanBean.class,id);
    }

    @Override
    public List<ScanBean> findUserByHQL(String hql) {
        Query hqlQuery=factory.getCurrentSession().createQuery(hql);
        return hqlQuery.list();
    }

    @Override
    public void delete(int id) {
        factory.getCurrentSession().delete(findUserById(id));
    }
}
