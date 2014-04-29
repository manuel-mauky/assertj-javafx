package eu.lestard.assertj.javafx.internal;

import javafx.beans.Observable;
import javafx.beans.binding.Binding;
import org.assertj.core.api.AbstractAssert;

public class BindingAssertions extends AbstractAssert<BindingAssertions, Binding> {

    public BindingAssertions(Binding actual) {
        super(actual, BindingAssertions.class);
    }

    public void dependsOn(Observable value) {
        isNotNull();

        if (value == null) {
            throw new NullPointerException("The given dependency value should not be null");
        }

        if (!actual.getDependencies().contains(value)) {
            failWithMessage("Expected actual binding <%s> to depend on <%s> but it doesn't", actual, value);
        }
    }
}