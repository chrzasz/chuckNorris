import chuckNorrisIO.ChuckNorrisIO;

/**
 * Created by Grzegorz Chrzaszczyk on 26-12-2018  01:47 PM
 */
public class Main {
  public static void main(String[] args) throws Exception {
    showJokes(10);
  }

  private static void showJokes(int numberOfJokes) throws Exception {
    ChuckNorrisIO cn = new ChuckNorrisIO();
    for (int i = 1; i <= numberOfJokes; i++) {
      cn.getChuckJoke();
      System.out.println("Joke " + i + "\t" + cn.getVal());
    }
  }
}