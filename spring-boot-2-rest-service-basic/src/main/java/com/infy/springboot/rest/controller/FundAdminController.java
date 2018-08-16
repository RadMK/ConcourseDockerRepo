package com.infy.springboot.rest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springboot.rest.model.NavFinding;
import com.infy.springboot.rest.service.FundAdminService;

@RestController
public class FundAdminController {
	private static final Logger logger = LoggerFactory.getLogger(FundAdminController.class);

	@Autowired
	FundAdminService fundAdminService;

	@RequestMapping("/nav/value")
	public ResponseEntity<List<NavFinding>> getFundsNav() {
		List<NavFinding> navList = null;
		try {
			navList = fundAdminService.processFundNAV();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ResponseEntity.ok(navList);
	}	
}
