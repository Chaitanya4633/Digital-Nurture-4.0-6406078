public class Product 
{
    private static int nextId=1000;
    private final int productId;
    private final String name;
    private final String category;
    private final double price;

    private Product(ProductBuilder builder) 
    {
        this.productId=nextId++;
        this.name=builder.name;
        this.category=builder.category;
        this.price=builder.price;
    }

    public int getId() 
    {
        return productId;
    }

    public String getName() 
    {
        return name;
    }

    public String getCategory() 
    {
        return category;
    }

    public double getPrice() 
    {
      return price;
    }

    @Override
    public String toString() 
    {
        return String.format("Product[ID=%d, Name=%s, Category=%s, Price=%.2f]",productId, name, category, price);
    }

    // using builder class to assign values
    public static class ProductBuilder 
    {
        private String name;
        private String category;
        private double price;

        public ProductBuilder setName(String name) 
        {
            this.name=name;
            return this;
        }

        public ProductBuilder setCategory(String category) 
        {
            this.category=category;
            return this;
        }

        public ProductBuilder setPrice(double price) 
        {
          this.price=price;
          return this;
        }

        public Product build() 
        {
          return new Product(this);
        }
    }
}
