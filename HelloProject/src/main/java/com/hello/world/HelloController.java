package com.hello.world;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {

	@RequestMapping("/user")
	public String hello()
	{
		return "<h1>Hello Akash World</h1>"
				+ "<p>How to fix The action cannot be completed because the file is open in another program error?\r\n"
				+ "Use Disk Cleanup and repair HDD. ...\r\n"
				+ "Empty the Recycle Bin. ...</p>";
	}
}
