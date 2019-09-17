package org.andios.servlet;

import com.google.gson.Gson;
import org.andios.bean.MyAppointmentBean;
import org.andios.service.MyAppointmentService;
import org.andios.util.Constant;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/28
 */
@WebServlet(name = "MyAppointmentServlet")
public class MyAppointmentServlet extends HttpServlet {
    private ApplicationContext context=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        String u_index=request.getParameter("u_index");
        Gson gson=new Gson();
        context = Constant.getContext();
        MyAppointmentService myAppointmentService = (MyAppointmentService) context.getBean("myAppointmentImplement");
        String Sql="from MyAppointmentBean where u_index='"+u_index+"'";
        List<MyAppointmentBean> list= myAppointmentService.findUserByHQL(Sql);
        String stringList=gson.toJson(list);
        PrintWriter out = response.getWriter();
        out.write(stringList);
    }
}
