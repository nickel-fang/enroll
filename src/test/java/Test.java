import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 15:26
 */
public class Test {
    public static void main(String[] args) {
        LocalDateTime startTime = LocalDateTime.parse("2020-08-21T12:00:00");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.isAfter(startTime));
    }
}
