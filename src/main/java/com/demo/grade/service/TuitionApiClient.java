package com.demo.grade.service;

import com.demo.grade.model.api.GetTuitionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TuitionApiClient {

    public GetTuitionResponse getTuition(Long studentId) {
        //TODO Check if student has paid tuition
        log.info("Getting tuition of student with id: {}", studentId);
        return GetTuitionResponse.builder()
                .paid(true)
                .build();
    }
}
