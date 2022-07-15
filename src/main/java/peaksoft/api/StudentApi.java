package peaksoft.api;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.dto.Response;
import peaksoft.dto.StudentRequest;
import peaksoft.model.Student;
import peaksoft.service.StudentService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/student")
public class StudentApi {
    private final StudentService service;
    @PostMapping("/save")
    public Response saveCompany(@RequestBody StudentRequest studentRequest) {
        return service.save(studentRequest);
    }
    @GetMapping("/search/{any}")
    public List<Student> findCompanyByName(@PathVariable String any) {
        return service.searchAnyColumn(any);
    }
}
