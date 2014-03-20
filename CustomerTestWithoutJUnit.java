/** Classe para testar a classe IMath. */
public class CustomerTestWithoutJUnit {
   /** Rode os testes. */
   public static void main(String[] args) {
		Movie m1 = new Movie("47 Ronins", 1);
		Movie m2 = new Movie("300", 1);		
		Movie m3 = new Movie("O Lobo de Wall Street", 1);
		Movie m4 = new Movie("Sem Escalas", 1);
		Movie m5 = new Movie("Madagascar", 2);
		Movie m6 = new Movie("Shrek", 2);
		Movie m7 = new Movie("Frozen", 1);
		Movie m8 = new Movie("Os Gonies", 0);
		Movie m9 = new Movie("De Volta para o Futuro", 0);
		Movie m10 = new Movie("Curtindo a Vida a Doidado", 0);
			
		Rental r1 = new  Rental(m1, 1);
		Rental r2 = new  Rental(m2, 2);
		Rental r3 = new  Rental(m3, 3);
		Rental r4 = new  Rental(m4, 4);
		Rental r5 = new  Rental(m5, 5);
		Rental r6 = new  Rental(m6, 1);
		Rental r7 = new  Rental(m7, 2);
		Rental r8 = new  Rental(m8, 3);
		Rental r9 = new  Rental(m9, 4);
		Rental r10 = new  Rental(m10, 5);	

		Customer c1 = new Customer("Cliente 01"); 								
		
		c1.addRental(r1);
		c1.addRental(r2);
		c1.addRental(r3);					

	
              System.out.println(c1.statement()+"\n");

		Customer c2 = new Customer("Cliente 02");
		c2.addRental(r4);
		c2.addRental(r5);
		c2.addRental(r6);
		c2.addRental(r7);

		System.out.println(c2.statement()+"\n");


		Customer c3 = new Customer("Cliente 03");

		c3.addRental(r8);
		c3.addRental(r9);
		c3.addRental(r10);
		
		System.out.println(c3.statement());

  }

}

