package com.example.springsoap.beans;

import com.example.springsoap.client.gen.Country;
import com.example.springsoap.client.gen.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        // initialize countries map
          countries.put("india",new Country("India",1000," New Delhi", Currency.EUR));

    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}