public class SumOfDigit {
  public static void main() {
        int x=123458;
        char[] x1= String.valueOf(x).toCharArray();
        int [] p = new int[x1.length];
        int h=0;
        for(int c=0;c<x1.length;c++){
            p[c]=x1[c]-'0';
            h+=p[c];
        }
        System.out.println("Sum of digits:"+h);
    }
}
