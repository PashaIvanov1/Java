package com.gmail.aba.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/admin")
public class AdminController {


    @GetMapping()
    public String getAdmin() {
        return "success";
    }

    @GetMapping("/rules")
    public String adminRools(){
        return "admin_rools";
    }

    @GetMapping("/contact")
    @PreAuthorize("hasRole('ROLE_ADMIN')") // !!!
    public String adminContact(){
        return "admin_contact";
    }


    @GetMapping("/database")
    @PreAuthorize("hasRole('ROLE_ADMIN')") // !!!
    public String admin() {
        return "database";
    }

    @GetMapping("/one")
    public String returnOneAdmin() {
        return "admin_training-program-one";
    }
    @GetMapping("/two")
    public String returnTwoAdmin() {
        return "admin_training-program-two";
    }
    @GetMapping("/three")
    public String returnThreeAdmin() {
        return "admin_training-program-three";
    }
}
