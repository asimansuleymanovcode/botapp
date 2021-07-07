package com.example.demoweb.repositories;

import com.example.demoweb.models.Bot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BotRepo extends JpaRepository<Bot, Integer> {
}
