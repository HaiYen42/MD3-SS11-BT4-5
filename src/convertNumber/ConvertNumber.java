package convertNumber;

import java.util.Scanner;
import java.util.Stack;

public class ConvertNumber {
    public static void ConvertNumber(){
        Stack<Integer> stack= new Stack<>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number ");
        int number= scanner.nextInt();
        int number2= number;
        do{
            int mod= number%2;
            stack.push(mod);
            number =number/2;
        }while (number!=0);
//        System.out.println(stack);
        String str="";
        int stackSize= stack.size();
        int temNum;
        for (int i = 0; i < stackSize; i++) {
            temNum= stack.pop();
            str+=temNum;
        }
        System.out.println("Binary number of "+ number2 +" is "+ str);
    }
}
