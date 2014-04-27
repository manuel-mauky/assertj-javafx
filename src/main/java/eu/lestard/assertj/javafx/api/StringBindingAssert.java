package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableStringValueAssertions;
import eu.lestard.assertj.javafx.internal.ObservableValueAssertions;
import javafx.beans.Observable;
import javafx.beans.binding.StringBinding;
import org.assertj.core.api.AbstractAssert;

public class StringBindingAssert extends AbstractAssert<StringBindingAssert, StringBinding> {

    protected StringBindingAssert(StringBinding actual) {
        super(actual, StringBindingAssert.class);
    }


    public StringBindingAssert hasValue(String expectedValue){
        new ObservableStringValueAssertions(actual).hasValue(expectedValue);
        return this;
    }

    public StringBindingAssert dependsOn(Observable observable){
        new BindingAssert(actual).dependsOn(observable);
        return this;
    }

    public StringBindingAssert hasNullValue() {
        new ObservableValueAssertions<>(actual).hasNullValue();
        return this;
    }

    public StringBindingAssert hasNotNullValue() {
        new ObservableValueAssertions<>(actual).hasNotNullValue();
        return this;
    }
}