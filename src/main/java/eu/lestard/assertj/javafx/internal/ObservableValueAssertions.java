package eu.lestard.assertj.javafx.internal;

import javafx.beans.value.ObservableValue;
import org.assertj.core.api.AbstractAssert;

public class ObservableValueAssertions <T> extends AbstractAssert<ObservableValueAssertions<T>, ObservableValue<T>> {

    public ObservableValueAssertions(ObservableValue<T> actual) {
        super(actual, ObservableValueAssertions.class);
    }

    public void hasNullValue() {
        isNotNull();

        if(actual.getValue() != null){
            failWithMessage("Expected observable to have a value of null but was <%s>", actual.getValue());
        }

    }

    public void hasNotNullValue() {
        isNotNull();

        if(actual.getValue() == null){
            failWithMessage("Expected observable to not have a value of null");
        }
    }
}