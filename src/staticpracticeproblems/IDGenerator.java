package staticpracticeproblems;

public class IDGenerator {
    static int nextID=0;

    public static int generateID(){
        return nextID++;
    }

    static void main() {
        System.out.println("GneratediD:"+IDGenerator.generateID());
        System.out.println("GneratediD:"+IDGenerator.generateID());
        System.out.println("GneratediD:"+IDGenerator.generateID());
    }
}
