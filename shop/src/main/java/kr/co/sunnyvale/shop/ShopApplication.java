package kr.co.sunnyvale.shop;

import kr.co.sunnyvale.shop.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication implements CommandLineRunner {
    @Value("${name}")
    private String name;

    @Autowired
    MyConfig myConfig;


    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("==================");
        System.out.println(name);
        System.out.println(myConfig.getName().getFirst());
        System.out.println("==================");
    }
}
