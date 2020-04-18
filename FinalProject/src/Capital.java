
public class Capital {
	private String capital[] = {"Berlin", "Paris", "London", "Bejing", "Tokyo", "Canberra", "Rome", "Moscow", "Brasilia", "Ottawa"};
	private int anum;
	NumGen number = new NumGen();
	int zyx = number.getnum2();
	public Capital(int Number) {
		anum = Number;
	}
	public String getCapital() {
		
		return capital[anum];
	}
	public String getCountry2() {
		Country country = new Country(anum);
		return country.getForCapital(); 
	}
	public String getForCountry() {
		return capital[anum];
	}
}
