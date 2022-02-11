
public class NoFormatExcpThreedotFive
{
  public static void main(String args[])
  {
    String str_one= "100";
    int in = Integer.parseInt(str_one);
    System.out.println(in*in);

    try
    {
      String str_two= "hundred";
      int v = Integer.parseInt(str_two);
    }
    catch(NoFormatExcpThreedotFive e)
    {
      System.err.println("Unable to format. " + e);
    }
  }
}