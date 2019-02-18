package org.andios.service_implement;

import org.andios.bean.AppointmentBean;
import org.andios.service.AppointmentService;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/18
 */
@Transactional
@Service("appointmentImplement")
public class AppointmentImplement implements AppointmentService {
    @Resource
    SessionFactory factory;

    @Override
    public void save(AppointmentBean informationBean) {
        factory.getCurrentSession().persist(informationBean);
    }

    @Override
    public void update(AppointmentBean informationBean) {
        factory.getCurrentSession().merge(informationBean);
    }

    @Override
    public List<AppointmentBean> findUserByHQL(String hql) {
        Query hqlQuery=factory.getCurrentSession().createQuery(hql);
        return hqlQuery.list();
    }
}
