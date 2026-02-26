package com.spring.cloud.lib.cloud_functions_aws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class SpringCloudFunction {

    @Bean
    public Supplier<PaymentProcessRequest> paymentProcessRequestSupplier() {
        return () -> {
            PaymentProcessRequest request = new PaymentProcessRequest();
            request.setAmount(100.0);
            request.setCurrency("USD");
            request.setPaymentMethod("CreditCard");
            return request;
        };
    }

    @Bean
    public Function<String, PaymentProcessRequest> paymentProcessRequestFn() {
        return (input) -> {
            PaymentProcessRequest request = new PaymentProcessRequest();
            request.setAmount(100.0);
            request.setCurrency("USD");
            request.setPaymentMethod("Function");
            return request;
        };
    }

}
