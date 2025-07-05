import java.util.*;

public class BinarySearch
{
    public static Product findByName(Product[] sortedByName,String name) 
    {
        int left=0,right=sortedByName.length-1;
        while (left<=right) 
        {
            int mid=(left+right)/2;
            int cmp=sortedByName[mid].getName().compareToIgnoreCase(name);

            if(cmp==0) 
              return sortedByName[mid];

            else if(cmp<0) 
              left=mid+1;

            else 
              right=mid-1;
        }
        return null;
    }

    public static Product findById(Product[] sortedById,int id) 
    {
        int left=0,right=sortedById.length-1;
        while(left<=right) 
        {
            int mid=(left+right)/2;

            if(sortedById[mid].getId()==id) 
              return sortedById[mid];

            else if(sortedById[mid].getId()<id) 
              left=mid+1;

            else 
              right=mid-1;
        }
        return null;
    }

    public static List<Product> findByPriceRange(Product[] sortedByPrice,double min,double max) 
    {
        List<Product> result=new ArrayList<>();
        for (Product p:sortedByPrice) 
        {
            if(p.getPrice()>max) 
              break;
            if(p.getPrice()>=min) 
              result.add(p);
        }
        return result;
    }

    public static List<Product> findByCategory(Product[] items,String category) 
    {
        return Arrays.stream(items)
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .toList();
    }
}
