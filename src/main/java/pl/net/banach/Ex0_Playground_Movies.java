package pl.net.banach;

import java.util.Arrays;
import java.util.List;

public class Ex0_Playground_Movies {
    public record Movie(String title, List<String> genres, int year, List<String> actors, double imdbRating) {}

    public static final List<Movie> movies = Arrays.asList(
            new Movie("The Shawshank Redemption", List.of("Drama", "Crime"), 1994, List.of("Tim Robbins", "Morgan Freeman", "William Sadler"), 9.3),
            new Movie("The Godfather", List.of("Crime", "Drama"), 1972, List.of("Marlon Brando", "Al Pacino", "James Caan"), 9.2),
            new Movie("The Dark Knight", List.of("Action", "Crime"), 2008, List.of("Christian Bale", "Heath Ledger", "Aaron Eckhart"), 9.0),
            new Movie("Pulp Fiction", List.of("Crime", "Drama"), 1994, List.of("John Travolta", "Uma Thurman", "Samuel L. Jackson"), 8.9),
            new Movie("Forrest Gump", List.of("Drama", "Romance"), 1994, List.of("Tom Hanks", "Robin Wright", "Gary Sinise"), 8.8),
            new Movie("Inception", List.of("Sci-Fi", "Action"), 2010, List.of("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page"), 8.8),
            new Movie("Fight Club", List.of("Drama", "Thriller"), 1999, List.of("Brad Pitt", "Edward Norton", "Helena Bonham Carter"), 8.8),
            new Movie("The Matrix", List.of("Sci-Fi", "Action"), 1999, List.of("Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss"), 8.7),
            new Movie("Goodfellas", List.of("Crime", "Biography"), 1990, List.of("Robert De Niro", "Ray Liotta", "Joe Pesci"), 8.7),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", List.of("Fantasy", "Adventure"), 2001, List.of("Elijah Wood", "Ian McKellen", "Viggo Mortensen"), 8.8),
            new Movie("Star Wars: Episode IV - A New Hope", List.of("Sci-Fi", "Adventure"), 1977, List.of("Mark Hamill", "Harrison Ford", "Carrie Fisher"), 8.6),
            new Movie("The Silence of the Lambs", List.of("Thriller", "Crime"), 1991, List.of("Jodie Foster", "Anthony Hopkins", "Scott Glenn"), 8.6),
            new Movie("Saving Private Ryan", List.of("War", "Drama"), 1998, List.of("Tom Hanks", "Matt Damon", "Tom Sizemore"), 8.6),
            new Movie("Gladiator", List.of("Action", "Drama"), 2000, List.of("Russell Crowe", "Joaquin Phoenix", "Connie Nielsen"), 8.5),
            new Movie("Titanic", List.of("Romance", "Drama"), 1997, List.of("Leonardo DiCaprio", "Kate Winslet", "Billy Zane"), 7.9),
            new Movie("Jurassic Park", List.of("Adventure", "Sci-Fi"), 1993, List.of("Sam Neill", "Laura Dern", "Jeff Goldblum"), 8.2),
            new Movie("The Avengers", List.of("Action", "Sci-Fi"), 2012, List.of("Robert Downey Jr.", "Chris Evans", "Scarlett Johansson"), 8.0),
            new Movie("The Lion King", List.of("Animation", "Adventure"), 1994, List.of("Matthew Broderick", "Jeremy Irons", "James Earl Jones"), 8.5),
            new Movie("Back to the Future", List.of("Sci-Fi", "Comedy"), 1985, List.of("Michael J. Fox", "Christopher Lloyd", "Lea Thompson"), 8.5),
            new Movie("The Departed", List.of("Crime", "Thriller"), 2006, List.of("Leonardo DiCaprio", "Matt Damon", "Jack Nicholson"), 8.5),
            new Movie("Schindler's List", List.of("Drama", "History"), 1993, List.of("Liam Neeson", "Ralph Fiennes", "Ben Kingsley"), 9.0),
            new Movie("Braveheart", List.of("History", "Drama"), 1995, List.of("Mel Gibson", "Sophie Marceau", "Patrick McGoohan"), 8.3),
            new Movie("Avatar", List.of("Sci-Fi", "Adventure"), 2009, List.of("Sam Worthington", "Zoe Saldana", "Sigourney Weaver"), 7.8),
            new Movie("The Prestige", List.of("Drama", "Mystery"), 2006, List.of("Christian Bale", "Hugh Jackman", "Scarlett Johansson"), 8.5),
            new Movie("The Green Mile", List.of("Drama", "Crime"), 1999, List.of("Tom Hanks", "Michael Clarke Duncan", "David Morse"), 8.6),
            new Movie("Interstellar", List.of("Sci-Fi", "Drama"), 2014, List.of("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"), 8.7),
            new Movie("The Wolf of Wall Street", List.of("Biography", "Comedy"), 2013, List.of("Leonardo DiCaprio", "Jonah Hill", "Margot Robbie"), 8.2),
            new Movie("Django Unchained", List.of("Western", "Drama"), 2012, List.of("Jamie Foxx", "Christoph Waltz", "Leonardo DiCaprio"), 8.5),
            new Movie("The Social Network", List.of("Drama", "Biography"), 2010, List.of("Jesse Eisenberg", "Andrew Garfield", "Justin Timberlake"), 7.7),
            new Movie("The Grand Budapest Hotel", List.of("Comedy", "Adventure"), 2014, List.of("Ralph Fiennes", "Tony Revolori", "Saoirse Ronan"), 8.1),
            new Movie("Whiplash", List.of("Drama", "Music"), 2014, List.of("Miles Teller", "J.K. Simmons", "Paul Reiser"), 8.5),
            new Movie("No Country for Old Men", List.of("Thriller", "Crime"), 2007, List.of("Tommy Lee Jones", "Javier Bardem", "Josh Brolin"), 8.2),
            new Movie("The Revenant", List.of("Adventure", "Drama"), 2015, List.of("Leonardo DiCaprio", "Tom Hardy", "Domhnall Gleeson"), 8.0),
            new Movie("La La Land", List.of("Musical", "Drama"), 2016, List.of("Ryan Gosling", "Emma Stone", "John Legend"), 8.0),
            new Movie("Mad Max: Fury Road", List.of("Action", "Adventure"), 2015, List.of("Tom Hardy", "Charlize Theron", "Nicholas Hoult"), 8.1),
            new Movie("The Imitation Game", List.of("Biography", "Drama"), 2014, List.of("Benedict Cumberbatch", "Keira Knightley", "Matthew Goode"), 8.0),
            new Movie("Parasite", List.of("Thriller", "Drama"), 2019, List.of("Song Kang-ho", "Lee Sun-kyun", "Cho Yeo-jeong"), 8.5),
            new Movie("Joker", List.of("Drama", "Thriller"), 2019, List.of("Joaquin Phoenix", "Robert De Niro", "Zazie Beetz"), 8.4),
            new Movie("A Beautiful Mind", List.of("Biography", "Drama"), 2001, List.of("Russell Crowe", "Jennifer Connelly", "Ed Harris"), 8.2),
            new Movie("The Truman Show", List.of("Drama", "Comedy"), 1998, List.of("Jim Carrey", "Ed Harris", "Laura Linney"), 8.2),
            new Movie("Slumdog Millionaire", List.of("Drama", "Romance"), 2008, List.of("Dev Patel", "Freida Pinto", "Anil Kapoor"), 8.0),
            new Movie("Shutter Island", List.of("Thriller", "Mystery"), 2010, List.of("Leonardo DiCaprio", "Mark Ruffalo", "Ben Kingsley"), 8.2),
            new Movie("The Pianist", List.of("Biography", "Drama"), 2002, List.of("Adrien Brody", "Thomas Kretschmann", "Frank Finlay"), 8.5),
            new Movie("Memento", List.of("Mystery", "Thriller"), 2000, List.of("Guy Pearce", "Carrie-Anne Moss", "Joe Pantoliano"), 8.4),
            new Movie("The Sixth Sense", List.of("Thriller", "Drama"), 1999, List.of("Bruce Willis", "Haley Joel Osment", "Toni Collette"), 8.2),
            new Movie("Inglourious Basterds", List.of("War", "Adventure"), 2009, List.of("Brad Pitt", "Diane Kruger", "Christoph Waltz"), 8.3),
            new Movie("The Big Lebowski", List.of("Comedy", "Crime"), 1998, List.of("Jeff Bridges", "John Goodman", "Julianne Moore"), 8.1),
            new Movie("Blade Runner 2049", List.of("Sci-Fi", "Drama"), 2017, List.of("Ryan Gosling", "Harrison Ford", "Ana de Armas"), 8.0),
            new Movie("Toy Story", List.of("Animation", "Adventure"), 1995, List.of("Tom Hanks", "Tim Allen", "Don Rickles"), 8.3),
            new Movie("The Usual Suspects", List.of("Crime", "Mystery"), 1995, List.of("Kevin Spacey", "Gabriel Byrne", "Benicio Del Toro"), 8.5),
            new Movie("Catch Me If You Can", List.of("Biography", "Crime"), 2002, List.of("Leonardo DiCaprio", "Tom Hanks", "Christopher Walken"), 8.1),
            new Movie("Cast Away", List.of("Drama", "Adventure"), 2000, List.of("Tom Hanks", "Helen Hunt", "Nick Searcy"), 7.8)
    );

    public static void main(String[] args) {
        
    }
}
