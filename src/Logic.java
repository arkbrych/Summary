import java.util.InputMismatchException;
import java.util.Scanner;

class Logic {

    private Scanner input = new Scanner(System.in);
    private int number;
    private int sum;

    void start() {


        while (true) {
            System.out.println("Wpisz liczbę całkowitą mniejszą od 100");
            try {
                number = input.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Wpisany znak nie jest liczbą całkowitą");
                //e.printStackTrace();
                input.nextLine();
            }

            if (number < 100) {
                sum += number;
            } else {
                System.out.println("Wpisana liczba jest większa lub równa 100, kończę wprowadzanie danych");
                break;
            }
        }

        System.out.println("Suma liczb wynosi " + sum);

        if (IsEven(sum)) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba nie jest parzysta");
        }
        input.close();
    }


    private boolean IsEven(int sum) {

        return (sum % 2 == 0);
    }

}
