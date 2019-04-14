package org.andios.servlet;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.andios.bean.AppointmentBean;
import org.andios.service.AppointmentService;
import org.andios.util.Constant;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ZheWenYang on 2019/4/1
 */
@WebServlet(name = "GetAppointmentServlet")
public class GetAppointmentServlet extends HttpServlet {
    private ApplicationContext context=null;
    private Gson gson;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        gson=new Gson();
        String appointment_id=request.getParameter("appointment_id");

        context = Constant.getContext();

        AppointmentService appointmentService= (AppointmentService) context.getBean("appointmentImplement");
        AppointmentBean bean=appointmentService.findUserById(Constant.toInt(appointment_id));
        out.write(gson.toJson(bean));
    }
}
