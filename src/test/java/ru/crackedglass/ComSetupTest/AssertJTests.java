package ru.crackedglass.ComSetupTest;

import org.springframework.boot.test.context.SpringBootTest;

import ru.crackedglass.ComSetupTest.model.User;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class AssertJTests {

    @Test
    @DisplayName("Проверка сравнения по полям")
    void compareByField() {
        User u1 = new User("Vasiliy", "Pupkin", 1000);
        User u2 = new User("Vasiliy", "Pupkin", 1000);
        assertThat(u1).usingRecursiveComparison().isEqualTo(u2);
    }

    @Test
    @DisplayName("Проверка сравнения по ссылке")
    void compareByLink() {
        User u1 = new User("Ivan", "Ivanov", 100);
        User u2 = u1;
        assertThat(u1).isEqualTo(u2);
    }

    @Test
    @DisplayName("Булевые проверки")
    void booleanAssertion() {
        assertThat("".isEmpty()).isTrue();
        assertThat("sf".isEmpty()).isFalse();
    }

    @Test
    @DisplayName("Проверки с iterable")
    void iterableAssertions() {
        List<String> list = List.of("Jam", "Ham", "Hummam", "Hookah");
        assertThat(list).contains("Ham");
        assertThat(list).isNotEmpty();
        assertThat(list).startsWith("Jam");
        assertThat(list).containsSubsequence("Hummam", "Hookah");

        List<String> list2 = List.of("Ham", "Hummam", "Hookah", "Jam");
        assertThat(list).usingRecursiveComparison().ignoringCollectionOrder().isEqualTo(list2);
    }

}
