package edu.birzeit.account.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Getter
@Setter
@NoArgsConstructor
public class Business {

    private Long id = Math.abs(new Random().nextLong()%10000);
    private String name;

    public Business(String name) {
        setId(Math.abs(new Random().nextLong()%10000));
        setName(name);
    }
}