public class Valet implements HotelService{
    
    @Override
    public void serviceCall() {
        System.out.println("Our hotel valets are on their way to your car.");
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.printf("Picking up car with the plate number %s...%n",plateNumber);
        System.out.println("Done!");
    }
}