package com.epam.izh.rd.online.service;

import com.epam.izh.rd.online.entity.Author;

public class SimpleAuthorService implements AuthorService {
    @Override
    public boolean save(Author author) {
        return false;
    }

    @Override
    public Author findByFullName(String name, String lastname) {
        return null;
    }

    @Override
    public boolean remove(Author author) {
        return false;
    }

    @Override
    public int count() {
        return 0;
    }
}
