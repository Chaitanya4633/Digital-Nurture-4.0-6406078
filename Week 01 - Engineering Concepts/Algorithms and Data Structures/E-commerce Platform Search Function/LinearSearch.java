import java.util.*;

public class LinearSearch 
{
    public static Product findById(Product[] items,int id) 
    {
        for(Product p:items) 
            if(p.getId()==id) 
                return p;

        return null;
    }

    public static List<Product> findByCategory(Product[] items,String category) 
    {
        List<Product> results=new ArrayList<>();
        for (Product p:items) 
            if (p.getCategory().equalsIgnoreCase(category)) 
                results.add(p);

        return results;
    }

    public static Product findByName(Product[] items,String name) 
    {
        for (Product p:items) 
            if (p.getName().equalsIgnoreCase(name)) return p;

        return null;
    }

    public static List<Product> findByPriceRange(Product[] items,double min,double max) 
    {
        List<Product> results=new ArrayList<>();
        for (Product p:items) 
            if (p.getPrice()>=min && p.getPrice()<=max) 
                results.add(p);

        return results;
    }
}
