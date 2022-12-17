package model;

import lombok.*;

@Getter
@Data
@Builder
public class People {
    String name;
    int age;
    boolean gender;

}
