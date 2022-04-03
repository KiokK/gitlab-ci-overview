package ru.antonkuz.gitlabcioverview.service;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class CoronaServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @SneakyThrows
    @Test
    void isCoronaTrue(){
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/corona?temperature={1}&age={2}",38,23))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("true"));
    }

    @SneakyThrows
    @Test
    void isCoronaFalse(){
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/corona?temperature={1}&age={2}",36,23))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("false"));
    }
}