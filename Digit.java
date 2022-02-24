package java_synergy;

import lombok.Getter;
import lombok.Setter;

public class Digit implements HasValue {
    @Setter
    @Getter
    @Even(value = 0, message = "Positive")
    int value;

    public void increment(@Even(0) int incrementValue) {
        this.value += incrementValue;
    }

    public Digit(int value) {
        this.value = value;
    }

    public String toString() {
        return "Digit(value=" + this.getValue() + ")";
    }
}
