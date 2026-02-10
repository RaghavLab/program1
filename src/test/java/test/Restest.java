package test;
import p1.app1;
import org.testng.*;

public class Restest {
	public void testPass() {
		org.testng.Assert.assertEquals(app1.display(55),"pass");
	}
	public void testFail() {
		org.testng.Assert.assertEquals(app1.display(39),"fail");
	}
	public void testinvalid() {
		org.testng.Assert.assertEquals(app1.display(-1),"invalid");
	}
}
