package me.goldapple.springbooinit.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
class UserControllerTest{

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("")
    void hello() throws Exception{
        //given
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello"))
                .andDo(print());
        //when

        //then
    }

    @Test
    @DisplayName("JSON 형태로 user 를만드는 테스트")
    void createUser_JSON() throws Exception{
        //given
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setUsername("goldapple");
        user.setPassword("123");
        String userJson=mapper.writeValueAsString(user);;

        //when
        mockMvc.perform(post("/users/create")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(userJson))
                .andExpect(status().isOk())
                .andDo(print())
                //then
                .andExpect(jsonPath("$.username",is(equalTo("goldapple"))))
                .andExpect(jsonPath("$.password",is(equalTo("123"))));

    }
}
