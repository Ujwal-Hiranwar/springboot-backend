package com.example.database.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.Entity.RequestData;
import com.example.database.Repository.UserDao;

@RestController

public class AppController {
    @Autowired
private UserDao userdao;
@CrossOrigin(origins = "https://foryouclipboardapp.vercel.app")
    @PostMapping("/submit")
    public String sendDatatoDatabase(@RequestParam String otp,@RequestParam String text){
        System.out.println("data is " + otp);
        System.out.println(text );
       
   
       int result = userdao.insertMessage(otp, text);
       if (result > 0) {
        
           return "Message inserted successfully!";
       } else {
           return "Failed to insert message.";
       }
    }
    @CrossOrigin(origins = "https://foryouclipboardapp.vercel.app")
    @GetMapping("/recive/{id}")
public String SendDataToFrontend(@PathVariable("id") String id){
    return "this is from backend";
}
}


