package gdts.common.data.type;

import gdts.common.data.VarType;

import java.io.Serializable;

/**
 * Klasa bazowa dla wszystkich klas zmiennych.
 * 
 * @author Maciej Milczarek
 */
public abstract class Variable implements Serializable {

    private static final long serialVersionUID = 9199816576855273015L;

    public abstract void setValue(Variable value);

    public abstract Variable duplicate();

    public abstract boolean isNull();

    private final static String INT_REGEX = "^-?[0-9]+$";
    private final static String STRING_REGEX = "^\".*\"$";
    private final static String FLOAT_REGEX = "^(-?[0-9])*\\.?[0-9]+$";
    private final static String BOOLEAN_REGEX = "^(TRUE)|(FALSE)$";

    /**
     * Tworzy pustą zmienną typu o podanej nazwie.
     * 
     * @param typeName
     *            Nazwa typu zmiennej.
     * @return Obiekt zmiennej.
     */
    public static final Variable createSimple(String typeName) {
        return createSimple(VarType.getVarType(typeName));
    }

    /**
     * Tworzy pustą zmienną podanego typu.
     * 
     * @param typeName
     *            Typ zmiennej.
     * @return Obiekt zmiennej.
     */
    public static final Variable createSimple(VarType type) {

        Class<? extends Variable> clazz = VarType.getVarClass(type);

        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Tworzy pustą zmienną kontenerową służącą do przechowywania określonego typu zmiennych.
     * 
     * @param typeName
     *            Nazwa typu zmiennej kontenerowej.
     * @param elementTypeName
     *            Nazwa typu przechowywanych danych.
     * @return Pusta zmienna kontenerowa stworzona wg parametrów.
     */
    public static final VContainer createContainer(String typeName, String elementTypeName) {
        return createContainer(VarType.getVarType(typeName), VarType.getVarType(elementTypeName));
    }

    /**
     * Tworzy pustą zmienną kontenerową służącą do przechowywania określonego typu zmiennych.
     * 
     * @param typeName
     *            Typ zmiennej kontenerowej.
     * @param elementTypeName
     *            Typ przechowywanych danych.
     * @return Pusta zmienna kontenerowa stworzona wg parametrów.
     */
    public static final VContainer createContainer(VarType type, VarType elementType) {
        @SuppressWarnings("unchecked")
        Class<? extends VContainer> clazz = (Class<? extends VContainer>) VarType.getVarClass(type);
        // Class<? extends Variable> elementClass = VarType.getVarClass(type);

        try {
            return clazz.getConstructor(VarType.class).newInstance(elementType);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Tworzy zmienną na podstawie wartości i przypisuje podaną wartość do zmiennej.
     * 
     * @param value
     *            Wartość.
     * @return Zmienna odpowiedniego typu z przypisaną wartością.
     */
    public static final Variable createByValue(String value) {

        if (value.matches(INT_REGEX)) {

            VInteger intVar = (VInteger) Variable.createSimple(VarType.INTEGER);
            intVar.setValue(new VInteger(Long.valueOf(value)));

            return intVar;
        }
        if (value.matches(STRING_REGEX)) {
            return new VString(value.substring(1, value.length() - 1));
        }
        if (value.matches(FLOAT_REGEX)) {
            VFloat floatVar = (VFloat) Variable.createSimple(VarType.FLOAT);
            floatVar.setValue(new VFloat(Double.parseDouble(value)));

            return floatVar;
        }
        if (value.matches(BOOLEAN_REGEX)) {
            VBoolean booleanVar = (VBoolean) Variable.createSimple(VarType.BOOLEAN);
            booleanVar.setValue(new VBoolean(Boolean.parseBoolean(value.toLowerCase())));

            return booleanVar;
        }

        return null;
    }

    @Override
    public String toString() {
        if (this.getClass() == Variable.class) {
            return "Pure Variable class! Did you implemented toString() in subclass?";
        }
        return this.toString();
    }
}
