package hotel;

public class StanderRoom extends Room {
    //underklass
    private boolean hasTv;


    public void StandarRoom(String roomNr, int capacity, Boolean hasTv) {
        super(roomNr, capacity);
        // super kallas på basklassen (room) först
        this.hasTv = hasTv;

        public void displayRoomdetalis () {
            System.out.println("standard room " + getRoomNr() + "nr and capacity of" + getCapacity() + "guest. tv" + (hasTv ? "ja" : "nej"));

        }
    }
}