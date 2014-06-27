package eu.lestard.assertj.javafx.api;

import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import org.junit.Test;

import static eu.lestard.assertj.javafx.api.Assertions.*;
import static org.assertj.core.data.Offset.offset;

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

    @Test
    public void testNumberBindingWithOffset(){

        DoubleProperty valueA = new SimpleDoubleProperty(0.1);
        DoubleProperty valueB = new SimpleDoubleProperty(0.2);

        final NumberBinding binding = valueA.add(valueB);

        assertThat(binding).hasValue(0.3, offset(0.001));
    }
}
