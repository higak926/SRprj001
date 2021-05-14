package com.SRprj.SRprj001.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SRprj.SRprj001.app.resource.Profile;

@RestController
@RequestMapping("api")
public class RestApiController {

  @RequestMapping(value = "/getProfile", method = RequestMethod.GET)
  @CrossOrigin(origins = "http://localhost:3000")
  @ResponseBody
  public Profile getBirthStone() {
	Profile profile = new Profile("比嘉 一晃", 29, "Hello Spring & React!!");
	return profile;
  }
}