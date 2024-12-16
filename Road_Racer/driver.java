public class driver
{
    private int time;
    private String male_female;
    public driver(int time,String male_female)
    {
        this.time = time;
        this.male_female = male_female;
    }
    public int getTime() {return time;}
    public String getMale_female(){return male_female;}
    public void setTime(int time) {this.time = time;}
    public void setMale_female(String male_female){this.male_female = male_female;}
}
