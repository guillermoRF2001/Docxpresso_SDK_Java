package com.SDK.model;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import static org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_1;
public class prueba {


    public prueba(Map _options) {
        Utils._options = _options;
    }

     
 
    /* Retorna un hash SHA1 a partir de un texto */
    

    public static String hmacSha1(String key,String txt) {
        byte [] txtDigest = new DigestUtils(SHA_1).digest(txt);
        HmacUtils hm1 = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key);
        String prueba12 = hm1.hmacHex(txtDigest); 
        //System.out.println("key:  "+key);
        //System.out.println(txt);
        return prueba12;
    }


    



}
