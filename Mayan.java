//child class of Language

public class Mayan extends Language {
  Mayan(String languageName, int speakers) {
    super(languageName, speakers, "Central America", "verb-object-verb");
  }
  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
    System.out.println("Fun fact: " + this.name + " is an ergative language.");
  }
}
