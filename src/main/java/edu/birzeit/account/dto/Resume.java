package edu.birzeit.account.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class Resume {

    private User user;

    private String[] skills = new String[]{"Skill 1","Skill 2", "Skill 3"};

    @JsonProperty("work_experience")
    private String[] workExperience = new String[]{"workExperience 1", "workExperience 2"};

    public Resume(Long userId) {
        setUser(new User(userId));
    }
}
