package no.accelerate.jdbc_assignment2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PgAppRunner implements CommandLineRunner {

    final ChinookDAO chinookDAO;

    public PgAppRunner(ChinookDAO chinookDAO) {
        this.chinookDAO = chinookDAO;
    }

    @Override
    public void run(String... args) throws Exception {
        chinookDAO.testConnection();
    }
}
