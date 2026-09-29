import java.util.Scanner;

public class HotelApp {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Subsystems
        Valet valet = new Valet();
        Housekeeping housekeeping = new Housekeeping();
        Cart cart = new Cart();
        // Facade instances
        FrontDesk fdv = new FrontDesk(valet);
        FrontDesk fdh = new FrontDesk(housekeeping);
        FrontDesk fdc = new FrontDesk(cart);
        // Main App
        System.out.println("---Hotel App---");
        System.out.println("You may request the following services:");
        System.out.println("[1] Valet");
        System.out.println("[2] Housekeeping");
        System.out.println("[3] Cart");
        System.out.print("Choose the number of your service: ");
        int choice = scn.nextInt();

        switch(choice){
        case 1:
            System.out.print("Enter your car's plate number: ");
            String plateNumber = scn.next();
            fdv.requestValet(plateNumber);
            break;
        case 2:
            System.out.print("Enter your room number: ");
            int roomNumber = scn.nextInt();
            fdh.requestHousekeeping(roomNumber);
            break;
        case 3:
            System.out.print("Enter number of carts to request: ");
            int numberOfCarts = scn.nextInt();
            fdc.requestCart(numberOfCarts);
            break;
        default:
            System.out.println("Please enter a valid number.");
        }
        scn.close();
    }
    
}
