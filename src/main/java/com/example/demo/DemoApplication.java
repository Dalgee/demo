package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner getRunner() {
        return args -> {
            System.out.println("merong------------------------------");
        };
    }


    public static String extract(ReservedFields reservedFields) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        ReservedFields response = new ReservedFields();

        response.setField1(reservedFields.getField1());


        return objectMapper.writeValueAsString(response);
    }


}

@Getter
@Setter
@ToString
class ReservedFields {
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;
    private String field7;
    private String field8;
    private String field9;
    private String field10;
    private String field11;
    private String field12;
    private String field13;
    private String field14;
    private String field15;
    private String field16;
    private String field17;
    private String field18;
    private String field19;
    private String field20;
    private String field21;
    private String field22;
    private String field23;
    private String field24;
    private String field25;
    private String field26;
    private String field27;
    private String field28;
    private String field29;
    private String field30;
    private String field31;
    private String field32;
    private String field33;
    private String field34;
    private String field35;
}


@Getter
@Setter
@ToString
class FullField extends ReservedFields {
    private String name;
    private Integer age;
}
