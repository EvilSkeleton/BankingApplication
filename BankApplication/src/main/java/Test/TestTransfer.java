package Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dashboard.Transfer;

public class TestTransfer {
	String username;
	double amount;
	String pass;
	
	@BeforeEach
	public void setUp() {
		username = "1001";
		amount = 340.0;
		pass = "12";
	}
	
	@AfterEach
	public void tearDown() {
		username = null;
		amount = 0.0;
		pass = null;
	}
	
	@Test
	public void givenValidUsernameValidAmountValidPassword_testTransfer_shouldTransferMoney() {
		try {
			boolean status = Transfer.transfer(username, amount, pass);
			assertTrue(status);
		} catch(Exception e) {
			e.printStackTrace();
			fail("Did not transfer money!");
		}
	}

	@Test
	public void givenInvalidUsernameValidAmountValidPassword_testTransfer_shouldTransferMoney() {
		try {
			username = "123456";
			boolean status = Transfer.transfer(username, amount, pass);
			assertFalse(status);
		} catch(Exception e) {
			e.printStackTrace();
			fail("Did not transfer money!");
		}
	}

//	@Test
//	public void givenValidUsernameInvalidAmountValidPassword_testTransfer_shouldTransferMoney() {
//		try {
//			amount = -1256.0;
//			boolean status = Transfer.transfer(username, amount, pass);
//			assertFalse(status);
//		} catch(Exception e) {
//			e.printStackTrace();
//			fail("Did not transfer money!");
//		}
//	}
	
	@Test
	public void givenValidUsernameValidAmountInvalidPassword_testTransfer_shouldTransferMoney() {
		try {
			pass = "11";
			boolean status = Transfer.transfer(username, amount, pass);
			assertFalse(status);
		} catch(Exception e) {
			e.printStackTrace();
			fail("Did not transfer money!");
		}
	}
}
