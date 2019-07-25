import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so: ");
        int number = scanner.nextInt();

        if (number > 999) {
            System.out.println("out of ability");
        } else if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (number >= 10 && number < 20) {
            int hangDonVi = number % 10;
            switch (hangDonVi) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleventh");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number >= 20 & number < 100) {
            int hangChuc = number / 10;
            int hangDonVi = number % 10;

            switch (hangChuc) {
                case 2:
                    System.out.println("twenty");
                    break;
                case 3:
                    System.out.println("thirty");
                    break;
                case 4:
                    System.out.println("forty");
                    break;
                case 5:
                    System.out.println("fifty");
                    break;
                case 6:
                    System.out.println("sixty");
                    break;
                case 7:
                    System.out.println("seventy");
                    break;
                case 8:
                    System.out.println("eighty");
                    break;
                case 9:
                    System.out.println("ninety");
                    break;
            }
            switch (hangDonVi) {
                 case 1:
                    System.out.println(" one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (number >= 100 && number <= 110) {
            int hangTram = number / 100;
            int hangDonVi = number % 10;

            switch (hangTram) {
                case 0:
                    System.out.println("one hundred");
                    break;
                case 1:
                    System.out.println("One hundred and");
                    break;
                case 2:
                    System.out.println("Two hundred and");
                    break;
                case 3:
                    System.out.println("Three hundred and");
                    break;
                case 4:
                    System.out.println("Four hundred and");
                    break;
                case 5:
                    System.out.println("Five hundred and");
                    break;
                case 6:
                    System.out.println("Six hundred and");
                    break;
                case 7:
                    System.out.println("Seven hundred and");
                    break;
                case 8:
                    System.out.println("Eight hundred and");
                    break;
                case 9:
                    System.out.println("Nine hundred and");
                    break;
            }
            switch (hangDonVi) {
                case 1:
                    System.out.println(" one");
                    break;
                case 2:
                    System.out.println(" two");
                    break;
                case 3:
                    System.out.println(" three");
                    break;
                case 4:
                    System.out.println(" four");
                    break;
                case 5:
                    System.out.println(" five");
                    break;
                case 6:
                    System.out.println(" six");
                    break;
                case 7:
                    System.out.println(" seven");
                    break;
                case 8:
                    System.out.println(" eight");
                    break;
                case 9:
                    System.out.println(" nine");
                    break;
            }
        } else if (number >110 && number >120){
            int hangTram = number / 100;
            int hangChuc = number / 10;
            int hangDonVi = number % 10;

            switch (hangTram) {
                case 1:
                    System.out.println("One hundred ");
                    break;
                case 2:
                    System.out.println("Two hundred ");
                    break;
                case 3:
                    System.out.println("Three hundred ");
                    break;
                case 4:
                    System.out.println("Four hundred ");
                    break;
                case 5:
                    System.out.println("Five hundred ");
                    break;
                case 6:
                    System.out.println("Six hundred ");
                    break;
                case 7:
                    System.out.println("Seven hundred ");
                    break;
                case 8:
                    System.out.println("Eight hundred ");
                    break;
                case 9:
                    System.out.println("Nine hundred ");
                    break;
            }
            switch (hangChuc) {
                case 2:
                    System.out.println(" and twelve");
                    break;
                case 3:
                    System.out.println(" and thirteen");
                    break;
                case 4:
                    System.out.println(" and fourteen");
                    break;
                case 5:
                    System.out.println(" and fifteen");
                    break;
                case 6:
                    System.out.println(" and sixteen");
                    break;
                case 7:
                    System.out.println(" and seventeen");
                case 8:
                    System.out.println(" and eighteen");
                    break;
                case 9:
                    System.out.println(" and nineteen");
                    break;
            }
            switch (hangDonVi) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
    }
}
