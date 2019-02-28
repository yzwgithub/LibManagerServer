package org.andios.service_implement;

import org.andios.bean.MyAppointmentBean;
import org.andios.service.MyAppointmentService;
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
@Service("myAppointmentImplement")
public class MyAppointmentImplement implements MyAppointmentService {
    @Resource
    SessionFactory factory;

    @Override
    public void save(MyAppointmentBean myAppointmentBean) {
        factory.getCurrentSession().persist(myAppointmentBean);
    }

    @Override
    public void update(MyAppointmentBean myAppointmentBean) {
        factory.getCurrentSession().merge(myAppointmentBean);
    }

    @Override
    public MyAppointmentBean findUserById(int id) {
        return factory.getCurrentSession().get(MyAppointmentBean.class,id);
    }

    @Override
    public List<MyAppointmentBean> findUserByHQL(String hql) {
        Query hqlQuery=factory.getCurrentSession().createQuery(hql);
        return hqlQuery.list();
    }

    @Override
    public void delete(int id) {
        factory.getCurrentSession().delete(findUserById(id));
    }
}
