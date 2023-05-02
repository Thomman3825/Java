import java.util.Scanner;

public class Practice {
     public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int rev = reverseNumber(number);
        System.out.println(rev);
        //System.out.println(4%10);
        // if (number ==rev){
        //     System.out.println("Palindrome");
        // }
        // else {
        //     System.out.println("Not Palindrome");
        // }
        String result= (number == rev) ? ("Palindrome"):(" Not Palindrome");
        System.out.println(result);
    }

    public static int reverseNumber(int number){
        int rev = 0;
       while(number>0){
            int res = number %10;
            rev =rev*10 +res;
            number = number/10;
           
        }
        return rev;

    }

    public static void isVampireNumber(int number)
    {
        int count=0,i= 0;
        int[] digitArray =new int[4];
        while (number >0){
            int res = number %10;
            digitArray[i]=res;
            count ++;
            number = number /10;
            i++;
        }
        for (int j= 0;j<4;j++){
            System.out.println(digitArray[i]);
        }

    }
}
