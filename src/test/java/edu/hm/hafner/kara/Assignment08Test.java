package edu.hm.hafner.kara;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.i8k.karalight.world.World;

class Assignment08Test extends AbstractKaraTest {
    @MethodSource
    @ParameterizedTest(name = "{index} => {0} ({1})")
    @DisplayName("Finde das Blatt am Ende des Labyrinths")
    void shouldSolveAssignment(final World start, final World expected) {
        verifyAssignment(start, Assignment08::main, expected);
    }

    static Stream<Arguments> shouldSolveAssignment() {
        return createStreamOfWorlds("08-Gegenüber-Oben", "08-Gegenüber-Unten", "08-Geradeaus", "08-Kompliziert");
    }
}

