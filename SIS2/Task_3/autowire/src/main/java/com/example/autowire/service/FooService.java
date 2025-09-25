package com.example.autowire.service;

import com.example.autowire.formatter.Formatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FooService {

    private final Formatter formatter;

    @Autowired
    public FooService(@Qualifier("fooFormatter") Formatter formatter) {
        this.formatter = formatter;
    }

    public String getFormatted() {
        return formatter.format();
    }
}
