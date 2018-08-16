package com.infy.springboot.rest.service;

import java.util.List;

import com.infy.springboot.rest.model.NavFinding;

public interface FundAdminService {
	
	public List<NavFinding> processFundNAV() throws Exception;
}
