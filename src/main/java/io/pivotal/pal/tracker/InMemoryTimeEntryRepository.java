package io.pivotal.pal.tracker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    TimeEntry timeEntry;

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        this.timeEntry = timeEntry;
        return timeEntry;
    }

    @Override
    public TimeEntry find(Long timeEntryId) {
        if (timeEntry.getId() != timeEntryId) {
            return timeEntry;
        } else {
            return null;
        }
    }

    @Override
    public List<TimeEntry> list() {
        return null;
    }

    @Override
    public TimeEntry update(Long timeEntryId, TimeEntry timeEntry) {
        return null;
    }

    @Override
    public TimeEntry delete(Long timeEntryId) {
        return null;
    }
}
