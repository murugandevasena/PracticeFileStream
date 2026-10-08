import java.util.ArrayList;

public class MainTest {
    static void main() {
        Person p = new Person("Murugan",41);
        Person p1 = new Person("Ramalingam",69);

        System.out.println(p.getName()+"-"+p.getAge());
        System.out.println(p1.getName()+"-"+p1.getAge());

        //Modify
        p.setName("Muruganalli");
        p.setAge(50);
        System.out.println(p);

        //Circle
        int r= 10;
        Circle c = new Circle(r);
        System.out.println("Circle area:"+c.getRadius()+"=="+c.getArea()+"=="+c.getCircumference());

        //Book
        Book book = new Book("Maths","Mr.T.Dhananchzhiyan","ISBN0001111");
        Book book1 = new Book("Enginnering Graphics","Dr.P.Pugazhendiran","ISBN00002");

        //Add Book to the book Collections

        Book.addBook(book);
        Book.addBook(book1);

        ArrayList<Book> BookCollection=Book.getBookCollection();

        for(Book b:BookCollection){
            System.out.println("Book:"+b.getAuthor()+"  "+"Book author:"+b.getAuthor()+" "+"Book ISBN:"+b.getiSBN());
        }

        //Remove book

        Book.removeBook(book1);
        for(Book b:BookCollection){
            System.out.println("After removeing Book:"+b.getAuthor()+"  "+"Book author:"+b.getAuthor()+" "+"Book ISBN:"+b.getiSBN());
        }

    }
}
