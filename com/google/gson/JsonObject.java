package com.google.gson;

import X.AnonymousClass001;
import X.C6ex;
import X.C6f0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: JsonObject.class */
public final class JsonObject extends JsonElement {
    public final C6ex members = new C6ex(false);

    public void add(String str, JsonElement jsonElement) {
        C6ex c6ex = this.members;
        if (jsonElement == null) {
            jsonElement = C6f0.A00;
        }
        c6ex.put(str, jsonElement);
    }

    public void addProperty(String str, Boolean bool) {
        add(str, bool == null ? C6f0.A00 : new JsonPrimitive(bool));
    }

    public void addProperty(String str, Character ch) {
        add(str, ch == null ? C6f0.A00 : new JsonPrimitive(ch));
    }

    public void addProperty(String str, Number number) {
        add(str, number == null ? C6f0.A00 : new JsonPrimitive(number));
    }

    public void addProperty(String str, String str2) {
        add(str, str2 == null ? C6f0.A00 : new JsonPrimitive(str2));
    }

    public Map asMap() {
        return this.members;
    }

    @Override // com.google.gson.JsonElement
    public JsonObject deepCopy() {
        JsonObject jsonObject = new JsonObject();
        Iterator A0x = AnonymousClass001.A0x(this.members);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            jsonObject.add(AnonymousClass001.A0j(A0z), ((JsonElement) A0z.getValue()).deepCopy());
        }
        return jsonObject;
    }

    public Set entrySet() {
        return this.members.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonObject) && ((JsonObject) obj).members.equals(this.members);
        }
        return true;
    }

    public JsonElement get(String str) {
        return (JsonElement) this.members.get(str);
    }

    public JsonArray getAsJsonArray(String str) {
        return (JsonArray) this.members.get(str);
    }

    public JsonObject getAsJsonObject(String str) {
        return (JsonObject) this.members.get(str);
    }

    public JsonPrimitive getAsJsonPrimitive(String str) {
        return (JsonPrimitive) this.members.get(str);
    }

    public boolean has(String str) {
        return this.members.containsKey(str);
    }

    public int hashCode() {
        return this.members.hashCode();
    }

    public boolean isEmpty() {
        return AnonymousClass001.A1O(this.members.size());
    }

    public Set keySet() {
        return this.members.keySet();
    }

    public JsonElement remove(String str) {
        return (JsonElement) this.members.remove(str);
    }

    public int size() {
        return this.members.size();
    }
}
