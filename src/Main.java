import refactor.org.models.Book;
import refactor.org.models.Novel;
import refactor.org.usecases.book.GetAllBookUseCase;
import refactor.org.usecases.interfaces.IUseCase;
import refactor.org.usecases.book.CreateBookUseCase;
import refactor.org.usecases.novel.CreateNovelUseCase;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, IUseCase<Book>> bookUseCases = new HashMap<>();
        HashMap<Integer, IUseCase<Novel>> novelUseCases = new HashMap<>();
        HashMap<Integer, IUseCase<List<Book>>> useCases = new HashMap<>();
        useCases.put(1, new GetAllBookUseCase());
        bookUseCases.put(1, new CreateBookUseCase());
        novelUseCases.put(2, new CreateNovelUseCase());

        // Solicitan la opcion que el usuario quiera ejecutar
        Book book = new Book();
        Novel novel = new Novel();

        Novel resultNovel = novelUseCases.get(2).execute(novel);
        Book result = bookUseCases.get(1).execute(book);
        List<Book> reasult = useCases.get(3).execute();
    }
}