import java.util.ArrayList;

public class BrowerhisTrial
{
    ArrayList<String>arr= new ArrayList<>();
    public int pointer=0;
    public BrowerhisTrial(String url)
    {
        arr.add(url);
        pointer=arr.size();
    }
    public void visit(String url)
    {
        arr.add(url);
        pointer++;
        //For deleting
        if (pointer != arr.size()) {
            for (int i = pointer + 1; i <= arr.size(); i++) {
                arr.remove(i);
            }
        }
        pointer= arr.size();
    }
    public void back(int steps)
    {
        if(pointer-steps>0)
        {
            pointer=pointer-steps;
        }
        else
        {
            pointer=1;
        }
        System.out.println("You are in "+ arr.get(pointer-1));
    }
    public void forward(int  steps1)
    {
        if(steps1>arr.size()-pointer)
        {
            pointer=arr.size()-1;
        }
        else
        {
            pointer=pointer+steps1;
        }
        System.out.println("you are in "+arr.get(pointer-1));
    }

    public static void main(String[] args) {
        BrowerhisTrial br = new BrowerhisTrial("Google");
        try {

            br.visit("Linkedin");
            br.visit("Youtube");
            br.visit("Facebook");
            System.out.println(br.arr);
            br.back(2);
            br.forward(2);
            br.back(5);
            br.forward(5);
        } catch (ArrayIndexOutOfBoundsException e) {
            if (br.pointer == -1)
                System.out.println(br.arr.get(0));
            System.out.println(br.arr.get(br.arr.size() - 1));
        }
    }
}

