package org.andios.servlet;

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

/**
 * Created by ZheWenYang on 2019/1/9
 */
@WebServlet(name = "ResetUserServlet")
public class ResetUserServlet extends HttpServlet {
    private ApplicationContext context=null;
    private UserService userService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        context= Constant.getContext();
        userService= (UserService) context.getBean("userImplement");

        String u_id_string=request.getParameter("u_id");
        String u_name=request.getParameter("u_id");
        String u_password=request.getParameter("u_id");
        String u_nickName=request.getParameter("u_id");

        int u_id=Constant.toInt(u_id_string);

        //通过邮箱验证
        userService.save(new UserBean(u_id,u_name,u_password,u_nickName));

    }
}
