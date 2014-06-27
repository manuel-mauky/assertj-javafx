package eu.lestard.assertj.javafx.api;

import javafx.beans.binding.NumberBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import org.junit.Test;


import static eu.lestard.assertj.javafx.api.Assertions.*;

/**
 * This test is used to find problems with overlapping parameter types.
 */
public class NumberTest {

    @Test
    public void testNumberBinding(){

        IntegerProperty valueA = new SimpleIntegerProperty(10);
        IntegerProperty valueB = new SimpleIntegerProperty(20);

        final NumberBinding binding = valueA.add(valueB);


        assertThat(binding).hasValue(30);

        assertThat(binding).dependsOn(valueA);

    }
}
