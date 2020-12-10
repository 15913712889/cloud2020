import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestJava8Time {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
    }
}
