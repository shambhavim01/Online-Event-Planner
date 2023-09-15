package servicelayer;

import java.util.List;

import model.Event;

public interface EventDAO {
	    Event createEvent(Event event);
	    Event getEventById(int eventId);
	    List<Event> getAllEvents();
	    Event updateEvent(Event event);
	    void deleteEvent(int eventId);
	}



