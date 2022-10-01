package technology;

public class Laptop extends Computer {
    private boolean hasTouchScreen;

    public Laptop(String osType, int memory, boolean hasCamera, boolean hasTouchScreen) {
        super(osType, memory, hasCamera);
        this.hasTouchScreen = hasTouchScreen;
    }
    public boolean isTouchEnabled() {
        if (hasTouchScreen) {
            return true;
        }
        else {
            return false;
        }
    }
}
