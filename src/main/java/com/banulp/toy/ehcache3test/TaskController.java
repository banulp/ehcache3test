package com.banulp.toy.ehcache3test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private SimpleBookRepository simpleBookRepository;

    @RequestMapping("getBook")
    public Book getByIsbn(@RequestParam String isbn) {
        Book byIsbn = simpleBookRepository.getByIsbn(isbn);
        return byIsbn;
    }

    @RequestMapping("evictAll")
    public String evictAll() {
        String s = simpleBookRepository.evictAll();
        return s;
    }

    @RequestMapping("message")
    public String message() {
        return "Hello world. ehcache3test message.";
    }
}
