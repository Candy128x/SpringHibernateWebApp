package com.pf18.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pf18.model.Manifest;
import com.pf18.service.ManifestService;

@Controller
public class ManifestController {

	@Autowired
	private ManifestService manifestService;

	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map) {
		Manifest manifest = new Manifest();
		map.put("manifest", manifest);
		map.put("manifestList", manifestService.getAllManifest());
		return "manifest";
	}
	
	@RequestMapping(value="/manifest.do", method=RequestMethod.POST)
	public String doAction(@ModelAttribute Manifest manifest, BindingResult result, @RequestParam String action, Map<String, Object> map) {
		Manifest manifestResult = new Manifest();
	
		// only in Java7 we can put String in switch
		switch (action.toLowerCase()) {
		case "add":
			manifestService.add(manifest);
			manifestResult = manifest;
			break;
		case "edit":
			manifestService.edit(manifest);
			manifestResult = manifest;
			break;
		case "delete":
			manifestService.delete(manifest.getId());
			manifestResult = new Manifest();
			break;
		case "search":
			Manifest searchedManifest = manifestService.getManifest(manifest.getId());
			manifestResult = searchedManifest!= null ? searchedManifest : new Manifest();
			break;
		}
		
		map.put("manifest", manifestResult);
		map.put("manifestList", manifestService.getAllManifest());
		
		return "manifest";
	}
}
