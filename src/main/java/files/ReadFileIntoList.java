package files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 * Created by Grzegorz Chrzaszczyk on 28-12-2018  03:37 PM
 */
public class ReadFileIntoList {

  public List<String> readFileInList(String fileName) {

    List<String> lines = Collections.emptyList();
    try {
      lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
    } catch (IOException e) {

      // do something
      System.out.println(e.toString());
    }
    return lines;
  }

}
