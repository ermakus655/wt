package lab1.t12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", edition=" + edition +
                '}';
    }
    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Book)) {
            return false;
        }
        if (obj.hashCode() != hashCode()) {
            return false;
        }

        Book book = (Book) obj;
        return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }

    @Override
    public int hashCode() {

        return 11 * title.hashCode() + 31 * author.hashCode() + Integer.valueOf(price).hashCode() * 113 + 20456;
    }


}
