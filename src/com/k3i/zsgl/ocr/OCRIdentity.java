package com.k3i.zsgl.ocr;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;

import java.util.HashMap;

public class OCRIdentity {


        //设置APPID/AK/SK
        public static final String APP_ID = "11166899";
        public static final String API_KEY = "vxpk2dhRen8ptuDuKm4PAbF4";
        public static final String SECRET_KEY = "wdoOt5qFtrCHj0g7QYPQdoKZc9E5qpMy ";

        public String  getCode(String imageurl) {
            // 初始化一个AipOcr
            AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

            // 可选：设置网络连接参数
            client.setConnectionTimeoutInMillis(2000);
            client.setSocketTimeoutInMillis(60000);

        /*    // 可选：设置代理服务器地址, http和socket：q二选一，或者均不设置
            client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
            client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理*/

            // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
            // 也可以直接通过jvm启动参数设置此环境变量
//            System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

            // 调用接口
            String path = "test.jpg";
            JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
            System.out.println(res.toString(2));
            return res.toString();

        }

}
