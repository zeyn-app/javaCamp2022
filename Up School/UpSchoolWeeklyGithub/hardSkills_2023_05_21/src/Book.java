public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private String publishedYear;
    private int borrowedDate;
    public Book(int id, String name, String author, String publisher, String publishedYear) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
        borrowedDate = generateBorrowedDate();
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public int getBorrowedDate(){
        return borrowedDate;
    }

    private int generateBorrowedDate() {
        int random = (int) (Math.random() * 50) + 1;
        return random;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishedYear='" + publishedYear + '\'' +
                ", borrowedDate = " + borrowedDate + '\'' +
                '}';
    }
}
