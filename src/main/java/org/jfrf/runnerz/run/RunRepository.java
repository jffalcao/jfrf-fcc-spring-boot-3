package org.jfrf.runnerz.run;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository 
public class RunRepository {
    
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

   Optional<Run> findById(Integer id) {
        return runs.stream()
                .filter(run -> run.id()==id)
                .findFirst();
    }

    void create (Run run) {
        runs.add(run);
    }

    void update (Run run) {
        Optional<Run> existingRun = findById(run.id());
        if(existingRun.isEmpty()) {
            throw new IllegalArgumentException("Run not found.");
        }
            runs.remove(existingRun.get());
            runs.add(run);
        }
    
     void delete (Integer id) {
        Optional<Run> existingRun = findById(id);
        if(existingRun.isEmpty()) {
            throw new IllegalArgumentException("Run not found.");
        }
        runs.remove(existingRun.get());
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.INDOOR));
        runs.add(new Run(2, "Second Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR));
    }
}
