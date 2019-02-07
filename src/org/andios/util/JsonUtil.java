package org.andios.util;

import com.google.gson.Gson;

/**
 * Created by ZheWenYang on 2019/2/6
 */
public class JsonUtil {
    Gson gson=new Gson();

    public String ObjectToJson(Object o){
        String str=gson.toJson(o);
        return str;
    }
}
