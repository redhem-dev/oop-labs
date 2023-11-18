import Week6.LibraryInformationSystem.StringUtils;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;
import java.util.Arrays;

public record Book(String title, String author, int publicationYear, boolean available){}
class LibraryCatalog extends StringUtils {
    List<Book> books;


    public LibraryCatalog(List<Book> books) {
        this.books = books;
    }

    public Optional<Book> checkAvailability(String searchedBook){
        return books.stream()
                .filter(book -> book.title().equals(searchedBook) && book.available())
                .findFirst();
    }

    public Optional<Book> getFirstAvailableBookByAuthor(String searchedAuthor){
        return books.stream()
                .filter(book -> book.author().equals(searchedAuthor) && book.available())
                .findFirst();
    }
    public void updateAvailability(String searchedTitle,boolean newStatus){
        books.stream()
                .filter(book -> book.title().equals(searchedTitle))
                .findFirst()
                .ifPresent(book -> books.set(books.indexOf(book), new Book(book.title(), book.author(), book.publicationYear(), newStatus)));



    }
}

class Start {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, true),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, false),
                new Book("1984", "George Orwell", 1949, true)
        );

        LibraryCatalog libraryCatalog = new LibraryCatalog(bookList);

        Optional<Book> availableBook = libraryCatalog.checkAvailability("1984");
        System.out.println("Is '1984' available? " + availableBook.isPresent());

        Optional<Book> firstAvailableByAuthor = libraryCatalog.getFirstAvailableBookByAuthor("J.D. Salinger");
        System.out.println("First available book by J.D. Salinger: " + firstAvailableByAuthor.orElse(null));

        libraryCatalog.updateAvailability("To Kill a Mockingbird", true);
        System.out.println("Updated availability of 'To Kill a Mockingbird'");

        System.out.println("Updated Book List:");
        libraryCatalog.books.forEach(book -> System.out.println(book.title() + " - Available: " + book.available()));
    }
}
