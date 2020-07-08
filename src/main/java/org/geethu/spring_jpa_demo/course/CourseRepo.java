package org.geethu.spring_jpa_demo.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepo extends CrudRepository<Course, String>{
    public List<Course> findByName(String name);
    public List<Course> findByTopicId(String topicId);

}
