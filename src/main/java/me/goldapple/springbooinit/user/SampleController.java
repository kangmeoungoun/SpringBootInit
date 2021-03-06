package me.goldapple.springbooinit.user;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController{
    @GetMapping("/hello")
    public String hello(Model model){
        throw new SampleException();
    }

    @ExceptionHandler(SampleException.class )
    public ResponseEntity<AppError> sampleError(SampleException e){
        AppError appError = new AppError();
        appError.setMessage("error.app.key");
        appError.setReason("IDK IDK IDK");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body(appError);
    }
}
