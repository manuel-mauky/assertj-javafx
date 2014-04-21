package eu.lestard.assertj.javafx.api;

import eu.lestard.assertj.javafx.internal.ObservableBooleanValueAssert;
import eu.lestard.assertj.javafx.internal.ObservableNumberValueAssert;
import eu.lestard.assertj.javafx.internal.ObservableStringValueAssert;
import javafx.beans.binding.*;
import javafx.beans.property.*;
import javafx.beans.value.ObservableBooleanValue;
import javafx.beans.value.ObservableNumberValue;
import javafx.beans.value.ObservableStringValue;

public class Assertions {

    // Bindings
    public static BindingAssert assertThat(Binding actual){
        return new BindingAssert(actual);
    }

    public static BooleanBindingAssert assertThat(BooleanBinding actual){
        return new BooleanBindingAssert(actual);
    }

    public static DoubleBindingAssert assertThat(DoubleBinding actual){
        return new DoubleBindingAssert(actual);
    }

    public static FloatBindingAssert assertThat(FloatBinding actual){
        return new FloatBindingAssert(actual);
    }

    public static IntegerBindingAssert assertThat(IntegerBinding actual){
        return new IntegerBindingAssert(actual);
    }

    public static LongBindingAssert assertThat(LongBinding actual){
        return new LongBindingAssert(actual);
    }

    public static StringBindingAssert assertThat(StringBinding actual){
        return new StringBindingAssert(actual);
    }



    // ObservableValues

    public static ObservableNumberValueAssert assertThat(ObservableNumberValue actual){
        return new ObservableNumberValueAssert(actual);
    }

    public static ObservableBooleanValueAssert assertThat(ObservableBooleanValue actual){
        return new ObservableBooleanValueAssert(actual);
    }

    public static ObservableStringValueAssert assertThat(ObservableStringValue actual){
        return new ObservableStringValueAssert(actual);
    }


    // Properties

    public static BooleanPropertyAssert assertThat(BooleanProperty actual){
        return new BooleanPropertyAssert(actual);
    }

    public static DoublePropertyAssert assertThat(DoubleProperty actual){
        return new DoublePropertyAssert(actual);
    }

    public static FloatPropertyAssert assertThat(FloatProperty actual){
        return new FloatPropertyAssert(actual);
    }

    public static IntegerPropertyAssert assertThat(IntegerProperty actual){
        return new IntegerPropertyAssert(actual);
    }

    public static LongPropertyAssert assertThat(LongProperty actual){
        return new LongPropertyAssert(actual);
    }

    public static StringPropertyAssert assertThat(StringProperty actual){
        return new StringPropertyAssert(actual);
    }

    // ReadOnly Properties

    public static ReadOnlyBooleanPropertyAssert assertThat(ReadOnlyBooleanProperty actual){
        return new ReadOnlyBooleanPropertyAssert(actual);
    }

    public static ReadOnlyDoublePropertyAssert assertThat(ReadOnlyDoubleProperty actual){
        return new ReadOnlyDoublePropertyAssert(actual);
    }

    public static ReadOnlyFloatPropertyAssert assertThat(ReadOnlyFloatProperty actual){
        return new ReadOnlyFloatPropertyAssert(actual);
    }

    public static ReadOnlyIntegerPropertyAssert assertThat(ReadOnlyIntegerProperty actual){
        return new ReadOnlyIntegerPropertyAssert(actual);
    }

    public static ReadOnlyLongPropertyAssert assertThat(ReadOnlyLongProperty actual){
        return new ReadOnlyLongPropertyAssert(actual);
    }

    public static ReadOnlyStringPropertyAssert assertThat(ReadOnlyStringProperty actual){
        return new ReadOnlyStringPropertyAssert(actual);
    }





}
