package es.upm.dit.apsv.transportationorderserver;

import java.util.logging.Logger;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.upm.dit.apsv.transportationorderserver.repository.TransportationOrderRepository;

@SpringBootApplication
public class TransportationOrderServerApplication {

        public static final org.jboss.logging.Logger log = LoggerFactory.logger(TransportationOrderServerApplication.class);
		
        private TransportationOrderRepository torderRepository;

        public static void main(String[] args) {
                SpringApplication.run(TransportationOrderServerApplication.class, args);
        }

}
