import java.util.Scanner;

public class Problem3
    {
        public static void main(String[] args)
            {
                Scanner best = new Scanner(System.in);
                System.out.println("Enter your word");
                String a=best.nextLine();
                boolean check =true;
                char[] chararray= new char[a.length()];
                for(int i=0;i<a.length();i++)
                    {
                        chararray[i]=a.charAt(i);
                    }
                for(int i=0;i<a.length()/2;i++)
                    {
                        if(chararray[i]==chararray[chararray.length-1-i])
                            {
                                check=true;
                            }
                        else if(chararray[i]!=chararray[chararray.length-1-i])
                            {
                                check=false;
                                break;
                            }
                    }
                if(check)
                    {
                        System.out.println("Palindrome");
                    }
                else
                    {
                        System.out.println("Not Palindrome");
                    }
            }
    }
