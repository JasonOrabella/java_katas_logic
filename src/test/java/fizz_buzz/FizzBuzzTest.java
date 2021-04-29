package fizz_buzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FizzBuzzTest {
    @Test
    public void whenGiven1FizzBuzzSays1() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(1);
        assertThat(spokenWord).isEqualTo("1");
    }
}
