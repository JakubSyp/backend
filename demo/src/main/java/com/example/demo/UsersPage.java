package com.example.demo;

public class UsersPage {

    public UsersPage(int pageNumber, int pageCount, int pageSize, int totalCount) {
        this.pageNumber = pageNumber;
        this.pageCount = pageCount;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
    }

    private int pageNumber;
    private int pageCount;
    private int pageSize;

    public int getPageNumber() {
        return pageNumber;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    private int totalCount;

}
