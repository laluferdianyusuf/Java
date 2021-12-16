package bljr.java;

public class StringAbcderian {
    public static void main(String[] args) {
   
        String input = "aku";
        System.out.println("Masukan Kata : " + input);
   
        for (int i = 0; i < input.length()-1; i++) {   
            if (input.charAt(i) <= input.charAt(i + 1))
            {
                System.out.println("Termasuk Abecedarian ");
                break;
                } else
                {
                    System.out.println("Bukan Termasuk Abecedarian ");
                    break;
                    }
                }
            }
        }  