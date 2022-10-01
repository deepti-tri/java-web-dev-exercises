package technology;

public class Computer extends AbstractEntity{
    private String osType;
    private int memory;
    private boolean hasCamera;
    private int id;

    public Computer(String osType, int memory, boolean hasCamera) {
        this.osType = osType;
        this.memory = memory;
        this.hasCamera = hasCamera;
    }

    public int increaseMem(int m) {
        this.memory += m;
        return this.memory;
    }

    public String installOS(String os) {
        this.osType = os;
        return this.osType;
    }


    @Override
    public int Id() {
        return this.id;
    }
}
