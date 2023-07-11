package com.alerts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alerts.entity.Alerts;

@Repository
public interface AlertsRepository extends JpaRepository<Alerts, Long>{

}
