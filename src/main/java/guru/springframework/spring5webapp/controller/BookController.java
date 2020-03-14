package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @RequestMapping(path = "/books", method = RequestMethod.GET)
    @ResponseBody
    public Book getBooks() {
        return new Book("ble", "ble");
    }

}
