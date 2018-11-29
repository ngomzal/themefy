/**
 * 
 */
package com.themefy.back.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangbe
 *
 */
@RestController
public class PingController {
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "ping received and ping responded";
	}

}
