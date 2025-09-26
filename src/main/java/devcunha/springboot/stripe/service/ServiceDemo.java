package devcunha.springboot.stripe.service;

import com.stripe.StripeClient;
import devcunha.springboot.stripe.config.StripeProperties;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ServiceDemo {

    private final String stripeAccountId;

    @PostConstruct
    void init(){
        log.info(">>> Stripe Account Id {}", stripeAccountId);
    }

}
