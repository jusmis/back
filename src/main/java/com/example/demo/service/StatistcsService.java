package com.example.demo.service;

import com.example.demo.dao.StatistcsDao;
import com.example.demo.entity.Match;
import com.example.demo.entity.Statistcs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StatistcsService {
    @Autowired StatistcsDao statistcsDao;
    @Autowired MatchService matchService;

    public List<Statistcs> getAllStatistcs() {
        return this.statistcsDao.findAll();
    }

    public List<Statistcs> getLastMonth() {
        List<Statistcs> list = this.statistcsDao.findAll();
        List<Statistcs> result = new ArrayList<>();
        for (Statistcs statistic : list){
            Match match = matchService.getById(statistic.getMatch_id());
            if (match.getMatch_date().after(new Date()))
                result.add(statistic);
        }
        return result;
    }

    public List<Statistcs> getWonMatches() {
        List<Statistcs> list = this.statistcsDao.findAll();
        List<Statistcs> result = new ArrayList<>();
        for (Statistcs statistic : list){
            Match match = matchService.getById(statistic.getMatch_id());
            if (match.getMatch_result().equalsIgnoreCase("w"))
                result.add(statistic);
        }
        return result;
    }

    public List<Statistcs> getLostMatches() {
        List<Statistcs> list = this.statistcsDao.findAll();
        List<Statistcs> result = new ArrayList<>();
        for (Statistcs statistic : list){
            Match match = matchService.getById(statistic.getMatch_id());
            if (match.getMatch_result().equalsIgnoreCase("l"))
                result.add(statistic);
        }
        return result;
    }

    public List<Statistcs> getHomeMatches() {
        List<Statistcs> list = this.statistcsDao.findAll();
        List<Statistcs> result = new ArrayList<>();
        for (Statistcs statistic : list){
            Match match = matchService.getById(statistic.getMatch_id());
            if (match.getMatch_city_host().equalsIgnoreCase("h"))
                result.add(statistic);
        }
        return result;
    }

    public List<Statistcs> getGuestMatches() {
        List<Statistcs> list = this.statistcsDao.findAll();
        List<Statistcs> result = new ArrayList<>();
        for (Statistcs statistic : list){
            Match match = matchService.getById(statistic.getMatch_id());
            if (match.getMatch_city_host().equalsIgnoreCase("g"))
                result.add(statistic);
        }
        return result;
    }

    public List<Statistcs> getCityMatches(String city) {
        List<Statistcs> list = this.statistcsDao.findAll();
        List<Statistcs> result = new ArrayList<>();
        for (Statistcs statistic : list){
            Match match = matchService.getById(statistic.getMatch_id());
            if (match.getMatch_city().equalsIgnoreCase(city))
                result.add(statistic);
        }
        return result;
    }

    public List<Statistcs> getLongMatches() {
        List<Statistcs> list = this.statistcsDao.findAll();
        List<Statistcs> result = new ArrayList<>();
        for (Statistcs statistic : list){
            Match match = matchService.getById(statistic.getMatch_id());
            if ((match.getSet_lost() + match.getSet_won()) > 3)
                result.add(statistic);
        }
        return result;
    }

    public List<Statistcs> getMatchesLongerThan(Integer x) {
        List<Statistcs> list = this.statistcsDao.findAll();
        List<Statistcs> result = new ArrayList<>();
        for (Statistcs statistic : list){
            Match match = matchService.getById(statistic.getMatch_id());
            if ((match.getSet_lost() + match.getSet_won()) > x)
                result.add(statistic);
        }
        return result;
    }

    public Statistcs addStatistcs(Statistcs statistcs) {
        return this.statistcsDao.save(statistcs);
    }

    //other methods omitted for brevity
}
