package me.shamarinen.recipes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String startApp() {
        return "Приложение запущено";
    }
    @GetMapping("/info")
    public String page() {
        return "Page 1";
    }
}
