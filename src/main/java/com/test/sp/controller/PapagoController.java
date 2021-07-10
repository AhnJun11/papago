package com.test.sp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.entity.papago.PaPagoParam;
import com.test.sp.entity.papago.PaPagoResult;
import com.test.sp.service.PapagoService;

@Controller
public class PapagoController {
	private static final Logger log = LoggerFactory.getLogger(PapagoController.class);
	
	@Autowired
	private PapagoService papagoService;
	
	@RequestMapping(value="/papago", method=RequestMethod.GET)
	public @ResponseBody PaPagoResult translation(@ModelAttribute PaPagoParam pp) {
		log.debug("param=>{}",pp);
		return papagoService.getPaPagoResult(pp);
	}
}