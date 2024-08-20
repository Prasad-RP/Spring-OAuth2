package com.security.oauth.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/defaults")
public class DefaultApi {

	@GetMapping("/success")
	public String defaultMeth() {
		return "success";
	}
}
