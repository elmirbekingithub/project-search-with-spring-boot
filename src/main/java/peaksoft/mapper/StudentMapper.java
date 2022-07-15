package peaksoft.mapper;

import org.springframework.stereotype.Component;
import peaksoft.dto.StudentRequest;
import peaksoft.model.Student;

@Component
public class StudentMapper {

    public Student create(StudentRequest dto) {
        if(dto == null){
            return null;
        }

        Student student = new Student();

        student.setName(dto.getName());
        student.setSurname(dto.getSurname());
        student.setAge(dto.getAge());
        student.setProjectTeam(dto.getProjectTeam());
        student.setLaptopBrand(dto.getLaptopBrand());
         student.setEmail(dto.getEmail());

        return student;



     }
}
