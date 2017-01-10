package com.vidvaan.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vidvaan.bean.Country;

@Controller
public class CountryController {
	@RequestMapping(value="country", method = RequestMethod.GET)
	public ModelAndView country(){
		return new ModelAndView("countryForm","country",new Country());
	}
	@RequestMapping(value="saveCountry", method = RequestMethod.POST)
	public String saveCountry(@ModelAttribute("country") Country country, ModelMap model) {
		model.addAttribute("countryName", country.getCountryName());
		model.addAttribute("pmName", country.getPmName());
		return "success";
	}	
}