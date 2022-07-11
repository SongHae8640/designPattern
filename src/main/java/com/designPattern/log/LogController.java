package com.designPattern.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LogController {

    @GetMapping
    public String logTest(){
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("hello~~!!");
        return "test";
    }
}
