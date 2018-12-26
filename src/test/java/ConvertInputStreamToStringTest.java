import junitparams.JUnitParamsRunner;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Created by Grzegorz Chrzaszczyk on 26-12-2018  10:07 PM
 */
@RunWith(JUnitParamsRunner.class)
public class ConvertInputStreamToStringTest {
  @Test
  public void ConvertIOUtilsTest() throws IOException {
    String originalString = "TESTtest";
    InputStream inputStream = new ByteArrayInputStream(originalString.getBytes());
    String text = IOUtils.toString(inputStream, StandardCharsets.UTF_8.name());
    Assert.assertEquals(text, originalString);
  }
}
