package hotel;

public class Room {
    // Rooms basklassen innehålla alla egenskaper och betende
    // standard room och svite : undergklasser till room + egna egenskaper
    // Booking service: hantera bokningar

    // markera man klassen abstract då kan man unvika att det går att skapa ett objekt av klassen

    private String roomNr;
    private int capacity;
    private boolean isBooked;

    public Room(String roomNr, int capacity) {
        this. roomNr = roomNr;
        this.capacity = capacity;
        this.isBooked = false;

    }


    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getCapacity() {
        return capacity;
    }



    public String getRoomNr() {
        return roomNr;
    }

    // metod för boka rum
    //metod öfr att avboka rum
    // metod föt att visa detal rum
    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("room " + roomNr + "is now bokked.");
        } else {
            System.out.println("room " + roomNr + " is already booked.");

            public void cancelBooking () {
                if (isBooked) {
                    isBooked = false;
                    System.out.println("room" + roomNr + "is nott bokked");


                    public void displayRoomDetalis () {
                        System.out.println("room" + roomNr + "with capacity " + capacity + "guest.");
                    }
                }
            }
        }
    }


    public void displayRoomDetails() {
    }

    public void cancelBooking() {
    }
}

