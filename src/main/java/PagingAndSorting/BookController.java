package PagingAndSorting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    @Autowired
    private  BookService service;

    @PostMapping
    public Book save(@RequestBody Book book) {
        return service.saveBook(book);
    }

    @GetMapping("/{page}/{size}/{sortBy}")
    public List<Book> getBooks(@PathVariable int page, @PathVariable int size, @PathVariable String sortBy) {
        return service.getBooksByPageAndSort(page, size, sortBy);
    }
}
