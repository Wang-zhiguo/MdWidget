package cn.wangzg.mdwidget.Utils;

import com.google.gson.Gson;

import java.util.ArrayList;

import cn.wangzg.mdwidget.tech.TechBean;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Time: 2019/3/1
 * Author: wangzhiguo
 * Description: 功能描述
 */
public class HttpUtil {
    //http://gank.io/api/data/Android/10/1
    /**
     * 使用OkHttp访问网络，异步调用
     * @param address  网络地址
     * @param callback  回调
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address).build();
        client.newCall(request).enqueue(callback);
    }

    /**
     * 使用GSON进行解析
     * @param strJson
     * @return
     */
    public static ArrayList<TechBean.ResultsBean> getNewsListByGson(String strJson) {
        ArrayList<TechBean.ResultsBean> list = null;
        Gson gson = new Gson();
        TechBean bean = gson.fromJson(strJson,TechBean.class);
        if(!bean.isError()){
            return (ArrayList<TechBean.ResultsBean>) bean.getResults();
        }
        return null;
    }

    public static String getUrl(String type,int pageCount,int page){
        return "http://gank.io/api/data/"+type+"/"+pageCount+"/"+page;
    }
}
