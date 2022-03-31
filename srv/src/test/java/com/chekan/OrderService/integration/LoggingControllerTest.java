package com.chekan.OrderService.integration;

import com.chekan.OrderService.controllers.LoggingController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(LoggingController.class)
public class LoggingControllerTest {

    @Autowired
    private MockMvc mvc;

    @WithMockUser(value = "rwfsdc")
    @Test
    public void givenAuthRequestOnActuator_shouldSucceedWith200() throws Exception {
        this.mvc.perform(get("/log")
                .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void givenAuthRequestOnActuator_shouldReturn401() throws Exception {
        this.mvc.perform(get("/log")
                .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isUnauthorized());
    }

}
