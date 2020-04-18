
public class Country {
private	String country[] = {"Germany", "France", "United Kingdom", "China", "Japan", "Australia", "Italy","Russia", "Brazil", "Canada"};
private int anum;
NumGen number = new NumGen();
int zyx = number.getnum2();
public Country(int Number) {
	anum = Number;
}
public String getCountry() {
	return country[anum];
}
public String getCapital2() {
	Capital capital = new Capital(anum);
	return capital.getForCountry(); 
	
}
public String getForCapital() {
	return country[anum];
}

}
