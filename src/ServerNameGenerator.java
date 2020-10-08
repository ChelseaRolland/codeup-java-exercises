import java.util.Random;

public class ServerNameGenerator {
    /**

     Server Name Generator

     We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.

     Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
     Create a method that will return a random element from an array of strings.
     Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
     Example Output


     Here is your server name:
     dedicated-photon

     **/

    public static String [] adjectives = {"quixotic","vast","quaint","squalid","ubiquitous","hollow","animated","zany","industrious","succinct"};
    public static String [] nouns = {"zebra","quasar","nebula","neutron","photon","mist","houses","dolls","yard","farm"};

    public static void main(String[] args) {

        System.out.println("Here is your server name:");
        System.out.println(adjectives[randomIndex(adjectives)] + "-" + nouns[randomIndex(nouns)]);

        System.out.println("Here is your server name:");
        System.out.println(getWord(adjectives) + "-" + getWord(nouns));
    }

    //Dynamic, however, its not necessary less code when the randomizer is ran
    public static int randomIndex (String [] words) {
        return (int) (Math.floor(Math.random() * (words.length - 1))+1);
    }

    public static String getWord(String[] words) { //since both arrays of strings are the same data type
        Random rand = new Random();
        int randomIndex = rand.nextInt(words.length); //this sets a boundary for the max random #
        return words[randomIndex];
    }

}
