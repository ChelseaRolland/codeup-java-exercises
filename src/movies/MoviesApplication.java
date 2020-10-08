package movies;

import jdk.jshell.ImportSnippet;
import util.Input;

import java.util.Arrays;

//import java.lang.reflect.Array;

/** Movie List

 We are going to build an application that keeps track of movies and displays them by category.

 Inside of src, create a directory named movies. Create all of the classes described below in this directory.
 Create a class named Movie. It should have private fields for name and category, and a constructor that sets both of these. Create methods to access these properties and change them (getters and setters).
 Download the MoviesArray file and save it as MoviesArray.java inside of movies. This class has a static method named findAll that will return an array of Movie objects.
 Create a class named MoviesApplication that has a main method.
 Give the user a list of options for viewing all the movies or viewing movies by category.
 Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
 If a category is selected, only movies from that category should be displayed.
 Your application should continue to run until the user chooses to exit.

 **/

public class MoviesApplication {

    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        System.out.println("What would you like to do?");

        System.out.println("\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - view movies in the musical category\n" +
                "7 - view movies in the comedy category\n" +
                "8 - ADD MOVIE\n");

        System.out.print("Enter your choice: ");
        int userNum = new Input().getInt(0,8);

        boolean keepGoing = true;

        //create a do-while loop to continue to ask the guest for movie options
        do {
            //menus are great for switch statements
            switch (userNum) {
                case 0:
                    System.exit(0); //this will exit the system
                    break;
                case 1:
                    System.out.println("View All Movies");
                    for (Movie cinema : movies) {
                        System.out.println(cinema.getMovieName() + " -- " + cinema.getMovieCategory());
                    }
                    break;
                case 2:
                    printMoviesByCategories("animated");
                    break;
                case 3:
                    printMoviesByCategories("drama");
                    break;
                case 4:
                    printMoviesByCategories("horror");
                    break;
                case 5:
                    printMoviesByCategories("scifi");
                    break;
                case 6:
                    printMoviesByCategories("musical");
                    break;
                case 7:
                    printMoviesByCategories("comedy");
                    break;
                case 8:
                    System.out.println("ADD Movie");
                    String userMovieName = new Input().getString();
                    String userMovieCategory = new Input().getString();

                    addMovie(movies, new Movie(userMovieName, userMovieCategory));
                    printMoviesByCategories(userMovieCategory);

                    break;
                default:
                    System.out.println("Please input a valid number!");
                    break;
            }

            System.out.println("Do want to chose another option? [y/n]");
            String userResponse = new Input().getString();

            if (!userResponse.equalsIgnoreCase("y")){
                keepGoing = false;
            }

        } while(keepGoing);





        if (userNum == 1) {
            //View all of the movies
            for (Movie cinema : MoviesArray.findAll()) {
                System.out.println(cinema.getMovieName() + " -- " + cinema.getMovieCategory());
            }
        } else if (userNum == 2) {
            //view movies in the animated category
            for (Movie cinema : MoviesArray.findAll()) {
                if ((cinema.getMovieCategory()).equals("animated")) {
                    System.out.println(cinema.getMovieName() + " -- " + cinema.getMovieCategory());
                }
            }
        } else if (userNum == 3) {
            //view movies in the drama category
            for (Movie cinema : MoviesArray.findAll()) {
                if ((cinema.getMovieCategory()).equals("drama")) {
                    System.out.println(cinema.getMovieName() + " -- " + cinema.getMovieCategory());
                }
            }

        } else if (userNum == 4) {
            //view movies in the horror category
            for (Movie cinema : MoviesArray.findAll()) {
                if ((cinema.getMovieCategory()).equalsIgnoreCase("horror")) {
                    System.out.println(cinema.getMovieName() + " -- " + cinema.getMovieCategory());
                }
            }
        } else if (userNum == 5) {
            //view movies in the scifi category
            for (Movie cinema : MoviesArray.findAll()) {
                if ((cinema.getMovieCategory()).equalsIgnoreCase("scifi")) {
                    System.out.println(cinema.getMovieName() + " -- " + cinema.getMovieCategory());
                }
            }
        } else if (userNum == 6) {
            //view movies in the musical category
            for (Movie cinema : MoviesArray.findAll()) {
                if ((cinema.getMovieCategory()).equalsIgnoreCase("musical")) {
                    System.out.println(cinema.getMovieName() + " -- " + cinema.getMovieCategory());
                }
            }
        } else if (userNum == 7) {
            //view movies in the comedy category
            for (Movie cinema : MoviesArray.findAll()) {
                if ((cinema.getMovieCategory()).equalsIgnoreCase("comedy")) {
                    System.out.println("Comedy - cinema = " + cinema.getMovieName() + " -- " + cinema.getMovieCategory());
                }
            }
        } else if (userNum == 0) {
            System.out.println("You are now exiting the movie App");
            welcomeToMovieApp = false;
        }
        else {
            System.out.println("This is not a valid number for our options!");
            System.out.println("Please enter a valid movie option number!");
        }

    }

    public static Movie[] addMovie (Movie[] films, Movie obj) {
        films = Arrays.copyOf(films, films.length+1);
        films[films.length - 1] = obj;
        return films;
    }

    public static void printMoviesByCategories(String aCategory) {
        System.out.println("View All " + aCategory + "Movies");
        for (Movie cinema : MoviesArray.findAll()) {
            if ((cinema.getMovieCategory()).equalsIgnoreCase(aCategory)) {
                System.out.println(cinema.getMovieName() + " -- " + cinema.getMovieCategory());
            }
        }
    }
}
