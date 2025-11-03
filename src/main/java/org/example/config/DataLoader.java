package org.example.config;

import org.example.model.Person;
import org.example.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PersonRepository repo;

    public DataLoader(PersonRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        if (repo.count() == 0) {
            repo.save(new Person("Kiss", "János", 28));
            repo.save(new Person("Nagy", "Anna", 34));
            repo.save(new Person("Tóth", "Gábor", 41));
            repo.save(new Person("Szabó", "László", 25));
            repo.save(new Person("Farkas", "Dóra", 30));
            repo.save(new Person("Varga", "Bence", 22));
            repo.save(new Person("Kovács", "Máté", 36));
            repo.save(new Person("Balogh", "Eszter", 29));
            repo.save(new Person("Molnár", "Tímea", 33));
            repo.save(new Person("Horváth", "Zoltán", 27));
        }
    }
}