import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args)
    {
        Scanner pro= new Scanner(System.in);
        String a=pro.nextLine();
        int check=pro.nextInt();
        char[] chararray=new char[a.length()];
        for(int i=0;i<a.length();i++)
            {
                chararray[i]=a.charAt(i);//String@ chareri arrayi
            }
        if(0<=check && check<a.length())
            {
                System.out.println(chararray[check]);
            }
        else
            {
                System.out.println("Out of Borders");
            }
    }
}
