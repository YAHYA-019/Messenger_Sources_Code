package com.google.gson;

import X.1BL;
import X.4YW;
import X.5xZ;
import X.AnonymousClass001;
import X.C6f0;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: JsonElement.class */
public abstract class JsonElement {
    public abstract JsonElement deepCopy();

    public BigDecimal getAsBigDecimal() {
        throw 4YW.A08(this);
    }

    public BigInteger getAsBigInteger() {
        throw 4YW.A08(this);
    }

    public boolean getAsBoolean() {
        throw 4YW.A08(this);
    }

    public byte getAsByte() {
        throw 4YW.A08(this);
    }

    public char getAsCharacter() {
        throw 4YW.A08(this);
    }

    public double getAsDouble() {
        throw 4YW.A08(this);
    }

    public float getAsFloat() {
        throw 4YW.A08(this);
    }

    public int getAsInt() {
        throw 4YW.A08(this);
    }

    public JsonArray getAsJsonArray() {
        if (this instanceof JsonArray) {
            return (JsonArray) this;
        }
        throw 1BL.A0h(this, "Not a JSON Array: ", AnonymousClass001.A0k());
    }

    public C6f0 getAsJsonNull() {
        if (this instanceof C6f0) {
            return (C6f0) this;
        }
        throw 1BL.A0h(this, "Not a JSON Null: ", AnonymousClass001.A0k());
    }

    public JsonObject getAsJsonObject() {
        if (this instanceof JsonObject) {
            return (JsonObject) this;
        }
        throw 1BL.A0h(this, "Not a JSON Object: ", AnonymousClass001.A0k());
    }

    public JsonPrimitive getAsJsonPrimitive() {
        if (this instanceof JsonPrimitive) {
            return (JsonPrimitive) this;
        }
        throw 1BL.A0h(this, "Not a JSON Primitive: ", AnonymousClass001.A0k());
    }

    public long getAsLong() {
        throw 4YW.A08(this);
    }

    public Number getAsNumber() {
        throw 4YW.A08(this);
    }

    public short getAsShort() {
        throw 4YW.A08(this);
    }

    public String getAsString() {
        throw 4YW.A08(this);
    }

    public boolean isJsonArray() {
        return this instanceof JsonArray;
    }

    public boolean isJsonNull() {
        return this instanceof C6f0;
    }

    public boolean isJsonObject() {
        return this instanceof JsonObject;
    }

    public boolean isJsonPrimitive() {
        return this instanceof JsonPrimitive;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.A02 = true;
            5xZ.A0F.write(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
