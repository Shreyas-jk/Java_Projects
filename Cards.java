public class Cards
{
    private int number;
    private String suit;
    private String number_name;
    public Cards(int  a, String b, String c)
    {
        number = a;
        suit = b;
        number_name = c;
    }

    public int getNumber()
    {
        return number;
    }

    public String getSuit()
    {
        return suit;
    }
    public String getNumber_name()
    {
        return number_name;
    }

    public void setNumber(int a)
    {
        number = a;
    }
    public void setSuit(String b)
    {
        suit = b;
    }
    public void setNumber_name(String c)
    {
        number_name = c;
    }


}
