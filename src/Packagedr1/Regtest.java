package Packagedr1;

import org.testng.annotations.Test;

import Packagedr.Regi;

public class Regtest extends Base {

	@Test
	public void testing()
	{
		Regi ob=new Regi(driver);
		ob.clicking();
		ob.reg();
		ob.settingvalue("sreya", "p", "sreyapsethu94@gmail.com", "sreya@123");
		ob.submitting();
	}
	

}

