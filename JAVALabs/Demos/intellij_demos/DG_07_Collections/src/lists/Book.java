package lists;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        super();
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Book o) {

        Book that = (Book) o;

        if (this.price < that.getPrice()){
            return -1;
        } else if (this.price > that.getPrice()){
            return 1;
        } else {//if this equals that
            return 0;
        }

    }
}
