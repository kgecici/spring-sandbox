package kg.sandbox.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ValueService {

    public String getValueFromFile() {
        return valueFromFile;
    }

    public String getValueFromFile2() {
        return valueFromFile2;
    }

    @Value("${kg.value.service}")
    private String valueFromFile;

    @Value("${kg.value.service2:Defaul Value}")
    private String valueFromFile2;

}
