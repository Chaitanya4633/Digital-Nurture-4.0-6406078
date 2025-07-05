public class TestLogger 
{
  public static void main(String[] args)
  {
    Logger obj1 = Logger.getInstance("Sending message from instance 1.");

    Logger obj2 = Logger.getInstance("This message will not update the Logger");

    System.out.println( "Message from object 2 : " + obj2.getMessage());

    System.out.println(( obj1.hashCode() == obj2.hashCode()) ? "Hash code Matched" : "Not Matched");
  }  
}
