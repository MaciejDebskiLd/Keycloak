package com.example.keycloak1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialController {

    @GetMapping(path = "/")
    public String welcome(){
        String link = "<a href='http://localhost:8081/users'>Kliknij, żeby się zalogować</a>";

        return "Witaj na stronie logowania systemu PROGRAMATOR " + "<br>" + link;
    }


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String login() {
        String link = "<a href='http://localhost:8081/logout'>Kliknij, żeby się wylogować</a>";

        return "Witaj wewnątrz systemu PROGRAMATOR "+ "<br>" + link;
    }






}
