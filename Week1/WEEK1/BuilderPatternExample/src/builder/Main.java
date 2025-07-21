package builder;


public class Main {
 public static void main(String[] args) {
     // Basic configuration
     Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
     System.out.println("Basic Computer: " + basicComputer);

     // Full configuration
     Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
             .setStorage("1TB SSD")
             .setGraphicsCard("NVIDIA RTX 4080")
             .setOperatingSystem("Windows 11")
             .build();
     System.out.println("Gaming Computer: " + gamingComputer);
 }
}
