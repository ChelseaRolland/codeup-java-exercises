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

    public static void main(String[] args) {
        String [] adjectives = {"quixotic","vast","quaint","squalid","ubiquitous","hollow","animated","zany","industrious","succinct"};
        String [] nouns = {"zebra","quasar","nebula","neutron","photon","mist","houses","dolls","yard","farm"};

        System.out.println("Here is your server name:");
        System.out.println(adjectives[randomIndex()] + "-" + nouns[randomIndex()]);
    }

    public static int randomIndex () {
        return (int) (Math.floor(Math.random() * (10 - 1))+1);
    }

}
