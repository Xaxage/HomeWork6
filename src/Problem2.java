import java.util.Scanner;
public class Problem2
    {
        public static void main(String[] args)
            {
                String word=" i'm good sjit a  snitch -1  ";
                int Counter=0;
                for(int i=0;i<word.length();i++)
                    {
                        if(word.charAt(i)!=' ')
                            {
                                if(word.charAt(i+1)!=' ')
                                    Counter++;
                                while(word.charAt(i)!=' ')
                                    i++;
                            }
                    }
                System.out.println(Counter);

            }
    }
