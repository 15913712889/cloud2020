import org.junit.jupiter.api.Test;
import sun.awt.CustomCursor;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.chrono.Chronology;
import java.time.temporal.TemporalField;
import java.util.function.Consumer;

public class TestJava8Time {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
    }

    @Test
    public void demo1(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek);
        Chronology chronology = now.getChronology();
        System.out.println(chronology);
        Consumer<LocalDateTime> s = System.out::println;
        s.accept(now);
    }
}
