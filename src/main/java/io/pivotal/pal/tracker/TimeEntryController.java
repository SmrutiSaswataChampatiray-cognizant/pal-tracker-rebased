package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TimeEntryController {

    private TimeEntryRepository timeEntryRepository;

    public TimeEntryController(TimeEntryRepository timeEntryRepository){
        this.timeEntryRepository = timeEntryRepository;
    }

    @PostMapping (value="/time-entries")
    public ResponseEntity create(@RequestBody TimeEntry timeEntry) {
        System.out.println("In Sample Controller");
        return null;
    }

    @GetMapping (value="/time-entries")
    public ResponseEntity list() {
        return null;
    }

    @GetMapping (value="/time-entries/{id}")
    public ResponseEntity read(@PathVariable Long id) {
        System.out.println("In Sample Controller");
        return null;
    }


    @PutMapping (value="/time-entries/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody TimeEntry timeEntry) {

        return null;
    }

    @DeleteMapping (value="/time-entries/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return null;
    }

    /*@PostMapping (value="/time-entries")
    public ResponseEntity createTimeEntry() {
        return null;
    }*/
}
