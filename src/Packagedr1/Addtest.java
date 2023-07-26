package Packagedr1;

import org.testng.annotations.Test;

import Packagedr.Add;

public class Addtest extends Base {
	@Test
	public void Testing() throws InterruptedException
	{
		Add io=new Add(driver);
		Thread.sleep(3000);
		io.searching("sunscreen");
		io.addcart();
	}
	

}


