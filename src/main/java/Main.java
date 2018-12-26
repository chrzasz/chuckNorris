import chuckNorrisIO.ChuckNorrisIO;

/**
 * Created by Grzegorz Chrzaszczyk on 26-12-2018  01:47 PM
 */
public class Main {
  public static void main(String[] args) throws Exception {

    ChuckNorrisIO cn = new ChuckNorrisIO();
    for (int i = 0; i < 10; i++) {
      cn.getChuckJoke();
      System.out.println(cn.getId() + "\t" + cn.getVal());
    }

  }
}
