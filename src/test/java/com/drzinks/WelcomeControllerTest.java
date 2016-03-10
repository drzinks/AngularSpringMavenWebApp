package com.drzinks;

import com.drzinks.controllers.WelcomeController;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
/**
 * Created by golebiow on 2016-03-10.
 */
public class WelcomeControllerTest {
    @InjectMocks
    private WelcomeController welcomeController;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(welcomeController).build();
    }

    @Test
    public void test() throws Exception {
        mockMvc.perform(get("/welcome")).andDo(print());
    }
}
