package co.pragra.learning.springboot1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("prod")
public class ProdConfig {
    @Bean
    public Car car(
            @Value("${car.make}") String make,
            @Value("${car.model}") String model
            ){
        return new Car(make,model);
    }
}
