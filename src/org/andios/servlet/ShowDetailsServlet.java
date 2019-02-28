package org.andios.servlet;

import com.google.gson.Gson;

import org.andios.bean.ShowDetailsBean;
import org.andios.service.ShowDetailsService;
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
 * Created by ZheWenYang on 2019/2/25
 */
@WebServlet(name = "ShowDetailsServlet")
public class ShowDetailsServlet extends HttpServlet {
    private ApplicationContext context=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String show_id = request.getParameter("show_id");
        Gson gson=new Gson();
        context = Constant.getContext();
        ShowDetailsService showDetailsService = (ShowDetailsService) context.getBean("showDetailsImplement");
        ShowDetailsBean bean=showDetailsService.findUserById(Integer.parseInt(show_id));
        out.write(gson.toJson(bean));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
