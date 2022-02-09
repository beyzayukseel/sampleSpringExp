package com.example.serseribf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Things {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String bestWishes;
}
