package banka;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest {
	Account a;
  @Test
  public void testKonst() {
	  a = new Account("Bojan", "004");
	  try {
		  Assert.assertEquals(a.getName(), "Bojan");
		  Assert.assertEquals(a.getNumber(), "004");
		  Assert.assertEquals(a.getAmount(), 0d);
	  }
	  catch(AssertionError ae)
	  {
		  Assert.fail();
		  System.out.println(ae.getMessage());
	  }
  }
  @Test
  public void testGetere() {
	  a = new Account("Nikola", "003");
	  a.setAmount(300d);
	  try {
		  Assert.assertEquals(a.getName(), "Nikola");
		  Assert.assertEquals(a.getNumber(), "003");
		  Assert.assertEquals(a.getAmount(), 300d);
	  }
	  catch(AssertionError ae)
	  {
		  Assert.fail();
		  System.out.println(ae.getMessage());
	  }
  }
  @Test
  public void testFormat() {
	  a = new Account("Vlada", "002");
//	  a.toString();
	  try {
		  Assert.assertEquals(a.toString(), String.format("%s\t%s\t%.2f", a.getNumber(), a.getName(), a.getAmount()));
	  }
	  catch(AssertionError ae)
	  {
		  Assert.fail();
		  System.out.println(ae.getMessage());
	  }
  }
  @Test
  public void testMnogoAcc() {
	Account[] nalozi = new Account[100];
	for(int i = 0; i < nalozi.length; i++) {
		nalozi[i] = new Account("ime"+i);
	}
	try {
		for(int i = 0; i < nalozi.length; i++) {
			for(int j = i+1; j < nalozi.length; j++) {
				Assert.assertNotEquals(nalozi[i].getNumber(), nalozi[j].getNumber());
			}
			
		}
	}
	 catch(AssertionError ae)
	  {
		  Assert.fail();
		  System.out.println(ae.getMessage());
	  }
	
  }
  
  
  
  
}
