package com.example.demo.dao;

import com.example.demo.entity.Statistcs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatistcsDao extends JpaRepository<Statistcs, Integer> {
}
