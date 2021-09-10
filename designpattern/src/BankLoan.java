import java.util.ArrayList;

class BankLoan implements Bank
{
    private ArrayList<Media> observers = new ArrayList<Media>();
    private String loanType;
    private float interest_rate;
    private String name;

    public BankLoan(String loanType, float interest_rate, String name)
    {
        this.loanType = loanType;
        this.interest_rate = interest_rate;
        this.name = name;
    }

    public float getInterestRate()
    {
        return interest_rate;
    }

    public void setInterestRate(float interest_rate)
    {
        this.interest_rate = interest_rate;
        notifyMedias();
    }

    public String getName()
    {
        return this.name;
    }

    public String getloanType()
    {
        return this.loanType;
    }

    @Override
    public void registerMedia(Media observer) // adding media instance to the ArrayList
    {
        observers.add(observer);
    }

    @Override
    public void removeMedia(Media observer) // removing media from the ArrayList
    {
        observers.remove(observer);
    }

    @Override
    public void notifyMedias()
    {
        for (Media ob : observers)
        {
            System.out.println("\nThis message is to notify you that interest rate has changed.!!");
            ob.update(this.interest_rate);
        }

    }

}
