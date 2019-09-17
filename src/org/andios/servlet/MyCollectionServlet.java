package org.andios.servlet;

import com.google.gson.Gson;
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
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by ZheWenYang on 2019/2/28
 */
@WebServlet(name = "MyCollectionServlet")
public class MyCollectionServlet extends HttpServlet {
    private ApplicationContext context=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Gson gson=new Gson();
        context = Constant.getContext();
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        String collection_u_index=request.getParameter("u_index");
        MyCollectionService myCollectionService = (MyCollectionService) context.getBean("myCollectionImplement");
        String Sql="from MyCollectionBean where u_index='"+collection_u_index+"'";
        List<MyCollectionBean> list= myCollectionService.findUserByHQL(Sql);
        String stringList=gson.toJson(list);
        PrintWriter out = response.getWriter();
        out.write(stringList);
    }
}
