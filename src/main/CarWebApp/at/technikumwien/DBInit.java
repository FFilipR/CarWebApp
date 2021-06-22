package at.technikumwien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.util.List;

    @Configuration
    public class DBInit
    {

        @Autowired
        private CarRepo carRepo;

        @EventListener(ApplicationReadyEvent.class)
        public void handleApplicationReady()
        {
            carRepo.saveAll(
                    List.of(
                            new Car(Brand.BMW, "X3", 2015),
                            new Car(Brand.OPEL, "VectraC", 2006)
                    )
            );
        }
    }

