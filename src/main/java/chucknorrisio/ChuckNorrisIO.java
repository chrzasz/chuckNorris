package chucknorrisio;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Grzegorz Chrzaszczyk on 26-12-2018  01:37 PM
 */
public class ChuckNorrisIO {


  private String url = "https://api.chucknorris.io/jokes/random?category=explicit";
  private String charset = java.nio.charset.StandardCharsets.UTF_8.name();
  private String id;
  private String val;

  public String getId() {
    return id;
  }

  public String getVal() {
    return val;
  }

  public void setId(String id) {
    this.id = id;
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

  public boolean isFiredJoke(String fileName) {

    try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
      return stream.anyMatch(line -> line.startsWith(id));
    } catch (IOException e) {
      log(e);
    }
    return false;
  }

  private void log(Object msg) {
    System.out.println(String.valueOf(msg));
  }


}


