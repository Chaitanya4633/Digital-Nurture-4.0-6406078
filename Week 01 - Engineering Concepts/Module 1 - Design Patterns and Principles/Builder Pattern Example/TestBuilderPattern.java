public class TestBuilderPattern 
{
    public static void main(String[] args) 
    {
        Computer basicComputer=new Computer.Builder()
            .setCPU("Intel i3")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .build();

        Computer gamingComputer=new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGPU("NVIDIA RTX 4080")
            .setWiFi(true)
            .setBluetooth(true)
            .build();

        Computer budgetComputer=new Computer.Builder()
            .setCPU("AMD Ryzen 3")
            .setRAM("4GB")
            .setStorage("128GB SSD")
            .build();

        System.out.println("Basic Computer Configuration:");
        basicComputer.showSpecs();

        System.out.println("Gaming Computer Configuration:");
        gamingComputer.showSpecs();

        System.out.println("Budget Computer Configuration:");
        budgetComputer.showSpecs();
    }
}
