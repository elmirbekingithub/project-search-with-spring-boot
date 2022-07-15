package peaksoft.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;
import peaksoft.dto.Response;
import peaksoft.dto.StudentRequest;
import peaksoft.mapper.StudentMapper;
import peaksoft.model.Student;
import peaksoft.repository.StudentRepository;
import peaksoft.service.StudentService;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;


@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public Response save(StudentRequest studentRequest) {
        Student student = studentMapper.create(studentRequest);
        Student saveStudent = studentRepository.save(student);
        return Response.builder().httpStatus(CREATED)
                .message(String.format("student with student name = %s successfully registered", saveStudent)).build();
    }

    @Override
    public List<Student> searchAnyColumn(String keyword) {
        return studentRepository.searchAll(keyword.toUpperCase());
       }
   }