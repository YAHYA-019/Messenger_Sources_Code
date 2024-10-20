package com.google.gson;

import X.AnonymousClass001;
import X.KR3;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: JsonPrimitive.class */
public final class JsonPrimitive extends JsonElement {
    public final Object value;

    public JsonPrimitive(Boolean bool) {
        bool.getClass();
        this.value = bool;
    }

    public JsonPrimitive(Character ch) {
        ch.getClass();
        this.value = ch.toString();
    }

    public JsonPrimitive(Number number) {
        number.getClass();
        this.value = number;
    }

    public JsonPrimitive(String str) {
        str.getClass();
        this.value = str;
    }

    public static boolean isIntegral(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.value;
        boolean z = false;
        if ((obj instanceof Number) && ((obj instanceof BigInteger) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte))) {
            z = true;
        }
        return z;
    }

    @Override // com.google.gson.JsonElement
    public /* bridge */ /* synthetic */ JsonElement deepCopy() {
        return this;
    }

    @Override // com.google.gson.JsonElement
    public JsonPrimitive deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
            Object obj2 = this.value;
            if (obj2 == null) {
                if (jsonPrimitive.value != null) {
                    return false;
                }
            } else {
                if (isIntegral(this) && isIntegral(jsonPrimitive)) {
                    return getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue();
                }
                if (!(obj2 instanceof Number) || !(jsonPrimitive.value instanceof Number)) {
                    return obj2.equals(jsonPrimitive.value);
                }
                double doubleValue = getAsNumber().doubleValue();
                double doubleValue2 = jsonPrimitive.getAsNumber().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
            }
        }
        return true;
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        Object obj = this.value;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        Object obj = this.value;
        return obj instanceof BigInteger ? (BigInteger) obj : new BigInteger(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        Object obj = this.value;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        return this.value instanceof Number ? getAsNumber().byteValue() : Byte.parseByte(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public char getAsCharacter() {
        String asString = getAsString();
        if (asString.isEmpty()) {
            throw AnonymousClass001.A0q("String value is empty");
        }
        return asString.charAt(0);
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        return this.value instanceof Number ? getAsNumber().doubleValue() : Double.parseDouble(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        return this.value instanceof Number ? getAsNumber().floatValue() : Float.parseFloat(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        return this.value instanceof Number ? getAsNumber().intValue() : Integer.parseInt(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        return this.value instanceof Number ? getAsNumber().longValue() : Long.parseLong(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        Object obj = this.value;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new KR3((String) obj);
        }
        throw AnonymousClass001.A0q("Primitive is neither a number nor a string");
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        return this.value instanceof Number ? getAsNumber().shortValue() : Short.parseShort(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        Object obj = this.value;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            obj = getAsNumber();
        } else if (!(obj instanceof Boolean)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Unexpected value type: ");
            throw new AssertionError(AnonymousClass001.A0a(obj.getClass(), A0k));
        }
        return obj.toString();
    }

    public int hashCode() {
        long doubleToLongBits;
        Object obj = this.value;
        if (obj == null) {
            return 31;
        }
        if (isIntegral(this)) {
            doubleToLongBits = getAsNumber().longValue();
        } else {
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean isBoolean() {
        return this.value instanceof Boolean;
    }

    public boolean isNumber() {
        return this.value instanceof Number;
    }

    public boolean isString() {
        return this.value instanceof String;
    }
}
