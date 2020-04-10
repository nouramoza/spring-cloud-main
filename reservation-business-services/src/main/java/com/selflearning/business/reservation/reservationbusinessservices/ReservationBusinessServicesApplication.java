package com.selflearning.business.reservation.reservationbusinessservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages={
        "com.selflearning.business.reservation.reservationbusinessservices.client"
//        , "com.example.application"
})
@EnableDiscoveryClient
@EnableFeignClients
//@EnableFeignClients(basePackages = {"com.selflearning.business.reservation.reservationbusinessservices.client"
//        , "my.local.package"
//})
public class ReservationBusinessServicesApplication {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ReservationBusinessServicesApplication.class, args);
    }

}
