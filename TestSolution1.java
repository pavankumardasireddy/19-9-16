import java.io.*;
public class TestSolution1
{

	public int sumDigits(String str)
	{
		int sum = 0;
 		int lim = str.length();
  		char ch;
  		for(int i = 0; i < lim; i++)
  		{
  			ch = str.charAt(i);
			if(Character.isDigit(ch)) // or simply (ch >= '0' && ch <= '9')
			sum += (ch - '0');
		}
	return sum;
	}
	public static void main(String[] args)
	{
		TestSolution1 ts1=new TestSolution1();
		System.out.println(ts1.sumDigits("a1bb4c4cd"));
	}
}