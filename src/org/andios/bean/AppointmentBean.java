package org.andios.bean;

/**
 * 文件描述：
 * 作者：ZheWenYang
 * 创建时间：2019/2/17
 */

public class AppointmentBean {
    private int appointment_id;
    private String lib_name;
    private String date;
    private String time;
    private String college_name;
    private String class_name;
    private String number_of_class;
    private String experiment_name;
    private String experiment_subject;

    public AppointmentBean() {
    }

    public AppointmentBean(String lib_name, String date, String time,
                           String college_name, String class_name,
                           String number_of_class, String experiment_name,
                           String experiment_subject) {
        this.lib_name = lib_name;
        this.date = date;
        this.time = time;
        this.college_name = college_name;
        this.class_name = class_name;
        this.number_of_class = number_of_class;
        this.experiment_name = experiment_name;
        this.experiment_subject = experiment_subject;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public String getLib_name() {
        return lib_name;
    }

    public void setLib_name(String lib_name) {
        this.lib_name = lib_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getNumber_of_class() {
        return number_of_class;
    }

    public void setNumber_of_class(String number_of_class) {
        this.number_of_class = number_of_class;
    }

    public String getExperiment_name() {
        return experiment_name;
    }

    public void setExperiment_name(String experiment_name) {
        this.experiment_name = experiment_name;
    }

    public String getExperiment_subject() {
        return experiment_subject;
    }

    public void setExperiment_subject(String experiment_subject) {
        this.experiment_subject = experiment_subject;
    }

    @Override
    public String toString() {
        return "AppointmentBean{" +
                "appointment_id=" + appointment_id +
                ", lib_name='" + lib_name + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", college_name='" + college_name + '\'' +
                ", class_name='" + class_name + '\'' +
                ", number_of_class='" + number_of_class + '\'' +
                ", experiment_name='" + experiment_name + '\'' +
                ", experiment_subject='" + experiment_subject + '\'' +
                '}';
    }
}
