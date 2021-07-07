package com.example.demoweb.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bots")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bot {
    @Id
    @GeneratedValue
    Integer id;
    @Column(name = "_from")
    String from;
    @Column(name = "_to")
    String to;

}
