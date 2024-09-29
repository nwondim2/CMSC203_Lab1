import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        do {
            
            Movie movie = new Movie();
            
            
            System.out.print("Enter the title of the movie: ");
            String title = scanner.nextLine();
            movie.setTitle(title);
            
            
            System.out.print("Enter the movie's rating: ");
            String rating = scanner.nextLine();
            movie.setRating(rating);
            
            
            System.out.print("Enter the number of tickets sold: ");
            int soldTickets = scanner.nextInt();
            movie.setSoldTickets(soldTickets);
            scanner.nextLine(); 

            
            System.out.println(movie.toString());

            
            System.out.print("Do you want to enter another movie? (y or n): ");
            String response = scanner.nextLine();
            if(!("y".equals(response.toLowerCase()))) {
            	continueInput = false;
            }
        } while(continueInput);

        System.out.println("Goodbye");
        
        scanner.close();
	}

}
