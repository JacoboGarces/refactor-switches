import models.Book;
import models.Novel;
import usecases.book.CreateBookUseCase;
import usecases.book.GetAllBookUseCase;
import usecases.interfaces.IUseCase;
import usecases.novel.CreateNovelUseCase;

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
        Book book = new Book();
        Novel novel = new Novel();
        Novel resultNovel = novelUseCases.get(2).execute(novel);
        Book result = bookUseCases.get(1).execute(book);
        List<Book> reasult = useCases.get(3).execute();
    }
}