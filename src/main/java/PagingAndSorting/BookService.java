package PagingAndSorting;

import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository repo;

    public List<Book> getBooksByPageAndSort(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return repo.findAll(pageable).getContent();
    }

    public Book saveBook(Book book) {
        return repo.save(book);
    }
}
