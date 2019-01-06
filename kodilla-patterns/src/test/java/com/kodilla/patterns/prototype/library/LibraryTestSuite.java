package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Task;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        Library library = new Library("Fantasy");
        Book book1 = new Book("Book1", "Author1", LocalDate.of(2000, 1, 4));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(2001, 2, 5));
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Fantasy 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Fantasy 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().remove(book1);

        //then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(1,library.getBooks().size());
        Assert.assertEquals(1,clonedLibrary.getBooks().size());
        Assert.assertEquals(2,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(),library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(),library.getBooks());
    }
}
