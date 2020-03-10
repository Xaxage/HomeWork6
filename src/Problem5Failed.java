import java.util.Scanner;
public class Problem5Failed
    {
        public static void main(String[] args)
            {
                Scanner ish=new Scanner (System.in);
                System.out.println("Enter your first word");
                String a=ish.nextLine();
                System.out.println("Enter your second word");
                String b=ish.nextLine();
                boolean check=true;
                char[] chararraya= new char[a.length()];
                for(int i=0;i<a.length();i++)
                    {
                        chararraya[i]=a.charAt(i);
                    }
                char[] chararrayb= new char[a.length()];
                for(int i=0;i<a.length();i++)
                    {
                        chararrayb[i]=a.charAt(i);
                    }
                if(chararraya.length==chararrayb.length)
                    {
                        for(int i=0;i<chararraya.length;i++)
                            {
                                if(chararraya[i]==chararrayb[chararrayb.length-1-i])
                                    {
                                        check=true;
                                    }
                                else if(chararraya[i]!=chararrayb[chararrayb.length-1-i])
                                    {
                                        check=false;
                                        break;
                                    }
                            }

                    }
                else
                     {
                      check=false;
                     }
                /*//palindromi stugel@
                for(int i=0;i<=a.length()/2;i++)
                    {
                        if(chararray[i]==chararray[a.length()-1-i])
                            {
                                check=true;
                            }
                        else if(chararray[i]!=chararray[a.length()-1-i])
                            {
                                check=false;
                                break;
                            }
                    }*/
                if(check)
                    {
                        System.out.println("It is a rotation");
                    }
                else if (!check)
                    {
                        System.out.println("It is not a rotation");
                    }
            }
    }
