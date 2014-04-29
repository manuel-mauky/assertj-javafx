package eu.lestard.assertj.javafx.internal;

import javafx.beans.property.Property;
import org.assertj.core.api.AbstractAssert;

public class PropertyAssertions extends AbstractAssert<PropertyAssertions, Property> {

    public PropertyAssertions(Property actual) {
        super(actual, PropertyAssertions.class);
    }

    public void isBound(){
        isNotNull();

        if(!actual.isBound()){
            failWithMessage("Expecting actual to be bound but was not.");
        }
    }

}