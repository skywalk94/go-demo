package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Book;

public interface BookService extends IService<Book> {
    boolean saveBook(Book book);

    IPage<Book> getPage(int currenPage, int pageSize);
}
