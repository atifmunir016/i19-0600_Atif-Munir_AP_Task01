import static org.junit.Assert.*;

import org.junit.Test;

public class AccountNumbertest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}





package JUnit.accountTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.Database;
import bank.UserInformation;

class getAccountNoTesting {
	
	UserInformation info= new UserInformation("Atif", "Munir", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
	Account ac =new CurrentAccount(info);

	@Test
	void test14() {
		
		
		String output =  ac.getAccuntNo();
		
		assertTrue(output.matches("90197475"));
		
	}
	
	@Test
	void test15() {
		
		UserInformation info= new UserInformation("Atif", "Munir", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		
		String output =  ac.accountNo;
		
		System.out.println(output+"Atif" );
		
		assertTrue(output.matches("90197475"),"everytime generate a new accountNo randomly");
		
	}
	
	@Test
	void test1() {
		
		UserInformation info= new UserInformation("Atif", "Munir", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		
		Account ac =new CurrentAccount(info);
		
		String output =  ac.getAccuntNo();
		
		
		assertEquals("4757", output);
		
	}
	
	
}
