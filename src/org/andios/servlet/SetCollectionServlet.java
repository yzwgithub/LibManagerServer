package org.andios.servlet;

import org.andios.bean.MyCollectionBean;
import org.andios.service.MyCollectionService;
import org.andios.util.Constant;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ZheWenYang on 2019/4/1
 */
@WebServlet(name = "SetCollectionServlet")
public class SetCollectionServlet extends HttpServlet {
    private ApplicationContext context=null;
    MyCollectionService myCollectionService;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        context= Constant.getContext();
        myCollectionService= (MyCollectionService) context.getBean("myCollectionImplement");
        String u_index=request.getParameter("u_index");
        String lib_id=request.getParameter("lib_id");
        myCollectionService.save(new MyCollectionBean(Constant.toInt(u_index),Constant.toInt(lib_id)));
    }
}
