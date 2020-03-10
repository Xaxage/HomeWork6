public class Problem5
    {
        public static void main(String[] args)
            {
                String mainword = "bleTa";
                String wordcheck = "Table";
                String word2 = "";
                String word3 = "";
                boolean tr = false;
                for (int rot = 0; rot < wordcheck.length(); rot++)
                    {
                        for (int i = 0; i < rot; i++)
                            {
                                word2 += wordcheck.charAt(i);
                            }
                        for (int i = rot; i < wordcheck.length(); i++)
                            {
                                word3 += wordcheck.charAt(i);
                            }
                        word3 += word2;
                        if (word3.equals(mainword))
                            {
                                System.out.println("Valid");
                                tr = true;
                                break;
                            }
                        word2 = "";
                        word3 = "";

                    }
                if (!tr)
                    System.out.println("Invalid");
            }
    }
