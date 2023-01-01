public class Book {
    Book(String imya,String avtor,int god){
        name =imya;
        author=avtor;
        year=god;
    }

    String name;
    String author;
    int year;

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
class Author {

    Author(String imyaAvtora, String familiaAvtora){
        authorName =imyaAvtora;
        authorSurname=familiaAvtora;
    }
    String authorName;
    String authorSurname;

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }
}