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
        return "Имя ученика - Евгений Шамарин\n" +
                "Название Вашего проекта - Книга рецептов\n" +
                "Дата создания - 03.02.2023\n" +
                "Описание проекта - Книга рецптов содержит рецепты";
    }
}
