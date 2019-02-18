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
 * Created by ZheWenYang on 2019/2/18
 */
@WebServlet(name = "AppointmentServlet")
public class AppointmentServlet extends HttpServlet {
    private ApplicationContext context=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        String appointmentBean=request.getParameter("appointmentBean");

        Gson gson=new Gson();
        AppointmentBean bean=gson.fromJson(appointmentBean, new TypeToken<AppointmentBean>(){}.getType());
        context = Constant.getContext();

        AppointmentService appointmentService= (AppointmentService) context.getBean("appointmentImplement");
        appointmentService.save(bean);
    }
}
