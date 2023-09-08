package bestseller;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Author tolstoy = new Author("Толстой", "Лев", 1885);
        Bestseller book = new Bestseller("Война и мир", 1985, tolstoy);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("book.out"));
        objectOutputStream.writeObject(book);
        objectOutputStream.close();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("book.out"));
        Bestseller book1 = (Bestseller)inputStream.readObject();
        System.out.println(book1);

    }
}


class Book implements Serializable {
    String title;
    int publicationYear;
    Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }
}

class Bestseller extends Book {
    int rating;

    public Bestseller(String title, int publicationYear, Author author) {
        super(title, publicationYear, author);
    }
}

class Author implements Serializable{//здесь косяк
    String surname;
    String name;
    int yearOfBirth;

    public Author(String surname, String name, int yearOfBirth) {
        this.surname = surname;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
}