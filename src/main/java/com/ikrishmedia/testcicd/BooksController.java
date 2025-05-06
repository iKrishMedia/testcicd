package com.ikrishmedia.testcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BooksController {

    @GetMapping("books")
    public String getBooks() {
        return "Connected Successfully!";
    }
}
