public class FrontDesk {
    Valet v;
    Housekeeping h;
    Cart c;

    public FrontDesk(Valet v) {
        this.v = v;
    }

    public FrontDesk(Housekeeping h) {
        this.h = h;
    }

    public FrontDesk(Cart c){
        this.c = c;
    }

    public void requestValet(String plateNumber) {
        v.serviceCall();
        v.pickUpVehicle(plateNumber);
    }

    public void requestHousekeeping(int roomNumber) {
        h.serviceCall();
        h.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        c.serviceCall();
        c.requestCart(numberOfCarts);
    }
}
