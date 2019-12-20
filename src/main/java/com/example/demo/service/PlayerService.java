package com.example.demo.service;

import com.example.demo.dao.PlayerDao;
import com.example.demo.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired PlayerDao playerDao;

    public List<Player> getAllPlayers() {
        return this.playerDao.findAll();
    }

    public Player addPlayer(Player player) {
        return this.playerDao.save(player);
    }

    //other methods omitted for brevity
}
