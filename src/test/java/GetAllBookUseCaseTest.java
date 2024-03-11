import models.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import usecases.book.GetAllBookUseCase;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GetAllBookUseCaseTest {

    @Test
    void execute() {
        GetAllBookUseCase useCase = new GetAllBookUseCase();
        final List<Book> books = useCase.execute();

        Assertions.assertFalse(books.isEmpty());
    }
}