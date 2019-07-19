package banka;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class BankTest {
	Bank b;
	@BeforeTest
	public void startBank(){
		b=new Bank();
	}
	@BeforeMethod
	public void resetBank() {
		if(b!=null)b.reset();
	}
	@Test
	public void testNaloga() {
		Account a1 = b.openAccount("Vlada");
		Account a2 = b.openAccount("Nikola");
		Account a3 = b.openAccount("Bojan");
		Account a4 = b.openAccount("Nenad");
		Account a5 = b.openAccount("Sanja");
		try {
			Assert.assertEquals(a1, b.getAccount(a1.getNumber()));
			Assert.assertEquals(a2, b.getAccount(a2.getNumber()));
			Assert.assertEquals(a3, b.getAccount(a3.getNumber()));
			Assert.assertEquals(a4, b.getAccount(a4.getNumber()));
			Assert.assertEquals(a5, b.getAccount(a5.getNumber()));
		}
		 catch(AssertionError ae)
		  {
			  Assert.fail();
			  System.out.println(ae.getMessage());
		  }
	}
	@Test
	public void testUplata() {
		Account a1 = b.openAccount("Kristina");
		b.payInMoney(a1.getNumber(), 3000d);
		try {
			Assert.assertEquals(a1.getAmount(), 3000d);
		}
		catch(AssertionError ae)
		  {
			  Assert.fail();
			  System.out.println(ae.getMessage());
		  }
		
	}
	@Test
	public void testTransfer() {
		//metoda je morala da se ispravi, da se dodaju uslovi u if
		Account a1 = b.openAccount("Kristina");
		Account a2 = b.openAccount("Aleksandra");
		a1.setAmount(500d);
		a2.setAmount(200d);
		boolean s = b.transferMoney(a1.getNumber(), a2.getNumber(), 300d);
		try {
			Assert.assertEquals(s, true);
		}
		catch(AssertionError ae)
		  {
			  Assert.fail();
			  System.out.println(ae.getMessage());
		  }
	}
	@Test
	public void testRacun() {
		//trebalo je ispraviti metodu, i ide od 0 a ne 1
		Account a1 = b.openAccount("Kristina");
		Account a2 = b.openAccount("Aleksandra");
		a1.setAmount(500d);
		a2.setAmount(200d);
		double d = b.getSumMoney();
		try {
			Assert.assertEquals(d, 700d);
		}
		catch(AssertionError ae)
		  {
			  Assert.fail();
			  System.out.println(ae.getMessage());
		  }
	}
	
	
	
  
  
  
  
  
  
}















/*@Test
  public void testAdd() {
	  Account a1=b.openAccount("Boban");
	  try {
		  Assert.assertEquals(a1.getName(), "Boban");
		  
	  }
	  catch(AssertionError ae)
	  {
		  Assert.fail();
		  System.out.println(ae.getMessage());
	  }
	  
  }*/