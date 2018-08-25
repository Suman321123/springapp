package springbootstarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootstarter.dao.Topic;
import springbootstarter.repo.TopicRepo;

@Service
public class TopicService {
  
	@Autowired
	private TopicRepo topicrepo;
	
		
	public List<Topic> getAllTopics() {
		
		 List<Topic> topics = new ArrayList<>();
		topicrepo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(int id) {
		//return topics.stream().filter(t -> t.getId()==id).findFirst().get();
	    return topicrepo.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicrepo.save(topic);
	}

	public void UpdateTopic(int id, Topic topic) {
	    topicrepo.save(topic);
	}

	public void DeleteTopic(int id, Topic topic) {
		topicrepo.delete(id);
		
	}
}
