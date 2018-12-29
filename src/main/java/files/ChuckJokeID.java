package files;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 * Created by Grzegorz Chrzaszczyk on 28-12-2018  03:30 PM
 */
public class ChuckJokeID implements OperationsOnFiles {

  @Override
  public List<String> load(String fileName, Charset encoding) {
    List<String> lines = Collections.emptyList();
    try {
      lines = Files.readAllLines(Paths.get(fileName), encoding);
    } catch (IOException e) {
      System.out.println(e.toString());
    }
    return lines;
  }

  @Override
  public void save(String fileName, String data) {
    OutputStream os = null;
    try {
      // below true flag tells OutputStream to append
      os = new FileOutputStream(new File(fileName), true);
      os.write(data.getBytes(), 0, data.length());
    } catch (IOException | NullPointerException e) {
      System.out.println(e.toString());
    } finally {
      try {
        os.close();
      } catch (IOException | NullPointerException e) {
        System.out.println(e.toString());
      }
    }
  }
}