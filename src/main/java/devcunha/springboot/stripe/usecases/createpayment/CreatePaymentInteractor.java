package devcunha.springboot.stripe.usecases.createpayment;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreatePaymentInteractor {

    private final String stripeAccountId;

    @PostConstruct
    void init(){
        log.info(">>> Stripe Account Id {}", stripeAccountId);
    }

}
