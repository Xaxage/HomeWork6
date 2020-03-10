import java.util.Scanner;

public class Problem4
    {
        public static void main(String[] args)
            {
                String word="Table";
                String word2="";
                String word3="";
                int rot=2;
                for (int i=0;i<rot;i++)
                    {
                        word2+=word.charAt(i);
                    }
                for (int i=rot;i<word.length();i++)
                    {
                        word3+=word.charAt(i);
                    }
                word3+=word2;
                System.out.println(word3);
            }
    }
