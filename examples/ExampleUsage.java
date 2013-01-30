import com.loopj.android.http.*;
import org.apache.http.Header;

public class ExampleUsage {
    public static void makeRequest() {
        AsyncHttpClient client = new AsyncHttpClient();

        client.get("http://www.google.com", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String response, Header[] headers) {
                System.out.println(response);
            }
        });
    }
}