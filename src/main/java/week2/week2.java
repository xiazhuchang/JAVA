package week2;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class week2 {

    public static void main(String[] args) {

        JSONObject json;
        String url = "http://127.0.0.1:8801";
        Map<String, String> paraMap = new HashMap<String, String>();

        try {
            String result = HttpClientUtil.sendPost(url, paraMap);
            if (result == null || result.length() == 0) {
                System.out.println("result is empty.");
            }

            json = JSONObject.parseObject(result);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}