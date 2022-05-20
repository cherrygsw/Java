class Main {
  
    public static void main(String[] args) 
    {
      //System.out.println("Hello, World!"); 
      System.out.println(isPrime(5)); 
    }
  
    public static boolean isPrime(int n) 
    {
      if(n%2 == 0)
      {
        return false;
      }
      for(int i = 3; i <= Math.sqrt(n); i++)
      {
        if(n%1 == 0)
        {
          return false;
        }
        else 
        {
          return true;
        }
      }
      return true; 
    }
}
