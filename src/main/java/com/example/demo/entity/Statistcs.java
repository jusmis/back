package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Statistcs")
public class Statistcs{
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Integer player_id;

    @ManyToOne
    @JoinColumn(name = "match_id")
    private Integer match_id;

    @Column(name = "serve_sum", nullable = false, length = 10)
    private Integer serve_sum;

    @Column(name = "serve_ace", nullable = false, length = 10)
    private Integer serve_ace;

    @Column(name = "serve_error", nullable = false, length = 10)
    private Integer serve_error;

    @Column(name = "serve_ace_on_ser", nullable = false, length = 10)
    private Integer serve_ace_on_set;

    @Column(name = "receive_sum", nullable = false, length = 10)
    private Integer reiceve_sum;

    @Column(name = "receive_error", nullable = false, length = 10)
    private Integer reiceve_error;

    @Column(name = "receive_positive", nullable = false, length = 10)
    private Integer reiceve_positive;

    @Column(name = "receive_positvie_percentage", nullable = false, length = 10)
    private Integer reiceve_positive_percentage;

    @Column(name = "receive_perfect", nullable = false, length = 10)
    private Integer reiceve_perfect;

    @Column(name = "receive_perfect_percentagee", nullable = false, length = 10)
    private Integer reiceve_perfect_percentagee;

    @Column(name = "spike_sum", nullable = false, length = 10)
    private Integer spike_sum;

    @Column(name = "spike_error", nullable = false, length = 10)
    private Integer spike_error;

    @Column(name = "spike_blocked", nullable = false, length = 10)
    private Integer spike_blocked;

    @Column(name = "spike_perfect", nullable = false, length = 10)
    private Integer spike_perfect;

    @Column(name = "spike_perfect_percentage", nullable = false, length = 10)
    private Integer spike_perfect_percentage;

    @Column(name = "block_sum", nullable = false, length = 10)
    private Integer block_sum;

    @Column(name = "block_on_set", nullable = false, length = 10)
    private Integer block_on_set;
    protected Statistcs() {
    }

    public Integer getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }

    public Integer getMatch_id() {
        return match_id;
    }

    public void setMatch_id(Integer match_id) {
        this.match_id = match_id;
    }

    public Integer getServe_sum() {
        return serve_sum;
    }

    public void setServe_sum(Integer serve_sum) {
        this.serve_sum = serve_sum;
    }

    public Integer getServe_ace() {
        return serve_ace;
    }

    public void setServe_ace(Integer serve_ace) {
        this.serve_ace = serve_ace;
    }

    public Integer getServe_error() {
        return serve_error;
    }

    public void setServe_error(Integer serve_error) {
        this.serve_error = serve_error;
    }

    public Integer getServe_ace_on_set() {
        return serve_ace_on_set;
    }

    public void setServe_ace_on_set(Integer serve_ace_on_set) {
        this.serve_ace_on_set = serve_ace_on_set;
    }

    public Integer getReiceve_sum() {
        return reiceve_sum;
    }

    public void setReiceve_sum(Integer reiceve_sum) {
        this.reiceve_sum = reiceve_sum;
    }

    public Integer getReiceve_error() {
        return reiceve_error;
    }

    public void setReiceve_error(Integer reiceve_error) {
        this.reiceve_error = reiceve_error;
    }

    public Integer getReiceve_positive() {
        return reiceve_positive;
    }

    public void setReiceve_positive(Integer reiceve_positive) {
        this.reiceve_positive = reiceve_positive;
    }

    public Integer getReiceve_positive_percentage() {
        return reiceve_positive_percentage;
    }

    public void setReiceve_positive_percentage(Integer reiceve_positive_percentage) {
        this.reiceve_positive_percentage = reiceve_positive_percentage;
    }

    public Integer getReiceve_perfect() {
        return reiceve_perfect;
    }

    public void setReiceve_perfect(Integer reiceve_perfect) {
        this.reiceve_perfect = reiceve_perfect;
    }

    public Integer getReiceve_perfect_percentagee() {
        return reiceve_perfect_percentagee;
    }

    public void setReiceve_perfect_percentagee(Integer reiceve_perfect_percentagee) {
        this.reiceve_perfect_percentagee = reiceve_perfect_percentagee;
    }

    public Integer getSpike_sum() {
        return spike_sum;
    }

    public void setSpike_sum(Integer spike_sum) {
        this.spike_sum = spike_sum;
    }

    public Integer getSpike_error() {
        return spike_error;
    }

    public void setSpike_error(Integer spike_error) {
        this.spike_error = spike_error;
    }

    public Integer getSpike_blocked() {
        return spike_blocked;
    }

    public void setSpike_blocked(Integer spike_blocked) {
        this.spike_blocked = spike_blocked;
    }

    public Integer getSpike_perfect() {
        return spike_perfect;
    }

    public void setSpike_perfect(Integer spike_perfect) {
        this.spike_perfect = spike_perfect;
    }

    public Integer getSpike_perfect_percentage() {
        return spike_perfect_percentage;
    }

    public void setSpike_perfect_percentage(Integer spike_perfect_percentage) {
        this.spike_perfect_percentage = spike_perfect_percentage;
    }

    public Integer getBlock_sum() {
        return block_sum;
    }

    public void setBlock_sum(Integer block_sum) {
        this.block_sum = block_sum;
    }

    public Integer getBlock_on_set() {
        return block_on_set;
    }

    public void setBlock_on_set(Integer block_on_set) {
        this.block_on_set = block_on_set;
    }

    //constructor, setters and getters omitted for brevity
}


