package checkPalindrome;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    static Stack<String> strStack= new Stack<>();
    static ArrayDeque<String> strQueue= new ArrayDeque<>();
    public static void checkPalindrome(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter String ");
        String str= scanner.nextLine();
        String [] strArr= str.split("");

        for (int i = 0; i < strArr.length; i++) {
            strStack.push(strArr[i]);
            strQueue.add(strArr[i]);
        }
        System.out.println(strStack);
        System.out.println(strQueue);
        boolean flag= checkMatchPalindrome(strArr);
        if (flag) {
           System.out.println("Đây là chuỗi Palidrome ");
       }else System.err.println("Đây ko phải là chuỗi Palidrome ");

    }
    private static boolean checkMatchPalindrome(String[] strArr){
        boolean flag= true;
        for (int i = 0; i < strArr.length; i++) {
            String stackCharacter= strStack.pop();
            String queueCharacter= strQueue.poll();
//            System.out.println(stackCharacter);
//            System.out.println(queueCharacter);
            boolean equalsCheck= stackCharacter.equalsIgnoreCase(queueCharacter);
            if (!equalsCheck) {
                flag=false;
                break;
            }
        }
        return flag;
    }
}
