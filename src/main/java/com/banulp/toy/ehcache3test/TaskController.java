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

    @Autowired
    private SimpleDataService simpleDataService;

    @RequestMapping("getBook")
    public Book getByIsbn(@RequestParam String isbn) {
        Book byIsbn = simpleBookRepository.getByIsbn(isbn);
        return byIsbn;
    }

    @RequestMapping("evictAllBook")
    public String evictAllBook() {
        String s = simpleBookRepository.evictAll();
        return s;
    }

    @RequestMapping("getSong")
    public Song getSong(@RequestParam String isbn) {
        Song byIsbn = simpleDataService.getSong(isbn);
        return byIsbn;
    }

    @RequestMapping("evictAllSong")
    public String evictAllSong() {
        String s = simpleDataService.evictSongs();
        return s;
    }

    @RequestMapping("getFlower")
    public Flower getFlower(@RequestParam String isbn) {
        Flower byIsbn = simpleDataService.getFlower(isbn);
        return byIsbn;
    }

    @RequestMapping("evictAllFlower")
    public String evictAllFlower() {
        String s = simpleDataService.evictFlowers();
        return s;
    }

    @RequestMapping("message")
    public String message() {
        return "Hello world. ehcache3test message.";
    }
}
