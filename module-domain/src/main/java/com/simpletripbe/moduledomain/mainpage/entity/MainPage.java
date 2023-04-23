package com.simpletripbe.moduledomain.mainpage.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class MainPage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mainpage_id")
    private Long id;
    private String continent;
    private String country;
    private String image;
    private LocalDateTime createDate;

}
