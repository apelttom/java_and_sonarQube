package com.sonarQube.test.springboot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SynchronizationController {
	
	private int sharedVariable = 0;

	@RequestMapping("/synchro")
	public String index() {	
		Object lock1 = new String("MyPerfectLock");
		// this lock will be changed later, so it will not
		// hold Thread n. 2 to enter synchronized block!!!
		synchronized(lock1) {
		    lock1 = new Object();
		    sharedVariable++;
		}
		return "We counted exactly " + sharedVariable + " logins.";
	}

}