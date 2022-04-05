import java.util.ArrayList;
import java.util.Objects;

public class ParkingLot {

    private int capacity = 50;
    private int slots;
    ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

    public ParkingLot(int slots) {
        this.slots = slots;
    }

    private int isParkingSlotAvailable() {
        return capacity-slots;


    }

    private boolean isParked(Vehicle car) {
            return cars.contains(car);



    }

    public void park(Vehicle car) throws ParkingLotFullException, CarAlreadyParkedException {



                if (isParkingSlotAvailable() > 0) {
                    if(!isParked(car)){
                cars.add(car);
                capacity = capacity - 1;
            }
            else

                        throw new CarAlreadyParkedException("Car Is Already Parked");

            }
            else
                    throw new ParkingLotFullException("Parking Lot Full");

        }



        public void unPark(Vehicle car){

            if (isParked(car)){
                cars.remove(car);
                capacity=capacity+1;
            }



    }
}


