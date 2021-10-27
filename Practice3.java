import java.util.Scanner;

public class Practice3 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.print("What is your height in mm? ");
        int heightInMm = scanner.nextInt();
        System.out.println("Your height is "+calculateFeet(heightInMm)+" feet and "+calculateInch(heightInMm)+" inches!");
	}

    public static int calculateFeet(int x){
        int feet = x/(25*12);
        return feet;
    }

    public static int calculateInch(int y){
        int inch = (y/25)%12;
        return inch;
    }
// 1m=1000mm -> 40 inch -> 3 feet 4 inch
}