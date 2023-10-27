import java.util.Scanner;

public class ZikirmatikService {
    Scanner scan = new Scanner(System.in);
    boolean isWork = true;
    int count = 0;
    Zikirmatik zikirmatik = new Zikirmatik();

    public void increase() {
        zikirmatik.setCounter(count);
        count++;

    }

    public void decrease() {
        if (count > 0) {
            zikirmatik.setCounter(count);
            count--;
        }

    }

    public void reset() {
        System.out.println("Now it is reset time " + " *** " +  count);
    }

    public void displayMenu() {


        do {
            System.out.println("Zikirmatik Application");
            System.out.println("""
                    1-Increase the number of Zikr
                    2-Decrease the number of Zikr
                    3-Reset
                    4-Exit
                    """);
            int select = scan.nextInt();

            switch (select) {
                case 1:
                    increase();
                    System.out.println("The number is gradually increasing " + " *** " + count);
                    break;
                case 2:
                    decrease();
                    System.out.println("The number is gradually decreasing " + " *** " + count);

                    break;
                case 3:
                    reset();
                    break;
                case 4:
                    System.out.println("********* You are exit  ************");
                    isWork = false;
                    break;
            }


        } while (isWork);


    }
}