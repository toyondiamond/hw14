public class Book {

    private String name;
    private String author;
    int year;

    Book(String name, String author, int year){
        this.name =name;
        this.author=author;
        this.year=year;
    }
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
