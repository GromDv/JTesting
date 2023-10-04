package book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {
    Book b1, b1real;

    @BeforeEach
    void setUp() {
        b1 = mock(Book.class);
        when(b1.getTitle()).thenReturn("Book1");
        when(b1.getAuthor()).thenReturn("Author1");

        b1real = new Book("1", "Book1", "Author1");
    }

    @ParameterizedTest
    @ValueSource(strings = {"1"})
    void bookServiceFindBookByIdTest(String id) {
        InMemoryBookRepository mockRep = mock(InMemoryBookRepository.class);
        when(mockRep.findById(id)).thenReturn(b1);

        BookService testService = new BookService(mockRep);

        assertTrue(testService.findBookById(id).getTitle().equals("Book1"));
        assertTrue(testService.findBookById(id).getAuthor().equals("Author1"));
    }
    @ParameterizedTest
    @ValueSource(strings = {"1"})
    void bookRepositoryTest(String id) {
        InMemoryBookRepository mockRep = mock(InMemoryBookRepository.class);
        when(mockRep.findById(id)).thenReturn(b1);

        BookService testService = new BookService(mockRep);

        verify(testService.findBookById(id)).equals(b1real);
    }
}