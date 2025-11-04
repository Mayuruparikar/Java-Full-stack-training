package com.training.training.jpabasics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // JPQL
    @Query("SELECT s FROM Student s")
    List<Student> getAllStudent();

    @Query("SELECT s FROM Student s WHERE s.city = ?1")
    List<Student> getStudentsByCity(String city);

    @Query("SELECT s FROM Student s WHERE s.age > ?1")
    List<Student> getStudentsAboveAge(int age);

        // Native Query
    @Query(value = "SELECT * FROM Student", nativeQuery = true)
    List<Student> getAllStudentNative();

    @Query(value = "SELECT * FROM Student WHERE name LIKE %?1%", nativeQuery = true)
    List<Student> searchStudentsByName(String name);

    // Named Query
    List<Student> findByCity(String city);

        // Named Native Query
    @Query(nativeQuery = true, name = "Student.findByAge")
    List<Student> findByAge(int age);
}
