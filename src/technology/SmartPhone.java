package technology;

public class SmartPhone extends Computer {
    private boolean canCall;

    public SmartPhone(String osType, int memory, boolean hasCamera, boolean canCall) {
        super(osType, memory, hasCamera);
        this.canCall = canCall;
    }
    public void calling() {
        if (canCall) {
            System.out.println("Calling Enabled");
        }
        else {
            System.out.println("Calling Disabled");
        }
    }
}
