package utils;


import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther wanghouda
 * @Date 2017/12/12
 * @Description
 */
public class SignUtil {
    public static final String GW_SIGN_PARAM = "signature";



    public static boolean checkSign(String clientSecret, Map<String, String> map) throws Exception {
        String signFromRequest = map.get(GW_SIGN_PARAM);
        map.remove(GW_SIGN_PARAM);
        String signFromGenerate = generateSign(map,clientSecret);
        if (signFromRequest.equalsIgnoreCase(signFromGenerate)) {
            return true;
        }else{
            return false;
        }
    }

    public static String generateSign(Map<String, String> paramMap, String secret) throws Exception {
        //生成源串
        String sourceString=generateSourceString(paramMap);
        //对源串进行加密
        String signature=sha256_HMAC(sourceString,secret);

        return signature;
    }

    private static String generateSourceString(Map<String, String> paramMap) {
        //将参数列表按key进行排序
        Object[] key = paramMap.keySet().toArray();
        Arrays.sort(key);
        //构造源串
        StringBuilder sb = new StringBuilder();
        for (int i = key.length - 1; i >= 0; i--) {
            sb.append(paramMap.get(key[i]));
        }
        return sb.toString();
    }

    /**
     * sha256_HMAC加密
     * @param message 消息
     * @param secret  秘钥
     * @return 加密后字符串
     */
    private static String sha256_HMAC(String message, String secret) throws NoSuchAlgorithmException, InvalidKeyException {
        //加密
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
        sha256_HMAC.init(secret_key);
        byte[] bytes = sha256_HMAC.doFinal(message.getBytes());
        //数组转换为16进制字符串
        String signature = byteArrayToHexString(bytes);
        return signature.toUpperCase();
    }

    /**
     * 将加密后的字节数组转换成字符串
     *
     * @param b 字节数组
     * @return 字符串
     */
    private static String byteArrayToHexString(byte[] b) {
        StringBuilder hs = new StringBuilder();
        for (int n = 0; b!=null && n < b.length; n++) {
            String stmp = Integer.toHexString(b[n] & 0XFF);
            if (stmp.length() == 1)
                hs.append('0');
            hs.append(stmp);
        }
        return hs.toString().toLowerCase();
    }


    public static void main(String[] args) throws Exception {

        //String clientSecret="054e7ead8a8340c79eaa7ba98854f25b";//测试
        //预发
        String clientSecret="9a5ace98d84346498d4b09b0db9477f9";
        String clientId="2";
        String timestamp="20171226195300";
        String userName="16538";
        String password="wanghouda@123";
        String type="1";

        Map<String,String> paramMap=new HashMap<>();
        paramMap.put("username",userName);
        paramMap.put("password",password);
        paramMap.put("type",type);
        paramMap.put("client_id",clientId);
        paramMap.put("gw_timestamp",timestamp);
        String sign=generateSign(paramMap,clientSecret);

    }

}
