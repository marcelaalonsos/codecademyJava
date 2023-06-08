/*
 * build a playlist for a desert island
 */
import java.util.ArrayList;

class Playlist {
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Revolution");
    desertIslandPlaylist.add("Here comes the sun");
    desertIslandPlaylist.add("Yesterday");
    desertIslandPlaylist.add("Hey Jude");//removed
    desertIslandPlaylist.add("Hello Goodbye");
    desertIslandPlaylist.add("I am the walrus");

    //System.out.println(desertIslandPlaylist);
    //System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove(3);
    System.out.println(desertIslandPlaylist.size());
    int songA = desertIslandPlaylist.indexOf("Revolution");
    int songB = desertIslandPlaylist.indexOf("I am the Walrus");
    desertIslandPlaylist.set(0, "I am the Walrus");
    desertIslandPlaylist.set(4, "Revolution");
    System.out.println(desertIslandPlaylist);
  }
}
