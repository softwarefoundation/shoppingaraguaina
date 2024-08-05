package br.com.shoppingaraguaina.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/app-info")
public class AppInfoController {

    @GetMapping
    public String getInfo() {
        return "Shopping Araguaína";
    }

}
