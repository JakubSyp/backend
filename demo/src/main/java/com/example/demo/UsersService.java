package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UsersService {

    public UsersPage getUsers(int pageNumber, int pageSize)
    {
        pageNumber = Math.max(1, pageNumber);
        pageSize = Math.min(100, pageSize);
        pageSize = Math.max(1, pageSize);

        int pageCount = 0;
        int totalCount = 0;

        return new UsersPage(pageNumber,pageCount,totalCount,pageSize);

    }

}
