
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ParkingLotTest {

    @Test
    void CarParkedInParkingLot() throws ParkingLotFullException, CarAlreadyParkedException {

        Car car=new Car();
        ParkingLot parkingLot=new ParkingLot(3);

        assertDoesNotThrow(()->parkingLot.park(car));


    }

    @Test
    void ShouldGiveParkingSlotFullMessage() throws ParkingLotFullException {
        Car car=new Car();
        ParkingLot parkingLot=new ParkingLot(51);

        assertThrows(ParkingLotFullException.class,()-> parkingLot.park(car));


    }
    @Test
    void ShouldGiveCarAlreadyParkedMessage() throws CarAlreadyParkedException, ParkingLotFullException {
        Car car=new Car();
        ParkingLot parkingLot=new ParkingLot(1);

        parkingLot.park(car);

        assertThrows(CarAlreadyParkedException.class,()-> parkingLot.park(car));


    }

    @Test
    void CarRemovedFromParkingLot() {

        Car car=new Car();
        ParkingLot parkingLot=new ParkingLot(1);

        parkingLot.unPark(car);

        assertDoesNotThrow(()-> parkingLot.park(car));


    }
}


