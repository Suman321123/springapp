package springbootstarter.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import springbootstarter.dao.Topic;
import springbootstarter.service.TopicService;

@RestController
public class MainController {
	
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/hello")
	public String Hello() {
		return "Hello";
	}
	
	@RequestMapping("/topics")
	public List<Topic> getAllList() {
		return  topicservice.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable int id) {
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicservice.addTopic(topic);
	}
    
	@RequestMapping(method=RequestMethod.PUT , value="/topics/{id}")
	public void UpdateTopic(@RequestBody Topic topic, @PathVariable int id) {
		topicservice.UpdateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/topics/{id}")
	public void DeleteTopic(@RequestBody Topic topic, @PathVariable int id) {
		topicservice.DeleteTopic(id, topic);
	}
}
