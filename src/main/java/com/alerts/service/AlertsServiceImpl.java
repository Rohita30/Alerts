package com.alerts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alerts.Dto.AlertsDto;
import com.alerts.Dto.AlertsDto2;
import com.alerts.Dto.AlertsUpdateDto;
import com.alerts.entity.Alerts;
import com.alerts.entity.Product;
import com.alerts.entity.User;
import com.alerts.repository.AlertsRepository;
import com.alerts.repository.ProductRepository;
import com.alerts.repository.UserRepository;

@Service
public class AlertsServiceImpl implements AlertsService { 
	
	@Autowired
	private AlertsRepository alertsRepo;
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public String addAlerts(AlertsDto alertsdto) {
    	Long productId=alertsdto.getProductId();
    	Long userId=alertsdto.getUserId();
    	Alerts app=new Alerts();
    	
//    	for product
    	Product product;
    	product = productRepo.findById(productId).get();
    	app.setProduct(product);
    	
    	
//    	for user
    	User user;
    	user = userRepo.findById(userId).get();
    	app.setUser(user);
    			
//    	app.setAlertsId(alertsdto.getAlertsId());
    	app.setAlertsThresholdPrice(alertsdto.getAlertsThresholdPrice());
    	
    	alertsRepo.save(app);
    	
    	return "Alerts Created";
    }

	@Override
	public AlertsDto2 getAlerts(Long alertsId) {
		Alerts a =  alertsRepo.findById(alertsId).get();
		AlertsDto2 ap = new AlertsDto2();
        ap.setAlertsId(a.getAlertsId());
        ap.setProductId(a.getProduct().getProductId());
        ap.setUserId(a.getUser().getUserId());
        ap.setAlertsThresholdPrice(a.getAlertsThresholdPrice());
        return ap;
    }

	@Override
	public List<AlertsDto2> getAllAlerts() {
        List <Alerts> alertsList = alertsRepo.findAll();
    	
    	List<AlertsDto2> alertsDtoList = new ArrayList<>();
    	
    	for(Alerts ap : alertsList) {
    		AlertsDto2 app2 = new AlertsDto2();
    		app2.setAlertsId(ap.getAlertsId());
    		app2.setAlertsThresholdPrice(ap.getAlertsThresholdPrice());
    		app2.setProductId(ap.getProduct().getProductId());
    		app2.setUserId(ap.getUser().getUserId());
    		
    		alertsDtoList.add(app2);
    		
    	}
    	return alertsDtoList;
    }

	@Override
	public String deleteAlerts(Long alertsId) {
		// TODO Auto-generated method stub
		alertsRepo.deleteById(alertsId);
		return "Alerts Deleted Successfully";
	}

	@Override
	public String updateAlerts(Long alertsId,
			AlertsUpdateDto ap2) {
		// TODO Auto-generated method stub
		
		Alerts ap = alertsRepo.findById(alertsId).get();

		ap.setAlertsThresholdPrice(ap2.getAlertsThresholdPrice());

		alertsRepo.save(ap);

		
		return "Alerts Updated Succesfully.";
	}
	

}
