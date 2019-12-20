package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Column(name = "player_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "player_name", nullable = false, length = 255)
    private String player_name;

    @Column(name = "player_weight", nullable = false, length = 10)
    private Integer player_weight;

    @Column(name = "player_height", nullable = false, length = 10)
    private Integer player_height;

    protected Player() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public Integer getPlayer_weight() {
        return player_weight;
    }

    public void setPlayer_weight(Integer player_weight) {
        this.player_weight = player_weight;
    }

    public Integer getPlayer_height() {
        return player_height;
    }

    public void setPlayer_height(Integer player_height) {
        this.player_height = player_height;
    }

    //constructor, setters and getters omitted for brevity
}
