// Test generated by RoostGPT for test testJune29 using AI Model gpt

package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StudentJdbcRepository_findByIdaa280fa045Test {

    @InjectMocks
    private StudentJdbcRepository studentJdbcRepository;

    @Mock
    private JdbcTemplate jdbcTemplate;

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
        student.setId(1L);
        student.setName("John Doe");
        student.setCourse("Computer Science");
    }

    @Test
    public void testFindById_Success() {
        when(jdbcTemplate.queryForObject(any(String.class), any(BeanPropertyRowMapper.class), anyLong()))
                .thenReturn(student);

        Student result = studentJdbcRepository.findById(1L);
        assertNotNull(result);
        assertEquals(student, result);
    }

    @Test
    public void testFindById_NotFound() {
        when(jdbcTemplate.queryForObject(any(String.class), any(BeanPropertyRowMapper.class), anyLong()))
                .thenReturn(null);

        Student result = studentJdbcRepository.findById(1L);
        assertNull(result);
    }
}