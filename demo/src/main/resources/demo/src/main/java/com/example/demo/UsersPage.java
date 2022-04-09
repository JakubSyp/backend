package com.example.demo;

public class UsersPage {

    public UsersPage(int pageNumber, int pageSize, int totalCount, int pageCount) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.pageCount = pageCount;
    }

    int pageNumber;
    int pageSize;
    int totalCount;
    int pageCount;

}
