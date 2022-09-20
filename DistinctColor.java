import java.util.*;

interface DistinctColor1
{
    int numberofDistinctcolor(List<Color> mysterycolors);
    int colorOccurence(List<Color> mysterycolors, Color color);

}
public class DistinctColor implements DistinctColor1
{

    public static void main(String[] args)
    {
        ArrayList<Color> list= new ArrayList<Color>(4);
        list.add(Color.Red);
        list.add(Color.Blue);
        list.add(Color.Green);
        list.add(Color.Blue);

        System.out.println(list);
        System.out.println(new DistinctColor().numberofDistinctcolor(list));
        System.out.println(new DistinctColor().colorOccurence(list,Color.Blue));

    }

    @Override
    public int numberofDistinctcolor(List<Color> mysterycolors)
    {
        HashSet<Color> hset = new HashSet<Color>(mysterycolors);
        return hset.size();
    }

    @Override
    public int colorOccurence(List<Color> mysterycolors, Color color)
    {
        int count=0;
        for(int i=1;i<mysterycolors.size();i++)
        {
            if(mysterycolors.get(i).equals(color))
            {
                count++;
            }
        }
        return count;
    }
}
enum Color
{
    Red,
    Blue,
    Green;
}
