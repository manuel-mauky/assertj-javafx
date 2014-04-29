package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.BindingAssertions;
import javafx.beans.Observable;
import javafx.beans.binding.Binding;
import org.assertj.core.api.AbstractAssert;

public class BindingAssert extends AbstractAssert<BindingAssert, Binding> {
    protected BindingAssert(Binding actual) {
        super(actual, BindingAssert.class);
    }

    public BindingAssert dependsOn(Observable value) {
        new BindingAssertions(actual).dependsOn(value);
        return this;
    }
}
