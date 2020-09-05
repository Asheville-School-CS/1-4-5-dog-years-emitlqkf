import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int birthYear = 0;
    int currentYear = 0;
    int dogBirthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your birth year: ");
    birthYear = input.nextInt();
    System.out.println("Enter your dog's birth year: ");
    dogBirthYear = input.nextInt();

    System.out.println("Enter the current year: ");
    currentYear = input.nextInt();
    int dogsAge = 0;
    dogsAge = (currentYear - dogBirthYear) * 7;
    int humanAge = 0;
    humanAge = currentYear - birthYear;

    System.out.println("Human: " + humanAge + " Dog: " + dogsAge);


  }
}
