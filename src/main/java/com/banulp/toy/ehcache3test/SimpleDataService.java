package com.banulp.toy.ehcache3test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SimpleDataService {

    @Cacheable(value = "songs", key = "#isbn")
    public Song getSong(String isbn) {
        log.info("getSong is invoked!!! - {}", isbn);
        return new Song(isbn, "Some Song");
    }

    @CacheEvict(value = "songs", allEntries = true)
    public String evictSongs() {
        return "evictSongs success";
    }


    @Cacheable(value = "flowers", key = "#isbn")
    public Flower getFlower(String isbn) {
        log.info("getFlower is invoked!!! - {}", isbn);
        return new Flower(isbn, "Some Flower");
    }

    @CacheEvict(value = "flowers", allEntries = true)
    public String evictFlowers() {
        return "evictFlowers success";
    }

}
