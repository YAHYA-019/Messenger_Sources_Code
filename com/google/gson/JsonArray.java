package com.google.gson;

import X.4YV;
import X.AnonymousClass001;
import X.C6f0;
import X.LyE;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: JsonArray.class */
public final class JsonArray extends JsonElement implements Iterable {
    public final ArrayList elements;

    public JsonArray() {
        this.elements = AnonymousClass001.A0s();
    }

    public JsonArray(int i) {
        this.elements = AnonymousClass001.A0t(i);
    }

    private JsonElement getAsSingleElement() {
        ArrayList arrayList = this.elements;
        int size = arrayList.size();
        if (size == 1) {
            return (JsonElement) arrayList.get(0);
        }
        throw 4YV.A0h("Array must have size 1, but has size ", size);
    }

    public void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = C6f0.A00;
        }
        this.elements.add(jsonElement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.6f0] */
    public void add(Boolean bool) {
        this.elements.add(bool == null ? C6f0.A00 : new JsonPrimitive(bool));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.6f0] */
    public void add(Character ch) {
        this.elements.add(ch == null ? C6f0.A00 : new JsonPrimitive(ch));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.6f0] */
    public void add(Number number) {
        this.elements.add(number == null ? C6f0.A00 : new JsonPrimitive(number));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.6f0] */
    public void add(String str) {
        this.elements.add(str == null ? C6f0.A00 : new JsonPrimitive(str));
    }

    public void addAll(JsonArray jsonArray) {
        this.elements.addAll(jsonArray.elements);
    }

    public List asList() {
        return new LyE(this.elements);
    }

    public boolean contains(JsonElement jsonElement) {
        return this.elements.contains(jsonElement);
    }

    @Override // com.google.gson.JsonElement
    public JsonArray deepCopy() {
        JsonArray jsonArray;
        ArrayList arrayList = this.elements;
        if (arrayList.isEmpty()) {
            jsonArray = new JsonArray();
        } else {
            jsonArray = new JsonArray(arrayList.size());
            Iterator it = this.elements.iterator();
            while (it.hasNext()) {
                jsonArray.add(((JsonElement) it.next()).deepCopy());
            }
        }
        return jsonArray;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonArray) && ((JsonArray) obj).elements.equals(this.elements);
        }
        return true;
    }

    public JsonElement get(int i) {
        return (JsonElement) this.elements.get(i);
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        return getAsSingleElement().getAsBigDecimal();
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        return getAsSingleElement().getAsBigInteger();
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        return getAsSingleElement().getAsBoolean();
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        return getAsSingleElement().getAsByte();
    }

    @Override // com.google.gson.JsonElement
    public char getAsCharacter() {
        return getAsSingleElement().getAsCharacter();
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        return getAsSingleElement().getAsDouble();
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        return getAsSingleElement().getAsFloat();
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        return getAsSingleElement().getAsInt();
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        return getAsSingleElement().getAsLong();
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        return getAsSingleElement().getAsNumber();
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        return getAsSingleElement().getAsShort();
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        return getAsSingleElement().getAsString();
    }

    public int hashCode() {
        return this.elements.hashCode();
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.elements.iterator();
    }

    public JsonElement remove(int i) {
        return (JsonElement) this.elements.remove(i);
    }

    public boolean remove(JsonElement jsonElement) {
        return this.elements.remove(jsonElement);
    }

    public JsonElement set(int i, JsonElement jsonElement) {
        ArrayList arrayList = this.elements;
        if (jsonElement == null) {
            jsonElement = C6f0.A00;
        }
        return (JsonElement) arrayList.set(i, jsonElement);
    }

    public int size() {
        return this.elements.size();
    }
}
