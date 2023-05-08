package com.example.Logger.Model;

import java.lang.ModuleLayer.Controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
@RestController
public class Logee {
org.slf4j.Logger log=LoggerFactory.getLogger(Controller.class);
@RequestMapping("/api")
public String demo()
{
	log.info("information message");
	log.warn("warning message");
	log.error("Error message");
	log.debug("debug message");
	log.trace("trace message");
	return "hiiii";
}
}
