package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private BookService bookService;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("测试name");
        book.setType("测试type");
        book.setDescription("测试description");
        bookService.save(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(202);
        book.setName("name");
        book.setType("type");
        book.setDescription("description");
        bookService.updateById(book);
    }

    @Test
    void testDelete() {
        bookService.removeById(202);
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.list());
    }

    @Test
    void testGetPage() {
        IPage<Book> page = new Page<Book>(1, 10);
        bookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }
}
