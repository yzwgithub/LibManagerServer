package org.andios.servlet;

import com.google.gson.Gson;
import org.andios.bean.ScanBean;
import org.andios.service.ScanService;
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
 * Created by ZheWenYang on 2019/2/4
 */
@WebServlet(name = "ScanServlet ")
public class ScanServlet extends HttpServlet {
    private ApplicationContext context=null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        Gson gson=new Gson();
        context = Constant.getContext();
        ScanService scanService = (ScanService) context.getBean("showImplement");
        String Sql="from ScanBean";
        List<ScanBean> list=scanService.findUserByHQL(Sql);
        String stringList=gson.toJson(list);
        out.write(stringList);

    }
}
