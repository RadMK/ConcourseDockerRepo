package com.infy.springboot.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springboot.rest.dao.NavRepo;
import com.infy.springboot.rest.kafka.Sender;
import com.infy.springboot.rest.model.NavFinding;

/**
 * Created by Radha_Botla
 */
@Service
public class FundAdminServiceImpl implements FundAdminService{

    private static final Logger logger = LoggerFactory.getLogger(FundAdminServiceImpl.class);
    
    private static String BOOT_TOPIC = "boot.t";
    
    @Autowired
    NavRepo navRepo;   

    @Autowired
    private Sender sender;
    
    public List<NavFinding> processFundNAV() throws Exception {
        logger.debug("Inside processFundNAV method !");
        List<NavFinding> navValuesList = new ArrayList<>();
        try{
        	navValuesList = findAllNavValues();
        	sender.send(BOOT_TOPIC, "Hello Boot from Radha Mythili!");
            //emailService.sendAddRoleNotificationEmail((List<EmployeeRoles>) employeeRolesList);
        }catch(Exception moe){
            logger.error("NAV value processing failure",moe);
            throw new Exception(moe.getMessage());
        }
		return navValuesList;
    }
    
    public List<NavFinding> findAllNavValues(){
        List<NavFinding> navValuesList = new ArrayList<>();
        for(NavFinding nav : navRepo.findAll()){
            String result = nav.toString() + "</br>";
            System.out.println("result" +result);
            navValuesList.add(nav);
        }           
        return navValuesList;
    }
}