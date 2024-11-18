package set;

import java.util.LinkedHashSet;
import java.util.Objects;

class Book
{
    int id;
    String name;
    float price;

    Book(int id,String name,float price)
    {
        this.id = id;
        this.name =name;
        this.price = price;
    }
    public String toString()
    {
     return "Id is: "+id+" name of book is: "+name+" and price is: "+price;
    }
    public boolean equals(Object o)
    {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }
    public int hashCode() {
    return Objects.hash(id);
}

}
public class LinkedHashSetPrograms {
    public static void main(String[] args) {

        LinkedHashSet<Book> lh = new LinkedHashSet<>();

        Book b1 = new Book(101,"Math",122.00f);
        Book b2 = new Book(103,"Marathi",130.00f);
        Book b3 = new Book(103,"History",150.00f);

        lh.add(b1);
        lh.add(b2);
        lh.add(b3);

        for(Book b : lh)
        {
            System.out.println(b);
        }

    }
}
