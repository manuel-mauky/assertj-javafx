package eu.lestard.assertj.javafx.api;

import javafx.beans.binding.*;
import javafx.beans.property.*;
import javafx.beans.value.ObservableBooleanValue;
import javafx.beans.value.ObservableNumberValue;
import javafx.beans.value.ObservableObjectValue;
import javafx.beans.value.ObservableStringValue;

/**
 * This is the central entry point for assertions for assertj-javafx.
 *
 * @author Manuel Mauky
 */
public class Assertions {


    /*************************************************************************/
    // Bindings
    /*************************************************************************/


    /**
     * Creates a new instance of <code>{@link BindingAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static BindingAssert assertThat(Binding actual){
        return new BindingAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link BooleanBindingAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static BooleanBindingAssert assertThat(BooleanBinding actual){
        return new BooleanBindingAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link DoubleBindingAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static DoubleBindingAssert assertThat(DoubleBinding actual){
        return new DoubleBindingAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link FloatBindingAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static FloatBindingAssert assertThat(FloatBinding actual){
        return new FloatBindingAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link IntegerBindingAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static IntegerBindingAssert assertThat(IntegerBinding actual){
        return new IntegerBindingAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link LongBindingAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static LongBindingAssert assertThat(LongBinding actual){
        return new LongBindingAssert(actual);
    }


    /**
     * Creates a new instance of <code>{@link StringBindingAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static StringBindingAssert assertThat(StringBinding actual){
        return new StringBindingAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link ObjectBindingAssert}</code>.
     *
     * @param <T> the generic type of the object binding.
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static <T> ObjectBindingAssert<T> assertThat(ObjectBinding<T> actual){
        return new ObjectBindingAssert<>(actual);
    }


    /*************************************************************************/
    // ObservableValues
    /*************************************************************************/


    /**
     * Creates a new instance of <code>{@link ObservableNumberValueAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static ObservableNumberValueAssert assertThat(ObservableNumberValue actual){
        return new ObservableNumberValueAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link ObservableBooleanValueAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static ObservableBooleanValueAssert assertThat(ObservableBooleanValue actual){
        return new ObservableBooleanValueAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link ObservableStringValueAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static ObservableStringValueAssert assertThat(ObservableStringValue actual){
        return new ObservableStringValueAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link ObservableObjectValueAssert}</code>.
     *
     * @param <T> the generic type of the observable object value.
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static <T> ObservableObjectValueAssert<T> assertThat(ObservableObjectValue<T> actual){
        return new ObservableObjectValueAssert<>(actual);
    }


    /*************************************************************************/
    // Properties
    /*************************************************************************/


    /**
     * Creates a new instance of <code>{@link BooleanPropertyAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static BooleanPropertyAssert assertThat(BooleanProperty actual){
        return new BooleanPropertyAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link DoublePropertyAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static DoublePropertyAssert assertThat(DoubleProperty actual){
        return new DoublePropertyAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link FloatPropertyAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static FloatPropertyAssert assertThat(FloatProperty actual){
        return new FloatPropertyAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link IntegerPropertyAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static IntegerPropertyAssert assertThat(IntegerProperty actual){
        return new IntegerPropertyAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link LongPropertyAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static LongPropertyAssert assertThat(LongProperty actual){
        return new LongPropertyAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link StringPropertyAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static StringPropertyAssert assertThat(StringProperty actual){
        return new StringPropertyAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link ObjectPropertyAssert}</code>.
     *
     * @param <T> the generic type of the object property.
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static <T> ObjectPropertyAssert<T> assertThat(ObjectProperty<T> actual){
        return new ObjectPropertyAssert<>(actual);
    }


    /*************************************************************************/
    // ReadOnly Properties
    /*************************************************************************/


    /**
     * Creates a new instance of <code>{@link ReadOnlyBooleanPropertyAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static ReadOnlyBooleanPropertyAssert assertThat(ReadOnlyBooleanProperty actual){
        return new ReadOnlyBooleanPropertyAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link ReadOnlyDoublePropertyAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static ReadOnlyDoublePropertyAssert assertThat(ReadOnlyDoubleProperty actual){
        return new ReadOnlyDoublePropertyAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link ReadOnlyFloatPropertyAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static ReadOnlyFloatPropertyAssert assertThat(ReadOnlyFloatProperty actual){
        return new ReadOnlyFloatPropertyAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link ReadOnlyIntegerPropertyAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static ReadOnlyIntegerPropertyAssert assertThat(ReadOnlyIntegerProperty actual){
        return new ReadOnlyIntegerPropertyAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link ReadOnlyLongPropertyAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static ReadOnlyLongPropertyAssert assertThat(ReadOnlyLongProperty actual){
        return new ReadOnlyLongPropertyAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link ReadOnlyStringPropertyAssert}</code>.
     *
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static ReadOnlyStringPropertyAssert assertThat(ReadOnlyStringProperty actual){
        return new ReadOnlyStringPropertyAssert(actual);
    }

    /**
     * Creates a new instance of <code>{@link ReadOnlyObjectPropertyAssert}</code>.
     *
     * @param <T> the generic type of the object property.
     * @param actual the actual value.
     * @return the created assertion object.
     */
    public static <T> ReadOnlyObjectPropertyAssert<T> assertThat(ReadOnlyObjectProperty<T> actual){
        return new ReadOnlyObjectPropertyAssert<>(actual);
    }

}
