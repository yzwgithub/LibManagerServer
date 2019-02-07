package org.andios.servlet;

import org.andios.bean.UserBean;
import org.andios.service.UserService;
import org.andios.util.Constant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by ZheWenYang on 2019/1/9
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    private ApplicationContext context = null;
    private UserService userService = null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request == null) {
            return;
        }

        baseSet(request,response);

        PrintWriter out = response.getWriter();

        String user_name = request.getParameter("user_name");
        String password = request.getParameter("password");
        List<UserBean> list=list(user_name,password);
        if (!list.isEmpty()) {
            out.write("200");
            System.out.println("用户" + list.get(0).getU_name() + "登录成功");
        } else {
            out.write("404");
        }
        out.flush();
        out.close();
    }

    private List<UserBean> list(String user_name,String password){
        String hql = "from UserBean where u_name='" + user_name + "' and u_password ='" + password + "'";
        context = Constant.getContext();
        userService = (UserService) context.getBean("userImplement");

        List<UserBean> list = userService.findUserByHQL(hql);
        return list;
    }

    private void baseSet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
    }
}
