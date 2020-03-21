package edu.birzeit.account.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Getter
@Setter
public class User {

    private Long id = Math.abs(new Random().nextLong()%10000);
    private String name;

    @JsonIgnore
    private String[] names = new String[]{"Omar", "Mohammad", "Ali", "Mustafa", "Khaleel"};

    public User(){
        setId(Math.abs(new Random().nextLong()%10000));
        setName(this.names[new Random().nextInt(this.names.length)]);
    }

    public User(Long id) {
        setId(id);
        setName(this.names[new Random().nextInt(this.names.length)]);
    }

    public User(String name) {
        setId(Math.abs(new Random().nextLong()%10000));
        setName(name);
    }
}