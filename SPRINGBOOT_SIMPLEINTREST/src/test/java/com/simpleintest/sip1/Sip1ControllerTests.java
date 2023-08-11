package com.simpleintest.sip1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = Sip1Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Sip1ControllerTests {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void test() throws Exception{
        ResponseEntity <String> response = template.getForEntity("/sip?pa=30000&time=12&intr=10",String.class);
        assertThat(response.getBody()).isEqualTo ("35000.0");
   
}
}

 
