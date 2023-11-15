package com.example.service;

import com.example.entity.SongEntity;
import com.example.model.Song;
import com.example.repository.SongRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class SongServiceTest {
    @InjectMocks
    private SongService songService;

    @MockBean
    private SongRepository songRepository;

    @Test
    private void findById() {
        Mockito.when(songRepository.findById(1)).thenReturn(Optional.of(new SongEntity("name", 1, true)));
        Song result = songService.findById(1);
        Assertions.assertEquals("name", result.getName());

    }
}
