package com.alerts.service;

import java.util.List;

import com.alerts.Dto.AlertsDto;
import com.alerts.Dto.AlertsDto2;
import com.alerts.Dto.AlertsUpdateDto;

public interface AlertsService { 
	
	public String addAlerts(AlertsDto alertsDto);
	public AlertsDto2 getAlerts(Long alertsId);
	public List<AlertsDto2> getAllAlerts();
	public String deleteAlerts(Long alertsId);
	public String updateAlerts(Long alertsId, AlertsUpdateDto ap2);


}
