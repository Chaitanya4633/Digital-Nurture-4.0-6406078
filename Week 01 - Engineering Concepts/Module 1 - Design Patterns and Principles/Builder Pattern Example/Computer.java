public class Computer 
{
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private boolean hasWiFi;
    private boolean hasBluetooth;

    private Computer(Builder builder) 
    {
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.storage=builder.storage;
        this.GPU=builder.GPU;
        this.hasWiFi=builder.hasWiFi;
        this.hasBluetooth=builder.hasBluetooth;
    }

    public static class Builder 
    {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        private boolean hasWiFi;
        private boolean hasBluetooth;

        public Builder setCPU(String CPU) 
        {
            this.CPU=CPU;
            return this;
        }

        public Builder setRAM(String RAM) 
        {
            this.RAM=RAM;
            return this;
        }

        public Builder setStorage(String storage) 
        {
            this.storage=storage;
            return this;
        }

        public Builder setGPU(String GPU) 
        {
            this.GPU=GPU;
            return this;
        }

        public Builder setWiFi(boolean hasWiFi) 
        {
            this.hasWiFi=hasWiFi;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) 
        {
            this.hasBluetooth=hasBluetooth;
            return this;
        }

        public Computer build() 
        {
            return new Computer(this);
        }
    }

    public void showSpecs() 
    {
        System.out.println("CPU: "+CPU);
        System.out.println("RAM: "+RAM);
        System.out.println("Storage: "+storage);
        System.out.println("GPU: "+GPU);
        System.out.println("WiFi: "+hasWiFi);
        System.out.println("Bluetooth: "+hasBluetooth);
        System.out.println("-----------------------------");
    }
}
