package peaksoft.service;

import peaksoft.dto.Response;
import peaksoft.dto.StudentRequest;
import peaksoft.model.Student;

import java.util.List;

public interface StudentService {

    Response save(StudentRequest studentRequest);
    List<Student> searchAnyColumn(String keyword);
}
