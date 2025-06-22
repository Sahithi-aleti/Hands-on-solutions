package ecommerce;


public class Main {
 public static void main(String[] args) {
     Product[] products = {
         new Product(101, "iPhone", "Electronics"),
         new Product(102, "Shoes", "Fashion"),
         new Product(103, "Watch", "Accessories"),
         new Product(104, "Laptop", "Electronics"),
         new Product(105, "Bag", "Fashion")
     };

     System.out.println("Linear Search:");
     Product foundLinear = SearchEngine.linearSearch(products, "Watch");
     System.out.println(foundLinear != null ? foundLinear : "Product not found");

     System.out.println("\nBinary Search:");
     Product foundBinary = SearchEngine.binarySearch(products, "Laptop");
     System.out.println(foundBinary != null ? foundBinary : "Product not found");
 }
}

