package springbootstarter.repo;

import org.springframework.data.repository.CrudRepository;

import springbootstarter.dao.Topic;

public interface TopicRepo extends CrudRepository<Topic , Integer>{

}
