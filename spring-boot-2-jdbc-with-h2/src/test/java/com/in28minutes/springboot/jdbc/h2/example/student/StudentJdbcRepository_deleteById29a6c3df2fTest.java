// Test generated by RoostGPT for test testJune29 using AI Model gpt

package com.in28minutes.springboot.jdbc.h2.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class StudentJdbcRepository_deleteById29a6c3df2fTest {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private StudentJdbcRepository studentJdbcRepository;

    @BeforeEach
    public void setUp() {
        studentJdbcRepository = new StudentJdbcRepository(jdbcTemplate);
    }

    @Test
    public void testDeleteById_success() {
        long id = 1L;
        studentJdbcRepository.deleteById(id);

        verify(jdbcTemplate, times(1)).update(eq("delete from student where id=?"), eq(id));
    }

    @Test
    public void testDeleteById_failure() {
        long id = -1L;
        studentJdbcRepository.deleteById(id);

        verify(jdbcTemplate, times(1)).update(eq("delete from student where id=?"), eq(id));
    }
}