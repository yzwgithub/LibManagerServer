package org.andois.servlet;

import org.andois.db.UserDb;
import org.andois.bean.UserBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ZheWenYang on 2019/1/9
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    private UserBean bean;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        bean=new UserBean();
        if (request==null){
            return;
        }
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();
        bean.setU_id(request.getParameter("user_id"));
        bean.setU_name(request.getParameter("account"));
        bean.setU_password(request.getParameter("password"));
        if (UserDb.connect(bean.getU_id(),bean.getU_name(),bean.getU_password())){
            out.write("200");
            System.out.println("用户"+bean.getU_name()+"登录成功");
        } else {
            out.write("404");
        }
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
