public class Main {


    public static void main(String[] args) {


        Book book1 = new Book("Snow","Ivanov",2020);
        System.out.println("book1.name = " + book1.getName());
        System.out.println("book1.author = " + book1.getAuthor());
        System.out.println("book1.year = " + book1.getYear());
        book1.setYear(2022);
        System.out.println("book1.getYear() = " + book1.getYear());

        Author author1 = new Author("Oleg", "Ivanov");
        System.out.println("author1.authorName = " + author1.getAuthorName());
        System.out.println("author1.authorSurname = " + author1.getAuthorSurname());


    }
}