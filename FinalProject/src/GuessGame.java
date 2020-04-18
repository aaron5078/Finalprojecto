import java.util.Scanner;
public class GuessGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String keyboard = ""; 
		NumGen number = new NumGen();
		int xyz;
		int score = 0;
		int strike = 0;
		String countrie;
		String capitaly;
		while(strike < 3 && score < 50){
			xyz = number.getnum();
			if(xyz == 0){
			
			int zyx = number.getnum2();
			Country country = new Country(zyx);
			countrie = country.getCountry();
			capitaly = country.getCapital2();
			System.out.println(capitaly);
			System.out.println("What is the capital of " + countrie);
			keyboard = input.nextLine();
			if(keyboard.equals(capitaly)|| keyboard.equals(capitaly.toLowerCase())) {
			 System.out.println("Correct");
			 score += 5;
			}else {
				System.out.println("Wrong");
				strike += 1;
			}
		}else {
			
			int zyx = number.getnum2();
			Capital capital = new Capital(zyx);
			capitaly = capital.getCapital();
			countrie = capital.getCountry2();
			System.out.println(countrie);
			System.out.println("In what country is " + capitaly + " the capital?");
			keyboard = input.nextLine();
			if(keyboard.equals(countrie) || keyboard.equals(countrie.toLowerCase())) {
				 System.out.println("You Win");
				 score += 5;
			}else {
				System.out.println("Wrong");
				strike += 1;
			}
		}
		}
	System.out.println("Your score is " + score);
	}

}
