package org.geethu.spring_jpa_demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Marks this as a service, like a service. You can use in multiple classes

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepo.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }
    public Course getCourse(String id){
        return courseRepo.findById(id).get();
    }
    public Course getCourseByName(String name){
        return courseRepo.findByName(name).get(0);
    }
    public void addCourse(Course course){
        courseRepo.save(course);
    }
    public void updateCourse(Course course){
        courseRepo.save(course);
    }
    public void deleteCourse(String id){
        courseRepo.deleteById(id);
    }
}
