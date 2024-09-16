package hotel;

import java.util.ArrayList;
import java.util.List;

public class bokingservice {
    //lista med alla rum
    private List<Room> rooms = new ArrayList<>();
    //metod för att lägga till ett rum i listan
    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room"+ room.getRoomNr()+ "hasbeen added to the system" );
    }

    // metod för att boka ett rum baserat på rumsnummer
    public void bookRoom(String roomNr) {
        Room room = findRoom(roomNr);
        if (room != null) {
            room.bookRoom();
        } else {
            System.out.println("Room with " + roomNr + " not found");
    }

    }

    // metod för att avboka ett rum baserat på ett rummsnr
    public void cancelBokking(String roomNr) {
        Room room = findRoom (roomNr);
        if (room != null) {
            room.cancelBooking();
        }
    }

    // metod för att visa alla rum som är tillängliga
    public void displayvaliableRooms() {
        for (Room room : rooms) {
            room.displayRoomDetails();
            System.out.println();
        }

    }

    // hitta ett rum basertat på rumsnummer skall vara privat
    private Room findRoom(String roomNr) {
        for (Room room : rooms) {
            if (room.getRoomNr().equals(roomNr)) {
                return room;
            }
        }
    }

}
