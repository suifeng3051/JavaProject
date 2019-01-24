package utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther wanghouda
 * @Date 2018/12/17
 * @Description
 */
public class HttpClientUtilsTest extends TestCase {


    public void testDoPost() {
        String url="http://localhost:8060/tone/open/app/queryOwnerApp";
        Map<String,String> params=new HashMap<>();
        params.put("userInfo","16538");
        params.put("appId","16538");
        try {
            HttpClientResult result= HttpClientUtils.doPost(url,params);
            System.out.println(result.getContent());
            JSONObject jsonObject= JSON.parseObject(result.getContent());
            //JSON.parseArray(jsonObject.getJSONArray("data"),);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}