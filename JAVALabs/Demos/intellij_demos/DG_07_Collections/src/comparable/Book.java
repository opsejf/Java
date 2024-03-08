package comparable;

    /**
     * Class to allow basic book details to be stored, retrieved and compared to one another.
     * The toString method has been generated to allow for simple display during testing.
     * @author A.N.Other
     */
    public class Book implements Comparable<Book> {
        // Comparable

        /**
         * Instance fields to hold the state of a book
         */
        private String title;
        private String author;
        private double price;

        /**
         * Only method of construction - all 3 parameters are required
         * @param title  - the book's title
         * @param author - writer's name
         * @param price  - recommended selling price
         */
        public Book(String title, String author, double price) {
            super();
            this.title = title;
            this.author = author;
            this.price = price;
        }

        /**
         * Method for retrieving the book's title - takes no parameters.
         * @return String containing the title
         */
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

        // Demo 7.17 - compareTo Method override
        @Override
        public int compareTo(Book o) {

            Book that = o;

            if (this.price < that.getPrice()) {
                return -1;
            }
            else if(this.price > that.getPrice()) {
                return 1;
            }
            else // if this = that
            {
                return 0;
            }
        }

    }
