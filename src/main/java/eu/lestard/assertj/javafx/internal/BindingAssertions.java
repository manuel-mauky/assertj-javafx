package eu.lestard.assertj.javafx.internal;

import javafx.beans.Observable;
import javafx.beans.binding.Binding;
import org.assertj.core.api.AbstractAssert;

public class BindingAssertions<T> extends AbstractAssert<BindingAssertions<T>, Binding<T>> {

    public BindingAssertions(Binding<T> actual) {
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

    public  void hasValue(T expectedValue) {
        isNotNull();

        if(expectedValue == null){
            failWithMessage("The expected value may not be null");
        }

        if(!expectedValue.equals(actual.getValue())){
            failWithMessage("Actual binding should have the value <%s> but was <%s>", expectedValue,actual.getValue());
        }
    }

    public void hasNullValue(){
        isNotNull();

        if(actual.getValue() != null){
            failWithMessage("Expected binding to have a value of null but was <%s>", actual.getValue());
        }

    }

    public void hasNotNullValue(){
        isNotNull();

        if(actual.getValue() == null){
            failWithMessage("Expected binding to not have a value of null");
        }
    }
}