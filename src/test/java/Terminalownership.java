import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.when;

/**
 * Created by dipal vyas on 31/01/2017.
 */
public class Terminalownership {


    public Response response;

    String abc;
    String xyz = "901112118097036";


    @Test
     public void firstApi()
    {

        abc = when().
                get("http://terminal-customer-v1.relationship-sit.89d9.dev-inmarsat.openshiftapps.com/api/terminal/" + xyz).
                then().
                contentType(ContentType.XML).extract().body().asString();


     //   String abc = response.toString();
        System.out.println(abc);


    }
}
