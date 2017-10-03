public class sum {
  public static void main(String s[])
  {
	    int x = 10;
	    int y = 21;
	    while (y != 0)
	    {
	        int carry = x & y;  
	        x = x ^ y; 
	        y = carry << 1;
	    }
	    System.out.print("Sum is : ");
	    System.out.print(x);
  }
}
