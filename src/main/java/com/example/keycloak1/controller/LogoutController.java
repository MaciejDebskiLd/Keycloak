package com.example.keycloak1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@RestController
public class LogoutController {

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout (HttpServletRequest request) throws ServletException {
        request.logout();
        String link = "<a href='http://localhost:8081/users'>Kliknij, żeby ponownie się zalogować</a>";

        return "Zostałeś prawidłowo wylogowany" + "<br>" + link;



    }


}
