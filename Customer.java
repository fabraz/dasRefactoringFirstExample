import java.util.Vector;
import java.util.Enumeration;

class Customer {
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();

	public Customer(String name) {
		_name = name;
	};

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	};

	public String getName() {
		return _name;
	};

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();

			thisAmount = amount(each);

			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release

			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
					&& each.getDaysRented() > 1)
				frequentRenterPoints++;

			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(thisAmount) + "\n";

			totalAmount += thisAmount;

		}

		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";

		result += "You earned " + String.valueOf(frequentRenterPoints)
				+ " frequent renter points";

		return result;
	}
	
	//Any fool can write code that a computer can understand. Good programmers write code that humans can understand.
	//Method moved to Rental, since every operation happens on that object and not on Customer
	private double amount(Rental aRental) {
		
		return aRental.getCharge();
	
	}
}
