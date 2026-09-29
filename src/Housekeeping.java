public class Housekeeping implements HotelService{

    @Override
    public void serviceCall() {
        System.out.println("Our cleaners will get your room cleaned up and prepped up in no time!");
    }

    public void cleanRoom(int roomNumber) {
        System.out.printf("Currently Cleaning Room #%d...%n",roomNumber);
        System.out.println("Done!");
    }
    
}