package com.wjtcy.gglm.manager.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjtcy.gglm.manager.form.RegAdAdminForm;

@Controller
public class AdAdminController {

	@RequestMapping("adAdmin")
	public String regAdAdmin(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap,RegAdAdminForm form) {

		return null;
	}

	@RequestMapping("gotoAdAdminReg")
	public String gotoRegAdAdmin(){
		
		return "adAdminReg" ;
	}
}
