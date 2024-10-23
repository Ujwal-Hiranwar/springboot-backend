package com.example.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.database.Repository.UserDao;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner{
@Autowired
private UserDao userdao;
	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}
@Override
public void run(String... args){
	System.out.println(userdao.getAllUsers());
}
}
