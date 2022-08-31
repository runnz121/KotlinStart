import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {

    private final String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    //@Nullable
    @NotNull
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
