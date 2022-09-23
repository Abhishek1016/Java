public class Nameme
{
    String firstname;
    String lastname;
    private final String name1;

    public Nameme(String firstname ,String lastname)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.name1=this.firstname+this.lastname;
    }

    public static void main(String[] args) {
        Nameme name=new Nameme("John","Doe");
        System.out.println( name.firstname);
        System.out.println(name.lastname);
        //System.out.println(name.firstname +" "+ name.lastname);
        System.out.println(name.name1);
    }
}
