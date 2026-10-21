package Constructor;

public class ReverseNumber {
    static void main() {
        int number=12345;
        int reversed=0;
                while(number!=0){
                    int digit=number%10;
                    System.out.println(digit);
                    reversed =reversed*10+digit;
                    number=number/10;
                }
        System.out.println("Reverved number:"+reversed);
    }
}
