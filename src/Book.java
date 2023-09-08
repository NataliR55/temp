public class Book implements Comparable<Book> {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{"+ title +", p:"+numberOfPages+",Y:"+publicationYear +'}';
    }

    @Override
    public int compareTo(Book book) {
        if ((book.numberOfPages == numberOfPages)
                && (book.publicationYear == publicationYear)) {
            return 0;
        }
        if (book.numberOfPages > numberOfPages) {
            return 1;
        } else if (book.publicationYear > publicationYear) {
            return 1;
        }
        else return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages && publicationYear == book.publicationYear;
    }
}