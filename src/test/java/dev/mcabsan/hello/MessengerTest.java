package dev.mcabsan.hello;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessengerTest {

    @Nested
    @DisplayName("say")
    class Say {

        @Test
        public void when_no_message_is_provided_the_messenger_should_say_Hello_world() {
            Messenger messenger = new Messenger();
            String actual = messenger.say();

            assertEquals("Hello world!", actual);
        }

        @ParameterizedTest
        @ValueSource(strings = {"¡Hola mundo!", "Kaixo Mundua!", "Hola Món!"})
        public void when_a_message_is_provided_the_messenger_should_say_the_same_message(String message) {
            Messenger messenger = new Messenger(message);
            String actual = messenger.say();

            assertEquals(message, actual);
        }
    }
}
