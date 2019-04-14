package org.andios.servlet;

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
@WebServlet(name = "CancelCollectionServlet")
public class CancelCollectionServlet extends HttpServlet {
    private ApplicationContext context=null;
    MyCollectionService myCollectionService;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        context= Constant.getContext();
        myCollectionService= (MyCollectionService) context.getBean("myCollectionImplement");
        String lib_id=request.getParameter("lib_id");
        String hql="delete MyCollectionBean as M where M.lib_id="+lib_id;
        myCollectionService.delete(hql);
    }
}
