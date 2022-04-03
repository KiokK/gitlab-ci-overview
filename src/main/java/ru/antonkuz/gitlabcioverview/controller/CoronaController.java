package ru.antonkuz.gitlabcioverview.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.antonkuz.gitlabcioverview.service.CoronaService;

@RestController
@RequestMapping("/api/v1/corona")
@RequiredArgsConstructor
public class CoronaController {

    private final CoronaService coronaService;

    @GetMapping
    public Boolean isCorona(Integer temperature, Integer age) {
        return coronaService.isCorona(temperature, age);
    }
}
