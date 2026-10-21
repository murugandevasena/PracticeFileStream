package staticpracticeproblems;

public class Initializer {

    static int initailvalue;

    static{
        initailvalue=1000;
        System.out.println("Static block: initialValue initialized to :"+initailvalue);
    }
    static void main() {
        Initializer initializer=new Initializer();
        System.out.println("After Initializer: "+initailvalue);
    }
}
