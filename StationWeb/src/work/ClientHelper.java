package work;

import java.util.Map;
import java.time.LocalDate;





public class ClientHelper {
    private static final String PARAM_FIRST_NAME = "fname";
    private static final String PARAM_LAST_NAME = "lname";
    private static final String PARAM_ID = "id";
    private static final String PARAM_ADDRESS = "address";
    private static final String PARAM_PHONE = "phone";
    private static final String PARAM_EMAIL = "email";
    private static final String PARAM_DATE = "date";
   
    
public static model.Client createClient(Map<String,String[]> parameters)
{    
 model.Client client=new model.Client();
 
 String[] array=parameters.get(PARAM_ID);
 String ele0=array[0];
 client.setId(ele0);
 
 String[] array1=parameters.get(PARAM_FIRST_NAME);
 String ele1=array1[0];
 client.setFName(ele1);;
 
 String[] array2=parameters.get(PARAM_LAST_NAME);
 String ele2=array2[0];
 client.setLName(ele2);
 
 String[] array3=parameters.get(PARAM_ADDRESS);
 String ele3=array3[0];
 client.setAddress(ele3);
 
 String[] array4=parameters.get(PARAM_EMAIL);
 String ele4=array4[0];
 client.setEmail(ele4);
 
 String[] array5=parameters.get(PARAM_PHONE);
 String ele5=array5[0];
 client.setPhone(Integer.parseInt(ele5));
 
 String[] array6=parameters.get(PARAM_DATE);
 String ele6=array6[0];
 String[] datem=ele6.split("/");
 
 
 LocalDate lc=LocalDate.of(Integer.parseInt(datem[2]),Integer.parseInt(datem[1]) , Integer.parseInt(datem[0]));
client.setDdate(lc);
 
 
 return client;
}



}