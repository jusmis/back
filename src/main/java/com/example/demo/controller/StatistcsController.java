package com.example.demo.controller;

import com.example.demo.entity.Statistcs;
import com.example.demo.service.StatistcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/statistcs")
public class StatistcsController {
    @Autowired StatistcsService statistcsService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Statistcs> getAllStatistcs() {
        return statistcsService.getAllStatistcs();
    }

    @RequestMapping(value = "/lastMonth", method = RequestMethod.GET)
    public List<Statistcs> getLastMonth() {
        return statistcsService.getLastMonth();
    }

    @RequestMapping(value = "/wonMatches", method = RequestMethod.GET)
    public List<Statistcs> getWonMatches() {
        return statistcsService.getWonMatches();
    }

    @RequestMapping(value = "/lostMatches", method = RequestMethod.GET)
    public List<Statistcs> getLostMatches() {
        return statistcsService.getLostMatches();
    }

    @RequestMapping(value = "/homeMatches", method = RequestMethod.GET)
    public List<Statistcs> getHomeMatches() {
        return statistcsService.getHomeMatches();
    }

    @RequestMapping(value = "/guestMatches", method = RequestMethod.GET)
    public List<Statistcs> getGuestMatches() {
        return statistcsService.getGuestMatches();
    }

    @RequestMapping(value = "/longMatches", method = RequestMethod.GET)
    public List<Statistcs> getLongMatches() {
        return statistcsService.getLongMatches();
    }

    @RequestMapping(value = "/cityMatches", method = RequestMethod.GET)
    public List<Statistcs> getCityMatches(@RequestParam String city) {
        return statistcsService.getCityMatches(city);
    }

    @RequestMapping(value = "/matchesLongerThan", method = RequestMethod.GET)
    public List<Statistcs> getMatchesLongerThan(@RequestParam Integer x) {
        return statistcsService.getMatchesLongerThan(x);
    }

    @RequestMapping(value = "/addStatistic", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public Statistcs addNewStatistc(@RequestBody Statistcs statistcs) {
        return this.statistcsService.addStatistcs(statistcs);
    }



}

