class Television implements Media {
    @Override
    public void update(float interest_rate)
    {
        System.out.println("Media Name:Television \nMessage:New Interest Rate is: " + interest_rate);
        System.out.println("\n____________________________________");
    }
}
