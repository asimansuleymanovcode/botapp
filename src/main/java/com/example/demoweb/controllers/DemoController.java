package com.example.demoweb.controllers;

import com.example.demoweb.models.Bot;
import com.example.demoweb.services.BotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/bots")
@RequiredArgsConstructor
public class DemoController {
    private final BotService botService;
    @GetMapping("/version")
    String getVersion(){
        return "version-1";
    }

    @GetMapping
    List<Bot> getAllBots(){
        return botService.getAllBots();
    }
}
