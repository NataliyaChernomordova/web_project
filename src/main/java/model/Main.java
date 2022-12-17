package model;

public class Main {
    public static void main(String[] args) {
        People people = People.builder()
                .age(31)
                .name("Victor")
                .gender(false)
                .build();

    }
}
