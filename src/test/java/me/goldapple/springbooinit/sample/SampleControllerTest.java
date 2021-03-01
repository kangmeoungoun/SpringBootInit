package me.goldapple.springbooinit.sample;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@JsonTest
@AutoConfigureMockMvc
@WebMvcTest(SampleController.class)
class SampleControllerTest{

    //@Autowired
    //JacksonTester<> jacksonTester;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    TestRestTemplate testRestTemplate;

    @MockBean
    SampleService mockSampleService;

    @Autowired
    WebTestClient webTestClient;

    @Test
    void hello() throws Exception{
        when(mockSampleService.getName()).thenReturn("goldapple");
        this.mockMvc
                .perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello goldapple"))
                .andDo(print());
    }
    @Test
    void RestHello() throws Exception{
        when(mockSampleService.getName()).thenReturn("goldapple");
        String result = testRestTemplate.getForObject("/hello" , String.class);
        assertThat(result).isEqualTo("hello goldapple");
    }
    @Test
    void MockHello() throws Exception{
        when(mockSampleService.getName()).thenReturn("goldapple1");
        String result = testRestTemplate.getForObject("/hello" , String.class);
        assertThat(result).isEqualTo("hello goldapple1");
    }
    @Test
    void webClientHello() throws  Exception{
        when(mockSampleService.getName()).thenReturn("goldapple1");
        webTestClient.get().uri("/hello").exchange().expectStatus().isOk()
                .expectBody(String.class).isEqualTo("hello goldapple1");
    }

    @Test
    void webMvcHello() throws Exception{
        when(mockSampleService.getName()).thenReturn("goldapple");
        mockMvc.perform(get("/hello"))
                .andExpect(content().string("hello goldapple"))
                .andExpect(status().isOk())
                .andDo(print());
    }


}