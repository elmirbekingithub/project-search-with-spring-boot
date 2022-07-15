package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import peaksoft.model.Student;


import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query(value = "select s from Student s where upper(concat(s.name,s.surname,s.laptopBrand,s.projectTeam,s.email)) like %?1%")
    List<Student> searchAll(String keyword);

}
