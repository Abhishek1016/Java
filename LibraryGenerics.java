class Library <T>
{
    public void print(){
        if (type=="Book")
            System.out.println("This book's name "+name);
        else if (type.equals('v'))
            System.out.println("This video's name is "+name);
        else
            System.out.println("This papers name "+name);
    }
    T type;
    String name;
    public void Library(T type, String name)
    {
        this.name=name;
        this.type=type;

    }
}
public class LibraryGenerics {
    public static void main(String[] args) {
        Library<String> Ele1=new Library<>();
        Ele1.Library("Book", "Mind Your Own Business");
        Ele1.print();
        Library<Character> Ele2=new Library<>();
        Ele2.Library('v', "Movie1");
        Ele2.print();
        Library<Character> Ele3=new Library<>();
        Ele3.Library('P',"India today");
        Ele3.print();
    }
}