public class StringExercise {
    public static void main (String[] args) {
        String words = "We don't need no education";
        System.out.println("words1: " + words);

        words = words.replace("education", "thought control");
        System.out.println("words2: " + words);

        words = words.replace("We don't need no thought control", "Check \"this\" out!, \"s inside of \"s!");
        System.out.println("words3: " + words);

        words = words.replace("Check \"this\" out!, \"s inside of \"s!", "In windows, the main drive is usually C:");
        words = words + "\\";
        System.out.println("words4: " + words);

        words = words.replace("In windows, the main drive is usually C:\\", "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!");
        System.out.println("words5: " + words);
    }
}
