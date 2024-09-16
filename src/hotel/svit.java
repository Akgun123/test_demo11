package hotel;

public class svit extends Room{
    private boolean hasJacuzzi;
    public svit(String roomNr, int capacity, boolean hasJacuzzi) {
        super(roomNr, capacity);
        this.hasJacuzzi = hasJacuzzi;

    }
}
