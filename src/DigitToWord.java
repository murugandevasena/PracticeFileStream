public class DigitToWord {
    static void main() {

        int num = 10;
        String s="";
        switch (num){
            case 0:
                s ="ZERO";
                break;
            case 1:
                s="ONE";
                break;
            case 2:
                s="TWO";
                break;
            default:
                s="No one is word";
        }
        System.out.println(s);
    }
}
