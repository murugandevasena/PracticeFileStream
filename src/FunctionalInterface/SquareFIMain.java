package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SquareFIMain {
    static void main() {
        SquareFI c=(int x)->x*x;
        int y= c.calculate(4);
        System.out.println("Y: "+y);

        //Consumer Functional interface, it have accept(T,t) method.
        List<Integer> ls= Arrays.asList(1,2,3,45,6);
        Consumer<Integer> c1= y1-> System.out.println(y1*y1);
       // System.out.println(c1.accept(6));
        ls.forEach(c1);

        //Predicate
        Predicate<String> p= str->str.length()<5;
        System.out.println(p.test("murugan"));

        //Supplier
        Supplier<Double> s = ()->Math.random();
        System.out.println("Functional Interface of supplier: "+s.get());

        //Functional
        Function<Integer,Integer> f = (a)-> a*1001;
        System.out.println(f.apply(3));
    }
}
