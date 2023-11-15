package com.example.service;

import com.example.controller.SongRecommenderController;
import com.example.repository.RecommandationRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
class RecommendationServiceTest {
    @Autowired
    private RecommendationService recommendationService;
    @MockBean
    private RecommandationRepository recommandationRepository;
    @Test
    public void getRecommandationsTest(){







    }
}