package ch17_bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserEntityLombok {
    private int username;
    private int password;
    private String email;
    private String name;
}
