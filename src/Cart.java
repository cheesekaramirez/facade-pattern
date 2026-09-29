public class Cart implements HotelService{

    @Override
    public void serviceCall() {
        System.out.println("We're getting ready of your carts for you!");
    }

    public void requestCart(int numberOfCarts) {
        System.out.printf("Requesting %d carts...%n",numberOfCarts);
        System.out.println("Done!");
    }
    
}
