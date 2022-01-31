package com.taxitracker;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.taxitracker.dto.*;
import com.taxitracker.service.*;

@Controller
public class TaxiTrackerController {
    
	@Autowired
	private IDriverService driverService;
	@Autowired
	private IReviewService reviewService;
	
    @RequestMapping("/")
    public ModelAndView start() {
    	ModelAndView model = new ModelAndView();
    	model.setViewName("start");
    	model.addObject("reviewDTO", new ReviewDTO());
    	model.addObject("deleteReview", new ReviewDTO());
    	model.addObject("allDrivers", driverService.getAllDrivers());
        return model;
    }
    
       
//    @RequestMapping("/add")
//    public String add(Model m, @RequestParam(value="name", required=false, defaultValue="xyz") String name) {
//    	return "start";
//    }
    
    @PostMapping("/api/review/add")
    public ModelAndView addReview(HttpServletRequest request, ReviewDTO r) {
       	reviewService.save(r);
    	request.setAttribute(View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.TEMPORARY_REDIRECT);
    	return new ModelAndView("redirect:/");
    }
    
    @PostMapping("/api/review/del")
    public ModelAndView removeReview(HttpServletRequest request, ReviewDTO r) {
    	reviewService.delete(r);
    	request.setAttribute(View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.TEMPORARY_REDIRECT);
    	return new ModelAndView("redirect:/");
    }
    
    @RequestMapping("/showDriverReviews")
    public ModelAndView showDriverReviews(@RequestParam("driver_ID") int driverId) {
    	ModelAndView mav = new ModelAndView();
    	mav.setViewName("driverReviews");
    	List<ReviewDTO> driversReviews = reviewService.findAllWithDriverId(driverId);
    	mav.addObject("reviews", driversReviews);
    	mav.addObject("driver", driverService.fetchByID(driverId));
    	return mav;
    }
    
}