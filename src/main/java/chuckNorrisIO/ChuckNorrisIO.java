package chuckNorrisIO;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.*;

/**
 * Created by Grzegorz Chrzaszczyk on 26-12-2018  01:37 PM
 */
public class ChuckNorrisIO {


  private String url = "https://api.chucknorris.io/jokes/random";
  private String charset = java.nio.charset.StandardCharsets.UTF_8.name();
  private String id;
  private String val;

  public String getId() {
    return id;
  }

  public String getVal() {
    return val;
  }

  public void getChuckJoke() throws Exception {
    URLConnection connection = new URL(url).openConnection();
    connection.setRequestProperty("Accept-Charset", charset);
    InputStream response = connection.getInputStream();

    String result = IOUtils.toString(response, charset);

    JSONObject obj = new JSONObject(result);
    id = obj.getString("id");
    val = obj.getString("value");
  }


}
