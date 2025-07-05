import java.util.*;

public class SearchApp 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);

    // Setting values using Buider patters for better redability..
      Product[] inventory = 
      {

        new Product.ProductBuilder().setName("TV").setCategory("Electronics").setPrice(50000).build(),
        new Product.ProductBuilder().setName("Shoes").setCategory("Footwear").setPrice(2500).build(),
        new Product.ProductBuilder().setName("Fan").setCategory("Appliances").setPrice(2000).build(),
        new Product.ProductBuilder().setName("Phone").setCategory("Electronics").setPrice(30000).build(),
        new Product.ProductBuilder().setName("Book").setCategory("Books").setPrice(500).build(),
        new Product.ProductBuilder().setName("Bag").setCategory("Accessories").setPrice(1200).build(),
        new Product.ProductBuilder().setName("Watch").setCategory("Electronics").setPrice(7000).build(),
        new Product.ProductBuilder().setName("Microwave").setCategory("Appliances").setPrice(4500).build()
    
      };

      //Asking user until user select option 3 i.e Exit

      while (true) 
      {
            System.out.println("\n---- Choose Search Method ----\n");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Exit");
            System.out.print("\nEnter choice: ");

            int method=sc.nextInt();
            sc.nextLine(); 

            if (method==3) 
            {
                System.out.println("Exiting search...");
                break;
            }

            if (method!=1 && method!=2) 
            {
                System.out.println("Invalid method choice.");
                continue;
            }

            // Asking user on what base search to be made

            System.out.println("\n---- Choose Search Field ----\n");
            System.out.println("1. Search by ID");
            System.out.println("2. Search by Name");
            System.out.println("3. Search by Category");
            System.out.println("4. Search by Price Range");
            System.out.println("5. Back to Main Menu");
            System.out.print("\nEnter choice: ");
            int choice=sc.nextInt();
            sc.nextLine();

            if(choice==5) 
                continue;
            
            System.out.println("-------------------------------------------------------------------------------\n");

            switch(choice) 
            {
               
                case 1: 
                    System.out.print("\nEnter Product ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();

                    if(method==1) 
                        System.out.println(LinearSearch.findById(inventory, id));
                    else 
                    {
                        Product[] sorted=inventory.clone();
                        Arrays.sort(sorted, Comparator.comparing(Product::getId));
                        System.out.println(BinarySearch.findById(sorted, id));
                    }
                    break;

                case 2:
                    System.out.print("\nEnter Product Name: ");
                    String name=sc.nextLine();

                    if(method==1) 
                        System.out.println(LinearSearch.findByName(inventory, name));
                    else 
                    {
                        Product[] sorted = inventory.clone();
                        Arrays.sort(sorted, Comparator.comparing(Product::getName));
                        System.out.println(BinarySearch.findByName(sorted, name));
                    }
                    break;

                case 3: 
                    System.out.print("\nEnter Category: ");
                    String category=sc.nextLine();
                    if(method==1) 
                        LinearSearch.findByCategory(inventory, category).forEach(System.out::println);
                    else 
                        BinarySearch.findByCategory(inventory, category).forEach(System.out::println);
                    break;

                case 4:
                    System.out.print("\nEnter min price: ");
                    double min=sc.nextDouble();
                    System.out.print("\nEnter max price: ");
                    double max=sc.nextDouble();
                    sc.nextLine();
                    if(method==1) 
                        LinearSearch.findByPriceRange(inventory, min, max).forEach(System.out::println);
                    else 
                    {
                        Product[] sorted=inventory.clone();
                        Arrays.sort(sorted, Comparator.comparingDouble(Product::getPrice));
                        BinarySearch.findByPriceRange(sorted, min, max).forEach(System.out::println);
                    }
                    break;

                default:
                    System.out.println("Invalid option.");
            }

               System.out.println("\n-------------------------------------------------------------------------------\n");
        }
        sc.close();
    }
}