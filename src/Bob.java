import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        /* Bob is a lackadaisical teenager. In conversation, his responses are very limited.

            Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
            He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
            He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
            He answers 'Whatever.' to anything else.
            Write the Java code necessary so that a user of your command line application can have a conversation with Bob. */

        Scanner scan = new Scanner(System.in);
//        System.out.println("Hey Bob! What are your thoughts on code?!");
//        String userQuestions = scan.nextLine();
//        if (userQuestions.endsWith("?")) {
//            System.out.println("Sure.");
//        } else if (userQuestions.endsWith("!")) {
//            System.out.println("Whoa, chill out!");
//        } else if (userQuestions.equals("")) {
//            System.out.println("Fine. Be that way!");
//        } else {
//            System.out.println("Whatever!");
//        }

        //1st Example of the Chat Bot!
        boolean keepGoing = true;
        System.out.println("Hey Bob! How is it going?!");
        do {
            System.out.println("Let's do this!");
            String userQuestions = scan.nextLine().trim();
            if (userQuestions.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userQuestions.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userQuestions.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever!");
            }

            System.out.println("Bob: Really? You want to continue? (y/n)");
            String userAnswer = scan.nextLine().trim();
            if (!userAnswer.equalsIgnoreCase("y")) {
                System.out.println("Bob: Finally about head out and play some video-games!");
                keepGoing = false;
            }
        } while (keepGoing);

    }
}
