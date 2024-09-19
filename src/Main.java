public class Main
{
    public static void main(String[] args)
    {
        double cardBalance = 5000.00;
        final double INTEREST_RATE = .17;
        double monthInterest = 0;
        double total1 = 0;
        double total2 = 0;

        monthInterest = cardBalance * INTEREST_RATE;
        total1 = monthInterest;

        System.out.println("The interest owed for the first month is " + total1);

        total2 = (total1 * INTEREST_RATE) + total1;

        System.out.println("The interest owed for the second month is " + total2);



    }
}