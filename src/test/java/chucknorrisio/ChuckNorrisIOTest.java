package chucknorrisio;

import org.junit.Assert;
import org.junit.Test;



/**
 * Created by Grzegorz Chrzaszczyk on 28-12-2018  04:02 PM
 */
public class ChuckNorrisIOTest {

  private String FILE_NAME = "Fired_Chuck_Norris_Jokes_Test.txt";

  @Test
  public void firedJokeTest(){

    String idExisting = "tpg9R8inQz6l93Qp2OkFWA";
    ChuckNorrisIO cn = new ChuckNorrisIO();
    cn.setId(idExisting);
    Assert.assertTrue("Already fired joke", cn.isFiredJoke(FILE_NAME));
  }

  @Test
  public void notFiredJokeTest(){
    String idNotExisting = "ZHWRAUXNRZSlQJZXMTEOXQ";
    ChuckNorrisIO cn = new ChuckNorrisIO();
    cn.setId(idNotExisting);
    Assert.assertFalse("New joke", cn.isFiredJoke(FILE_NAME));
  }


}