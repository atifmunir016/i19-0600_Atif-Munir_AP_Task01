import static org.junit.Assert.*;

import org.junit.Test;

public class SetPinTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}




package JUnit.accountTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.UserInformation;

class setPINtesting {
	

	@Test
	void test1() {
		
		UserInformation info= new UserInformation("Atif", "Munir", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		String output =  ac.setPIN("9876");
		
		
		assertEquals(9876, output);
	}
	
	@Test
	void test() {
		
		UserInformation info= new UserInformation("Atif", "Munir", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		String output =  ac.setPIN("9876.");
		
		
		assertEquals("9876", output);
	}
	@Test
	void test4() {
		UserInformation info= new UserInformation("Atif", "Munir", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		String output =  ac.setPIN("9876");
		
		assertEquals("9876", output);
		
	}
	@Test
	void test5() {
		
		UserInformation info= new UserInformation("Atif", "Munir", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		String output =  ac.setPIN("987,6");
		
		
		assertEquals("9876", output);
		
		
	}
}