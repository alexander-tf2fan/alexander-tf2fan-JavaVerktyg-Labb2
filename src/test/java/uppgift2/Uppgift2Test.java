package uppgift2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

class Uppgift2Test {
    Uppgift2 add = new Uppgift2();

    @Test
    @DisplayName("Send 2 numbers and receive the sum of those 2")
    void send2NumbersAndReceiveTheSumOfThose2() {

        assertThat(add.add("2,5")).isEqualTo(7);

    }

    @Test
    @DisplayName("Send 1 number and receive the same number back")
    void send1NumberAndReceiveTheSameNumberBack() {

        assertThat(add.add("3")).isEqualTo(3);

    }

    @Test
    @DisplayName("Send in an empty string and receive 0")
    void sendInAnEmptyStringAndReceive0() {

        assertThat(add.add("")).isEqualTo(0);
    }

    @Test
    @DisplayName("Send in unknown amount and receive sum of it back")
    void sendInUnknownAmountAndReceiveSumOfItBack() {

        assertThat(add.add("3,8,6,4,3")).isEqualTo(24);
    }

    @Test
    @DisplayName("Sending in numbers with new lines between numbers and receive sum of the numbers")
    void sendingInNumbersWithNewLinesBetweenNumbersAndReceiveSumOfTheNumbers() {

        assertThat(add.add("1\n2,3")).isEqualTo(6);
    }

}