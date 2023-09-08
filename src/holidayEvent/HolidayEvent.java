package holidayEvent;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HolidayEvent {

    static HashMap<String, Set<HolidayEvent>> eventsBySeason = new HashMap();

    private String eventName;

    static {
        System.out.println("Static block initialization");
    }

    public HolidayEvent(String eventName) {
        Set<HolidayEvent> events = new HashSet<>();
        eventsBySeason.put("Весна", events);
        eventsBySeason.put("Лето", events);
        eventsBySeason.put("Осень", events);
        eventsBySeason.put("Зима", events);

        this.eventName = eventName;
    }

    public static void main(String[] args) {
        HolidayEvent birthday = new HolidayEvent("День рождения");
        HolidayEvent newYear = new HolidayEvent("Новый год");

        eventsBySeason.get("Осень").add(birthday);
        eventsBySeason.get("Зима").add(newYear);
        System.out.println(eventsBySeason);
    }
}