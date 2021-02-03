import java.util.*;

public class Theatre {
    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();

    public Theatre(String thaterName, int numRows, int seatPerRow) {
        this.theatreName = thaterName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int i = 0; i < seatPerRow; i++) {
                Seat seat = new Seat(row + String.format("%02d", i));
                seats.add(seat);
            }
        }

    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat=Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat>=0){
            return seats.get(foundSeat).reserve();
        }else{
            System.out.println("There is no seat2"+seatNumber);
            return false;
        }

//        for (Seat curSeat : seats) {
//            System.out.print(".");
//            if (curSeat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat=curSeat;
//                break;
//            }
//        }
//        if (requestedSeat == null) {
//            System.out.println("There is no such seat");
//            return false;
//        }
//
//
//        return requestedSeat.reserve();
    }

    public void getSeats() {
        for (Seat seat : seats) {

            System.out.println(seat.getSeatNumber());
        }
    }


    public class Seat  implements Comparable<Seat>{
        private final String seatNumber;
        private Boolean isReserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat){
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.isReserved) {
                this.isReserved = true;
                System.out.println("Seat" + seatNumber + "reserved");
                return true;
            } else {
               // System.out.println("this is already reserved");
                return false;
            }

        }

        public boolean cancel(){
            if(!this.isReserved){
                this.isReserved=false;
                System.out.println("reservation canceled");
                return true;
            }else{
                System.out.println("This is not reserved");
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }

}