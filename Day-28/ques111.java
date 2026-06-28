import java.util.Scanner;

public class ques111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[][] seats = new boolean[5][5];
        double ticketPrice = 12.50;

        while (true) {
            System.out.println("\n--- Ticket Booking System ---");
            System.out.println("1. View Seating Chart");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. Check Total Revenue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\n--- Seating Chart ---");
                System.out.println("   1  2  3  4  5");
                for (int i = 0; i < 5; i++) {
                    System.out.print((i + 1) + " ");
                    for (int j = 0; j < 5; j++) {
                        if (seats[i][j]) {
                            System.out.print("[X]");
                        } else {
                            System.out.print("[O]");
                        }
                    }
                    System.out.println();
                }
                System.out.println("([O] = Available, [X] = Booked)");

            } else if (choice == 2) {
                System.out.print("Enter Row Number (1-5): ");
                int row = scanner.nextInt() - 1;
                System.out.print("Enter Seat Number (1-5): ");
                int col = scanner.nextInt() - 1;

                if (row >= 0 && row < 5 && col >= 0 && col < 5) {
                    if (!seats[row][col]) {
                        seats[row][col] = true;
                        System.out.println("Seat successfully booked! Amount due: $" + ticketPrice);
                    } else {
                        System.out.println("Sorry, this seat is already taken!");
                    }
                } else {
                    System.out.println("Invalid row or seat selection!");
                }

            } else if (choice == 3) {
                System.out.print("Enter Row Number (1-5) to cancel: ");
                int row = scanner.nextInt() - 1;
                System.out.print("Enter Seat Number (1-5) to cancel: ");
                int col = scanner.nextInt() - 1;

                if (row >= 0 && row < 5 && col >= 0 && col < 5) {
                    if (seats[row][col]) {
                        seats[row][col] = false;
                        System.out.println("Booking cancelled successfully. Refund initiated.");
                    } else {
                        System.out.println("This seat was not booked yet.");
                    }
                } else {
                    System.out.println("Invalid row or seat selection!");
                }

            } else if (choice == 4) {
                int bookedCount = 0;
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (seats[i][j]) {
                            bookedCount++;
                        }
                    }
                }
                double totalRevenue = bookedCount * ticketPrice;
                System.out.println("\nTotal Tickets Sold: " + bookedCount);
                System.out.println("Total Revenue Generated: $" + totalRevenue);

            } else if (choice == 5) {
                System.out.println("Exiting System. Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}