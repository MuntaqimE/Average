import java.util.Scanner;
public class Average{
    public static void main(String[] args){
        Scanner keyboardNumber = new Scanner(System.in);
        keyboardNumber.useDelimiter(",");
        System. out.println("Enter 10 numbers separated by a comma");
        int n1 = keyboardNumber.nextByte();
        int n2 = keyboardNumber.nextByte();
        int n3 = keyboardNumber.nextByte();
        int n4 = keyboardNumber.nextByte();
        int n5 = keyboardNumber.nextByte();
        int n6 = keyboardNumber.nextByte();
        int n7 = keyboardNumber.nextByte();
        int n8 = keyboardNumber.nextByte();
        int n9 = keyboardNumber.nextByte();
        int n10 = keyboardNumber.nextByte();
        int sum = (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10);
        System.out.println("You entered:  " + sum);
        int average = sum/10;
        System.out.println("Your average is " + average);
    }
}