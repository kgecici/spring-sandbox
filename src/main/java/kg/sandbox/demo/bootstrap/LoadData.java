package kg.sandbox.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LoadData implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("LoadData is running args:" + Arrays.toString(args));
    }
}
