import com.SDK.model.Utils;
import com.SDK.model.prueba;
import java.util.HashMap;
import java.util.Map;
public class App {
    public static void main(String[] args) throws Exception {

        Map<String, Object> map1 = new HashMap<>();
        map1.put("pKey", "ca0d6f3ce2c47993e0e1a67f38cdb6b4b1d1fcbdca0d6f3ce2c47993e0e1a67f");
        map1.put("docxpressoInstallation", "https://testgit.pre.docxpresso.com");
        Utils util1 = new Utils(map1);
        Map<String, Object> varArray = new HashMap<>();
        
      
        varArray.put("template",404);
        varArray.put("token","c30d3cf6321e34b1fc27405bb5e5f0b0");
       
        Map<String, Object> varArray2 = new HashMap<>();

        /*System.out.println(Utils.apikey_control("ddssfd","abdc","abcd"));
        System.out.println(Utils.base64_encode_url_safe("abcdefg"));
        System.out.println(Utils.base64_decode_url_safe("YWJjZGVmZw,,"));
        System.out.println(util1.modifyPassword("gmail@gmail.com","password",varArray));
        System.out.println( util1.previewDocument(varArray));*/
        //System.out.println( util1.validateDocument(varArray));
        //System.out.println( util1.sendEditLinkByEmail(varArray,varArray2));
        //System.out.println( util1.validationsByTemplate(varArray));
        //System.out.println( util1.viewDocument(varArray));
        //System.out.println( util1.viewHistoryDocument(varArray));
        // System.out.println( util1.regenerateDocument(varArray));
        //System.out.println( util1.requestDocument(varArray));
        //System.out.println( util1.revisionsByTemplate(varArray));
        //System.out.println( util1.downloadAttachment(varArray));
        //System.out.println( util1.downloadDocument(varArray));
        //System.out.println( util1.fetchForwardedDocument(varArray));
        //System.out.println( util1.getAnnexData("ad0c670a9d1f9dcb1648a737e96805e5"));
        //System.out.println( util1.getTemplateData(5));
        //System.out.println( util1.getTemplateThumbnail(5));
        //System.out.println( util1.getTemplateSignatureData(5));
        //System.out.println( util1.getUsageCurrent("5"));
        //System.out.println( util1.getUsageHistory("5"));
        //System.out.println( util1.modifyTemplateData(varArray));
        //System.out.println( util1.accessByTokenAction(varArray));
        System.out.println( util1.createUser(varArray));

        /*Map<String, Object> varArray2 = new HashMap<>();
        varArray2.put("form",true);*/
        //System.out.println(util1.previewDocument(varArray2));
        
        //System.out.println(prueba.hmacSha1("ca0d6f3ce2c47993e0e1a67f38cdb6b4b1d1fcbdca0d6f3ce2c47993e0e1a67f","control"));
        
       



        /*Map<String, String> map1 = new HashMap<>();
        map1.put("name3", "demo");
        map1.put("fname4", "fdemo");  

        Map<String, String> map2 = new HashMap<>();
        map2.put("name1", "ggdf");
        map2.put("fname2", "fdfgdgdemo");  
        
        Map<String, Map> map3 = new HashMap<>();
        map3.put("ndsfsfame", map1);
        map3.put("ffgd", map2);

        System.out.println("Map of Map:   " + map3.get("ndsfsfame").get("name3")); */
         
        
    }
}
