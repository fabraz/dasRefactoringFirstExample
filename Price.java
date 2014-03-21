abstract class Price {
	abstract int getPriceCode();

	abstract double getCharge(int daysRented);

	public int getFrequentRenterPoints(int _daysRented) {
		return 1;
	}
}

class ChildrenPrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	double getCharge(int daysRented) {
		double result = 1.5;
		// determine amounts for each line
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}
}

class NewReleasePrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	double getCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getFrequentRenterPoints(int _daysRented) {
		return (_daysRented > 1) ? 2 : 1;

	}
}

class RegularPrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	double getCharge(int _daysRented) {
		double result = 2;
		if (_daysRented > 2)
			result += (_daysRented - 2) * 1.5;
		return result;
	}
}
