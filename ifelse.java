public class ifelse
{
    public static void main(String args[])
    {
        int x = 7;
        int y = 876;
        int z = 6789;

        if(x>y && x>z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);
    }
}