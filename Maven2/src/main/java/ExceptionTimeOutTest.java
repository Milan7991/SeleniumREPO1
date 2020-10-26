import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	
	/*@Test (timeOut = 3,expectedExceptions = NumberFormatException.class)
	public void infiniteloop()
	{
		int i=1;
		while (i==1)
		{
			
		System.out.println(i);
		
	}*/
		
		@Test (expectedExceptions = NumberFormatException.class)
		public void test()
		{
			String s= "100A";
			Integer.parseInt(s);
		}
}


