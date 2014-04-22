package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableStringValueAssert;
import javafx.beans.Observable;
import javafx.beans.binding.StringBinding;
import org.assertj.core.api.AbstractAssert;

public class StringBindingAssert extends AbstractAssert<StringBindingAssert, StringBinding> {

    protected StringBindingAssert(StringBinding actual) {
        super(actual, StringBindingAssert.class);
    }


    public StringBindingAssert hasValue(String expectedValue){
        new ObservableStringValueAssert(actual).hasValue(expectedValue);
        return this;
    }

    public StringBindingAssert dependsOn(Observable observable){
        new BindingAssert(actual).dependsOn(observable);
        return this;
    }
}