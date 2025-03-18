import  java.util.Scanner;
public class Main{
    public static void main (String[] args){
        System.out.println("MAke sure that the password contains at least 8 letter, one special character, and one capital letter");
        Scanner input = new Scanner (System.in);
        for(int t=2; t>=0; t--){
           System.out.println("Please Enter a strong  password ACCORDING TO THE INSTRUCTIONS ABOVE!!!:"+" ");
            String password =input.nextLine();
            int upperCase=0;
            int lowerCase=0;
            int specialCase=0;
            String special="*&%$#@_-";
            for(int i=0; i<password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                upperCase++;
            }
            if (Character.isLowerCase(password.charAt(i))){
                lowerCase++;
            }
            if (special.contains(String.valueOf(password.charAt(i)))){
                specialCase++;
            }
            
        }
        if(password.length()>=8 && upperCase>0 && lowerCase>0 && specialCase>0){
            System.out.println("Nice password.");
            break;
        }
            else if (t>0){
                System.out.println("You still have "+t+" attempts left");
            }
            else{
                System.out.println("Try again later.");
            }
        }
    }
}