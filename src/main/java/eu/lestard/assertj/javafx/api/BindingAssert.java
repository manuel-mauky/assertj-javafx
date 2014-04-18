package eu.lestard.assertj.javafx.api;

import javafx.beans.Observable;
import javafx.beans.binding.Binding;
import org.assertj.core.api.AbstractAssert;

public class BindingAssert extends AbstractAssert<BindingAssert, Binding> {
    protected BindingAssert(Binding actual) {
        super(actual, BindingAssert.class);
    }

    public BindingAssert dependsOn(Observable value) {
        isNotNull();

        if (value == null) {
            throw new NullPointerException("The given dependency value should not be null");
        }

        if (!actual.getDependencies().contains(value)) {
            failWithMessage("Expected actual binding <%s> to depend on <%s> but it doesn't", actual, value);
        }

        return this;
    }
}
