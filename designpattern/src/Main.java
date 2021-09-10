public class Main //starting point for an application
{
    public static void main(String args[]) //main method
    {

        Newspaper n = new Newspaper();
        Television t = new Television();

        BankLoan bl = new BankLoan("Personal Loan", 10.7f, "Citi");
        bl.registerMedia((Media) n);
        bl.registerMedia((Media) t);


        bl.setInterestRate(5.5f);

    }
}









