import java.util.ArrayList;

class Movie
{
    private final String title;
    private final String studio;
    private final String rating;

    Movie(String title, String studio, String rating)
    {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title, String studio)
    {
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }
    public String gettitle()
    {
        return title;
    }
    public String getstudio()
    {
        return studio;
    }
    public String getrating()
    {
        return rating;
    }
}
class ActualMovie2
{
//    Write a method getPg, which takes an array of base type Movie as its argument, and returns a new array of only
//    those movies in the input array with a rating of “PG”. You may assume that the input array is full of Movie instances.
//    The returned array need not be full.

    public static void  getpg(Movie[] Pglist )
    {
        ArrayList<String> list= new ArrayList<>(2);
        for(Movie  m: Pglist)
        {
            if(m.getrating().equals("PG"))
            {
                list.add(m.gettitle());
            }
        }

            System.out.println(list);
    }
    public static void main(String[] args)
    {
        Movie[] list=new Movie[3];
        Movie M = new Movie("Casino royale","Eon Productions","PG-13");
        Movie M2 = new Movie("IndependenceDay2","Eon Productions2","PG");
        Movie M3 = new Movie("IndependenceDay3","Eon Productions3");
        list[0]=M;
        list[1]=M2;
        list[2]=M3;
        getpg(list);
        System.out.println(M.getstudio());

    }
}

