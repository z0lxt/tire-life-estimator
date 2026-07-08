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
    final double TireKMMaxAllSeason = 80000;
    final double TireAgeMaxAllSeason = 10;
    IO.println("Do you own a heavy SUV or an electric car? (yes/no): ");
    String answer = x.nextLine();
    answer = answer.toLowerCase();
    TireEstimator(answer, TireKMMaxAllSeason, TireAgeMaxAllSeason);
}
public static void TireEstimator(String answer, double TireKMMaxAllSeason, double TireAgeMaxAllSeason)
{
    Scanner x = new Scanner(System.in);
    if(answer.equals("yes"))
    {
        double TireLifeKM = TireKMMaxAllSeason*0.85;
        // EVs and Heavy SUVs on average burn out tires 10 - 20% quicker so 15% is a good middle ground
        double TireAgeYear = TireAgeMaxAllSeason*0.85;
        IO.println("How long have you had the tire for? (in years, if 1 year 6 months type 1.5, etc, just type the number): ");
        double reply = x.nextDouble();
        IO.println("How much have you used the tire for (in km): ");
        double Km = x.nextDouble();
        if(Km>=TireLifeKM || reply>=TireAgeYear)
        {
            IO.println("Your tire is getting old, you should replace it.");
        }
        else
        {
            double estimatedLifeKM = TireLifeKM - Km;
            double estimatedLifeYear = TireAgeYear - reply;
            IO.println("You can continue using your tire.");
            IO.println("You can use your tire for approximately " + estimatedLifeKM + " kilometers or " + estimatedLifeYear + " years.");
        }
    }
    else if(answer.equals("no"))
    {
        IO.println("How long have you had the tire for? (in years, if 1 year 6 months type 1.5, etc, just type the number): ");
        double reply = x.nextDouble();
        IO.println("How much have you used the tire for (in km): ");
        double Km = x.nextDouble();
        if(Km>=TireKMMaxAllSeason || reply>=TireAgeMaxAllSeason)
        {
            IO.println("Your tire is getting old, you should replace it.");
        }
        else
        {
            double estimatedLifeKM = TireKMMaxAllSeason - Km;
            double estimatedLifeYear = TireAgeMaxAllSeason - reply;
            IO.println("You can continue using your tire.");
            IO.println("You can use your tire for approximately " + estimatedLifeKM + " kilometers or " + estimatedLifeYear + " years.");
        }
    }
    else
    {
        IO.println("Please enter a valid option.");
    }
}
