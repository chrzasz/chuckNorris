import chucknorrisio.ChuckNorrisIO;
import files.ChuckJokeID;


/**
 * Created by Grzegorz Chrzaszczyk on 26-12-2018  01:47 PM
 */
public class Main {

  private static final String FILE_NAME = "chuckJokeIDs.txt";

  public static void main(String[] args) throws Exception {
    showJokes(10);
  }

  private static void showJokes(int numberOfJokes) throws Exception {

    ChuckNorrisIO cn = new ChuckNorrisIO();
    ChuckJokeID chuckJokeID = new ChuckJokeID();
    String joke;

    for (int i = 1; i <= numberOfJokes; i++) {
      cn.getChuckJoke();
      if (cn.isFiredJoke(FILE_NAME)) {
        joke = " {OLD}\t";
        numberOfJokes++;
      } else {
        chuckJokeID.save(FILE_NAME, cn.getId() + "\t" + cn.getVal() + "\n");
        joke = " {NEW}\t";
      }
      System.out.println("Joke " + i + joke + cn.getVal());
    }
  }// END showJokes

}// END Main