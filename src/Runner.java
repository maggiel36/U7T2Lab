import java.util.ArrayList;
public class Runner
{
    public static void main(String[] args)
    {
        ArrayList<String> letters = new ArrayList<String>();

        letters.add("A");
        letters.add("B");
        letters.add("C");
        System.out.println(letters);
        System.out.println(letters.size());
        letters.add(0, "D");
        System.out.println(letters);
        System.out.println(letters.size());
        letters.add(3, "E");
        System.out.println(letters);
        System.out.println(letters.size());
        letters.add(1, "F");
        letters.add(1, "G");
        letters.add(1, "H");
        System.out.println(letters);
        System.out.println(letters.size());
        System.out.println("-------------");
        letters.remove(2);
        System.out.println(letters);
        System.out.println(letters.size());
        letters.remove(3);
        System.out.println(letters);
        System.out.println(letters.size());
        letters.remove(0);
        letters.remove(1);
        System.out.println(letters);
        System.out.println(letters.size());
        System.out.println("-------------");
    }
}
