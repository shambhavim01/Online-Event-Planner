package servicelayer;

import java.util.List;

import model.Event;

public class EventService {
    private EventDAO eventDAO;

    public EventService(EventDAO eventDAO) {
        this.eventDAO = eventDAO;
    }

    public Event createEvent(Event event) {
        // Implement validation or business logic here
        return eventDAO.createEvent(event);
    }

    public Event getEventById(int eventId) {
        // Implement validation or business logic here
        return eventDAO.getEventById(eventId);
    }

    public List<Event> getAllEvents() {
        // Implement validation or business logic here
        return eventDAO.getAllEvents();
    }

    public Event updateEvent(Event event) {
        // Implement validation or business logic here
        return eventDAO.updateEvent(event);
    }

    public void deleteEvent(int eventId) {
        // Implement validation or business logic here
        eventDAO.deleteEvent(eventId);
    }
}

