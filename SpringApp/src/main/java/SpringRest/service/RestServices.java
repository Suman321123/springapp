package SpringRest.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import SpringRest.model.Topic;

@Component
public class RestServices implements CommandLineRunner{

	public static void callRestService() {
		RestTemplate restTemplate=new RestTemplate();
	    Topic topic=restTemplate.getForObject("http://localhost:8080/topics/2", Topic.class);
		System.out.println("Course name id : "+topic.getId());
		System.out.println("Course name name : "+topic.getName());
		System.out.println("Course name description : "+topic.getDescription());
	}
	@Override
	public void run(String... args)throws Exception{
	callRestService();	
	}
}
