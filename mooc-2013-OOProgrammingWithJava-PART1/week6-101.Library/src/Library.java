
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;

    public Library() {
        this.book = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.book.add(newBook);
    }

    public void printBooks() {
        for (Book boek : book) {
            System.out.println(boek);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book boek : book) {
            if (StringUtils.included(boek.title(), title)) {
                found.add(boek);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book boek : book) {
            if (StringUtils.included(boek.publisher(), publisher)) {
                found.add(boek);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (int i = 0; i < this.book.size(); i++) {
            if (this.book.get(i).year() == year) {
                found.add(this.book.get(i));
            }
        }
        return found;
    }
}
