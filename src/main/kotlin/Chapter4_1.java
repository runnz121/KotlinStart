import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public class Chapter4_1 {


    public static class Money implements Comparable<Money>{
        private final Integer money;

        public Money(Integer money) {
            this.money = money;
        }

        @Override
        public int compareTo(@NotNull Money o) {
            return Long.compare(this.money, o.money);
        }

        @Override
        public int hashCode() {
            return Objects.hash(money);
        }

        @Override
        public String toString() {
            return "Money{" + "money=" + money +"}";
        }
    }
}
