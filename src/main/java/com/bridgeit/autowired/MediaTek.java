package com.bridgeit.autowired;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {

	
	public void process() {
		{
			System.out.println("Second good Processer...");
		}

	}

}
