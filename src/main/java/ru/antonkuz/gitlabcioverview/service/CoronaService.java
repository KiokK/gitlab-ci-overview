package ru.antonkuz.gitlabcioverview.service;

import org.springframework.stereotype.Service;

@Service
public class CoronaService {

    public Boolean isCorona(Integer temperature, Integer age) {
        return temperature > 37 && age > 18;
    }
}
