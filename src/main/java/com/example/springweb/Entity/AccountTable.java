package com.example.springweb.Entity;

import lombok.Data;

@Data
public class AccountTable {
    private int id;
    private String user;
    private String password;
    private String manage;
}