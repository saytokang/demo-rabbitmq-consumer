package com.example.demorabbitmq;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class SimpleMessage {
    private String name;
    private String description;
}