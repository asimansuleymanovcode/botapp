package com.example.demoweb.services;

import com.example.demoweb.models.Bot;
import com.example.demoweb.repositories.BotRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
@RequiredArgsConstructor
public class BotService {
    private final BotRepo botRepo;

    public List<Bot> getAllBots(){
        return botRepo.findAll();
    }

    @PostConstruct
    void init(){
        botRepo.saveAll(IntStream.range(1, 11)
                .mapToObj(i -> Bot.builder().from("from-" + i).to("to-" + i).build()).collect(Collectors.toList()));
    }

    public Bot findById(Integer id) {
        return botRepo.findById(id).get();
    }
}
