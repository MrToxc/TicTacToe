import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *This class is used fo entering valid numbers.
 */
public class UserInputConsole implements UserInput {

    private final Scanner sc = new Scanner(System.in);
    private final UserOutput userOutput;

    public UserInputConsole(UserOutput userOutput) {
        this.userOutput = userOutput;
    }

    /**
     * Method used to get valid int from user.
     *
     * @return Returns valid int user entered.
     */
    public int enterValidInt() {
        boolean ok = false;
        int numb = 0;
        do {
            try {
                userOutput.println("Enter number");
                numb = sc.nextInt();
                ok = numb > 0;
            } catch (InputMismatchException e1) {
                userOutput.println("You have entered non valid number");
                sc.next();
            }
        } while (!ok);
        return numb;
    }

    /**
     * Method used to get valid double from user.
     *
     * @return Returns valid double user entered.
     */
    public double enterValidDouble() {
        boolean ok = false;
        double numb = 0;
        do {
            try {
                userOutput.println("Enter number");
                numb = sc.nextDouble();
                ok = numb > 0;
            } catch (InputMismatchException e1) {
                userOutput.println("You have entered non valid number");
                sc.next();
            }
        } while (!ok);
        return numb;
    }

    /**
     * Method used to get valid boolean from user.
     *
     * @return Returns valid boolean user entered.
     */
    public boolean enterValidBoolean() {
        boolean ok = false;
        boolean boo = false;
        do {
            try {
                userOutput.println("Enter boolean");
                boo = sc.nextBoolean();
                ok = true;
            } catch (InputMismatchException e1) {
                userOutput.println("You have entered non valid boolean");
                sc.next();
            }
        } while (!ok);
        return boo;
    }
}