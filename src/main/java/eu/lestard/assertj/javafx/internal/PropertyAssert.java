package eu.lestard.assertj.javafx.internal;

import javafx.beans.property.Property;
import org.assertj.core.api.AbstractAssert;

public class PropertyAssert extends AbstractAssert<PropertyAssert, Property> {

    public PropertyAssert(Property actual) {
        super(actual, PropertyAssert.class);
    }

    public void isBound(){
        isNotNull();

        if(!actual.isBound()){
            failWithMessage("Expecting actual to be bound but was not.");
        }
    }
}
