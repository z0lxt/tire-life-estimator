//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

    Scanner x = new Scanner(System.in);
    IO.println("--------------------------------");
    IO.println("Welcome to Tire Age Estimator");
    IO.println("--------------------------------");
    IO.println();
    final double tireKMMaxAllSeason = 80000;
    final double tireAgeMaxAllSeason = 10;
    IO.println("Do you own a heavy SUV or an electric car? (yes/no): ");
    String answer = x.nextLine().trim().toLowerCase();
    if(!answer.isEmpty())
    {
        tireEstimator(answer, tireKMMaxAllSeason, tireAgeMaxAllSeason);
    }
    else
    {
        IO.println("Please enter something");
    }
}
public static void tireEstimator(String answer, double tireKMMaxAllSeason, double tireAgeMaxAllSeason) {

    Scanner x = new Scanner(System.in);
    double multiplier = 0;
    if (answer.equals("yes")) {
        multiplier = 0.85;
        // EVs and Heavy SUVs on average burn out tires 10 - 20% quicker so 15% is a good middle ground
    } else if (answer.equals("no")) {
        multiplier = 1;
    } else {
        IO.println("Please print a valid option.");
    }

    double tireLifeKM = tireKMMaxAllSeason * multiplier;
    double tireAgeYear = tireAgeMaxAllSeason * multiplier;

    IO.println("How long have you had the tire for? (in years, if 1 year 6 months type 1.5, etc, just type the number): ");
    double reply = x.nextDouble();
    IO.println("How much have you used the tire for (in km): ");
    double km = x.nextDouble();
    if (km >= tireLifeKM || reply >= tireAgeYear) {
        IO.println("Your tire is getting old, you should replace it.");
    } else {
        double estimatedLifeKM = tireLifeKM - km;
        double estimatedLifeYear = tireAgeYear - reply;
        IO.println("You can continue using your tire.");
        IO.println("You can use your tire for approximately " + estimatedLifeKM + " kilometers or " + estimatedLifeYear + " years.");
    }
}

