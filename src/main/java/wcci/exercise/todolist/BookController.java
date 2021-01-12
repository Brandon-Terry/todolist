package wcci.exercise.todolist;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller


public class BookController {
    @Resource
    private BookRepository bookRepo;
    @RequestMapping("/books")
    public String getAllBooks(Model model) {
        model.addAttribute("allbooksModel", bookRepo.getAllBooks());
        return "all-books-template";
    }
    @RequestMapping("/books/{id}")
    public String getOneBook(@PathVariable Long id, Model model) {
        model.addAttribute("singleBookModel", bookRepo.getOneBook(id));
        return "one-book-template";
    }
}

