package miu.ea.nov.payload;

import lombok.Data;
import miu.ea.nov.entity.Course;

import java.util.List;

@Data
public class StudentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private double gpa;
    private List<Course> courseTaken;
}
