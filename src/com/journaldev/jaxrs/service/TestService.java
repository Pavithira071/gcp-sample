
package com.journaldev.jaxrs.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("test")
public class TestService {

	@GET
	@Path("/hello/{msg}")
	public String sayHello(@PathParam(value="msg") String msg){
		
		int a=5;
		for(int i=0;i<a;i++){
			System.out.println("printing name "+i+"th time");
			
		}
		return "Hello "+msg;
	}
}
