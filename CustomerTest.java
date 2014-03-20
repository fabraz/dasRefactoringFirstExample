import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTest {

	private static Movie m1,m2,m3, m4, m5, m6, m7, m8, m9, m10;
	private static Rental r1,r2,r3, r4, r5, r6, r7, r8, r9, r10;		
	private final String output1 = "Rental Record for Cliente 01\n"+ "\t47 Ronins\t3.0\n"+ "\t300\t6.0\n"+ "\tO Lobo de Wall Street\t9.0\n" + "Amount owed is 18.0\n" + "You earned 5 frequent renter points";
	private final String output2 = "Rental Record for Cliente 02\n"+ "\tSem Escalas\t12.0\n"+ "\tMadagascar\t4.5\n"+"\tShrek\t1.5\n"+"\tFrozen\t6.0\n"+"Amount owed is 24.0\n"+"You earned 6 frequent renter points";
	private final String output3 = "Rental Record for Cliente 03\n"+"\tOs Gonies\t3.5\n"+"\tDe Volta para o Futuro\t5.0\n"+"\tCurtindo a Vida a Doidado\t6.5\n"+"Amount owed is 15.0\n"+"You earned 3 frequent renter points";



	@BeforeClass
	public static void testSetup() {
		m1 = new Movie("47 Ronins", 1);
		m2 = new Movie("300", 1);		
		m3 = new Movie("O Lobo de Wall Street", 1);
		m4 = new Movie("Sem Escalas", 1);
		m5 = new Movie("Madagascar", 2);
		m6 = new Movie("Shrek", 2);
		m7 = new Movie("Frozen", 1);
		m8 = new Movie("Os Gonies", 0);
		m9 = new Movie("De Volta para o Futuro", 0);
		m10 = new Movie("Curtindo a Vida a Doidado", 0);
			
		r1 = new  Rental(m1, 1);
		r2 = new  Rental(m2, 2);
		r3 = new  Rental(m3, 3);
		r4 = new  Rental(m4, 4);
		r5 = new  Rental(m5, 5);
		r6 = new  Rental(m6, 1);
		r7 = new  Rental(m7, 2);
		r8 = new  Rental(m8, 3);
		r9 = new  Rental(m9, 4);
		r10 = new  Rental(m10, 5);							
	}

	@AfterClass
	public static void testCleanup() {
	}


	@Test
	public void testStatement() {
		Customer c1, c2, c3;
		c1 = new Customer("Cliente 01"); 	
		
		c1.addRental(r1);
		c1.addRental(r2);
		c1.addRental(r3);
		
		assertEquals("stringComparason \nfirst: " +output1  + "\nsecond: " + c1.statement(), output1, c1.statement().toString() );
		
		c2 = new Customer("Cliente 02");
		c2.addRental(r4);
		c2.addRental(r5);
		c2.addRental(r6);
		c2.addRental(r7);

		assertEquals("stringComparason \nfirst: " +output2  + "\nsecond: " + c2.statement(), output2, c2.statement().toString() );
		
			
		c3 = new Customer("Cliente 03");
		c3.addRental(r8);
		c3.addRental(r9);
		c3.addRental(r10);

		assertEquals("stringComparason \nfirst: " +output3  + "\nsecond: " + c3.statement(), output3, c3.statement().toString() );

		//System.out.println(output3);
	

		//System.out.println(c3.statement());
		
	}
}

