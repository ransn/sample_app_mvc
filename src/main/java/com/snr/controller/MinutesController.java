/**
 * 
 */
package com.snr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snr.model.Exercise;

/**
 * @author I326319
 *
 */
@Controller
public class MinutesController {
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise){
		System.out.println("exercise:"+ exercise.getMinutes());
		//return "forward:addMoreMinutes.html"; This is forward chaining
		//return "redirect:addMoreMinutes.html"; // This is redirect chaining, in this values will be reset
		return "addMinutes";
 	}
	
	/*
	 * @RequestMapping(value="/addMoreMinutes") public String
	 * addMoreMinutes(@ModelAttribute("exercise") Exercise exercise){
	 * System.out.println("exercising:"+ exercise.getMinutes()); return
	 * "addMinutes"; }
	 */
	
}
