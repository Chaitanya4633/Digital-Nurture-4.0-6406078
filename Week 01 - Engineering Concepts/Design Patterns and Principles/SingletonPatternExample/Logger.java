class Logger
{
  private static Logger instance;
  
  private static String  message = "";

  private Logger( String message) {
    this.message = message;
  }

  public static Logger getInstance(String message)
  {
      if ( instance == null){
        System.out.println("Instance created and message variable intialised.");
        instance = new Logger(message);
      }
      else{
        System.out.println("Ignoring new message and instance. As instance is already created");
      }

      return instance;
  }

  public String getMessage(){
    return message;
  }
}