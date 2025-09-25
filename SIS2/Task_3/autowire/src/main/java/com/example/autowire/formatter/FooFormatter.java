package com.example.autowire.formatter;

import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter implements Formatter {
    @Override
    public String format() {
        return "foo";
    }
}
