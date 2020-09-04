package com.banulp.toy.ehcache3test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SimpleBookRepository implements BookRepository {

	@Override
	@Cacheable("books")
	public Book getByIsbn(String isbn) {
		log.info("getByIsbn is invoked!!!");
		return new Book(isbn, "Some book");
	}

}
