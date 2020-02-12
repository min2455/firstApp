package com.bosco.firstApp.firstApp.web.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

        private final String name;
        private final int amount;

}