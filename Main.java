import java.util.*;
import java.io.*;
class Main 
{
  public static void main(String[] args) throws IOException
  {
    Scanner scan = new Scanner(new File("sample1.txt"));


    while(scan.hasNext())
    {
      String[] parts = scan.nextLine().split("-");
      String result = "";
      for (String part: parts)
      {
        result += part + " ";
      }
      System.out.println(result);
    }

    Node root = new Node("root");
  }
}