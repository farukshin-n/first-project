package ru.yandex.practicum.catsgram.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class SimpleController {
    private static final Logger log = LoggerFactory.getLogger(SimpleController.class);

    @RequestMapping("/home")
    public String homePage() {
        log.info("Получен запрос");
        return "Котограм";
    }


}