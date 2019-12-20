package com.example.demo.service;

import com.example.demo.dao.MatchDao;
import com.example.demo.entity.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {
    @Autowired MatchDao matchDao;

    public List<Match> getAllMatches() {
        return this.matchDao.findAll();
    }

    public Match addMatch(Match match) {
        return this.matchDao.save(match);
    }

    public Match getById(Integer id) {
        List<Match> matches = this.matchDao.findAll();
        for (Match match : matches) {
            if (match.getId() == id)
                return match;
        }
        return null;
    }

    //other methods omitted for brevity
}
