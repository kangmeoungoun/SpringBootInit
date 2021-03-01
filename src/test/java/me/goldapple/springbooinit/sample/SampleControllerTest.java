package me.goldapple.springbooinit.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.boot.test.system.OutputCaptureRule;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
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
@ExtendWith(OutputCaptureExtension.class)
class SampleControllerTest{

    //@Autowired
    //JacksonTester<> jacksonTester;

    @Autowired
    MockMvc mockMvc;

    @MockBean
    SampleService mockSampleService;

    @Test
    void hello(CapturedOutput capturedOutput)throws Exception{
        when(mockSampleService.getName()).thenReturn("goldapple1");
        this.mockMvc.perform(get("/hello"))
                .andExpect(content().string("hello goldapple1"))
                .andExpect(status().isOk())
                .andDo(print());
        assertThat(capturedOutput.toString()).contains("holoman").contains("skip");
    }
}