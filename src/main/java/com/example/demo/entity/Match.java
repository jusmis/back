package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "match")
public class Match {
    @Column(name = "match_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "match_date", nullable = false, length = 255)
    private Date match_date;

    @Column(name = "match_city", nullable = false, length = 255)
    private String match_city;

    @Column(name = "match_city_host", nullable = false, length = 255)
    private String match_city_host;

    @Column(name = "set_lost", nullable = false, length = 255)
    private Integer set_lost;

    @Column(name = "set_won", nullable = false, length = 255)
    private Integer set_won;

    @Column(name = "match_result", nullable = false, length = 255)
    private String match_result;

    protected Match() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMatch_date() {
        return match_date;
    }

    public void setMatch_date(Date match_date) {
        this.match_date = match_date;
    }

    public String getMatch_city() {
        return match_city;
    }

    public void setMatch_city(String match_city) {
        this.match_city = match_city;
    }

    public String getMatch_city_host() {
        return match_city_host;
    }

    public void setMatch_city_host(String match_city_host) {
        this.match_city_host = match_city_host;
    }

    public Integer getSet_lost() {
        return set_lost;
    }

    public void setSet_lost(Integer set_lost) {
        this.set_lost = set_lost;
    }

    public Integer getSet_won() {
        return set_won;
    }

    public void setSet_won(Integer set_won) {
        this.set_won = set_won;
    }

    public String getMatch_result() {
        return match_result;
    }

    public void setMatch_result(String match_result) {
        this.match_result = match_result;
    }
}
