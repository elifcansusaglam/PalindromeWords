import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        String newStr=str.replace(" ","");
        newStr=newStr.toLowerCase();
        System.out.println(newStr);
        int i = 0, j = newStr.length() - 1;
        while (i < j) {
            if (newStr.charAt(i) != newStr.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a word : ");
        String str=scan.nextLine();
        if(isPalindrome(str)){
            System.out.println(str+" is palindrome !");
        }else{
            System.out.println(str+" is not palindrome !");
        }

    }

}