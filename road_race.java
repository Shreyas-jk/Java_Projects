import java.util.*;
public class road_race
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many racers are there:");
        int num_racers = input.nextInt();
        input.nextLine();
        ArrayList<driver> race = new ArrayList<>();
        for (int i = 1; i <= num_racers; i++)
        {
            System.out.println("What is driver number " + ( i + 1 ) + "'s time:");
            int race_time = input.nextInt();
            input.nextLine();
            System.out.println("What is driver number " + ( i + 1 ) + "'s gender:");
            String race_gender = input.nextLine();
            race.add(new driver(race_time, race_gender));
        }

        int max_time = 10^99;
        int remove = 0;
        ArrayList<driver> top_overall = new ArrayList<>();
        for (int j = 0; j < 2; j ++)
        {
            for (int i = 1; i <= num_racers; i++)
            {
                if (race.get(i).getTime() < max_time)
                {
                    max_time = race.get(i).getTime();
                    remove = i;
                }
            }
            top_overall.add(race.get(remove));
            race.remove(remove);
        }

        int max_time_men = 10^99;
        remove = 0;
        ArrayList<driver> top_men_overall = new ArrayList<>();
        for (int j = 0; j < 2; j ++)
        {
            for (int i = 1; i <= num_racers; i++)
            {
                if (race.get(i).getTime() < max_time && race.get(i).getMale_female().equals("M"))
                {
                    max_time_men = race.get(i).getTime();
                    remove = i;
                }
            }
            top_men_overall.add(race.get(remove));
            race.remove(remove);
        }
        int max_time_women = 10^99;
        remove = 0;
        ArrayList<driver> top_women_overall = new ArrayList<>();
        for (int j = 0; j < 2; j ++)
        {
            for (int i = 1; i <= num_racers; i++)
            {
                if (race.get(i).getTime() < max_time && race.get(i).getMale_female().equals("W"))
                {
                    max_time_women = race.get(i).getTime();
                    remove = i;
                }
            }
            top_women_overall.add(race.get(remove));
            race.remove(remove);
        }
        System.out.println(top_overall.get(0).getTime());
        System.out.println(top_women_overall.get(0).getTime());
        System.out.println(top_men_overall.get(0).getTime());
        System.out.println(top_men_overall.get(1).getTime());
    }
}
