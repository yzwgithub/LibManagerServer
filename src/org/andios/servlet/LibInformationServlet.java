package org.andios.servlet;

import com.google.gson.Gson;
import org.andios.bean.LibInformationBean;
import org.andios.service.LibInformationService;
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
 * Created by ZheWenYang on 2019/2/7
 */
@WebServlet(name = "LibInformationServlet")
public class LibInformationServlet extends HttpServlet {
    private ApplicationContext context=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        Gson gson=new Gson();
        context = Constant.getContext();
        LibInformationService informationService = (LibInformationService) context.getBean("libInformationImplement");
        String Sql="from LibInformationBean";
        List<LibInformationBean>list=informationService.findUserByHQL(Sql);
        String stringList=gson.toJson(list);
        out.write(stringList);
    }
}
