package org.andios.servlet;

import com.google.gson.Gson;
import org.andios.bean.UserBean;
import org.andios.service.UserService;
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
 * Created by ZheWenYang on 2019/3/31
 */
@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
    private ApplicationContext context=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        context = Constant.getContext();
        Gson gson=new Gson();
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        String u_name=request.getParameter("u_name");
        String u_password=request.getParameter("u_password");
        UserService userService= (UserService) context.getBean("userImplement");
        String Sql="from UserBean where u_name='"+u_name+"' and u_password='"+u_password+"'";
        List<UserBean> list=userService.findUserByHQL(Sql);
        String stringList=gson.toJson(list);
        PrintWriter out = response.getWriter();
        out.write(stringList);
    }
}
