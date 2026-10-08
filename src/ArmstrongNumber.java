public class ArmstrongNumber {
    public static void main() {
        int num=153;
        int digit=3;
        int x= checkArmstrong(num);
        if(x==1){
            System.out.println("It is not armstarong:"+x);
        } else {
            System.out.println("Its is Armstrong:"+x);
        }
    }

    private static int checkArmstrong(int num) {
        char[] c= String.valueOf(num).toCharArray();
        int [] p = new int[c.length];
        int x1=0;
        for(int i=0;i<c.length;i++){
            p[i]=c[i]-'0';
        }
        for(int j=0;j<p.length;j++){
            x1=x1+Math.powExact(p[j],3);
        }
        if(x1==num){
            return num;
        }
        return x1;
    }
}
