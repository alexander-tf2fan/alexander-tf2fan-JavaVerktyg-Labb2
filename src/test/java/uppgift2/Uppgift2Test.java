package uppgift2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    @DisplayName("Will find a better name for this later")
    void willFindABetterNameForThisLater() {

        assertThat(add.add("//;\n1;2")).isEqualTo(3);
    }

    @Test
    @DisplayName("Sending in a negative will throw an exception with all the negative numbers shown")
    void sendingInANegativeWillThrowAnExceptionWithAllTheNegativeNumbersShown() {

        assertThatThrownBy(() -> add.add("1,2,-3,4,-5")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("Negatives not allowed[-3, -5]");
    }
        

}