package files;

import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by Grzegorz Chrzaszczyk on 28-12-2018  02:19 PM
 */
public interface OperationsOnFiles {

  List<String> load(String fileName, Charset encoding);
  void save(String fileName, String data);


}
