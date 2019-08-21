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
		return "addMinutes";
	}
	
}
