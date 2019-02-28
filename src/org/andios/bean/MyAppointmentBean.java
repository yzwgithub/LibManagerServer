package org.andios.bean;

/**
 * Created by ZheWenYang on 2019/2/28
 */
public class MyAppointmentBean {
    private int appointment_index;
    private int u_index;
    private int appointment_id;

    public MyAppointmentBean() {
    }

    public MyAppointmentBean(int appointment_index, int u_index, int appointment_id) {
        this.appointment_index = appointment_index;
        this.u_index = u_index;
        this.appointment_id = appointment_id;
    }

    public int getAppointment_index() {
        return appointment_index;
    }

    public void setAppointment_index(int appointment_index) {
        this.appointment_index = appointment_index;
    }

    public int getU_index() {
        return u_index;
    }

    public void setU_index(int u_index) {
        this.u_index = u_index;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }
}
