package org.geethu.spring_jpa_demo.course;

import org.geethu.spring_jpa_demo.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CourseController {

    @Autowired
    private CourseService COurseService;

    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return COurseService.getAllCourses(topicId);
    }
    @RequestMapping("courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return COurseService.getCourse(courseId);
    }
    @RequestMapping(method = RequestMethod.POST, value="/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId,"",""));
        COurseService.addCourse(course);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
        course.setTopic(new Topic(topicId,"",""));
        COurseService.updateCourse(course);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="/courses/{id}")
    public void deleteCourse( @PathVariable String id) {
         COurseService.deleteCourse(id);
    }
}
