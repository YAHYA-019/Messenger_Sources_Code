package com.google.gson;

import X.1BL;
import X.AnonymousClass001;
import X.C6f4;
import X.JRN;
import X.KE2;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

/* loaded from: TypeAdapter.class */
public abstract class TypeAdapter {
    public final Object fromJson(Reader reader) {
        return read(new JsonReader(reader));
    }

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final Object fromJsonTree(JsonElement jsonElement) {
        try {
            return read(new KE2(jsonElement));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final TypeAdapter nullSafe() {
        return new JRN(this);
    }

    public abstract Object read(JsonReader jsonReader);

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void toJson(Writer writer, Object obj) {
        write(new JsonWriter(writer), obj);
    }

    public final JsonElement toJsonTree(Object obj) {
        try {
            C6f4 c6f4 = new C6f4();
            write(c6f4, obj);
            List list = c6f4.A02;
            if (list.isEmpty()) {
                return c6f4.A00;
            }
            throw 1BL.A0h(list, "Expected one JSON element but was ", AnonymousClass001.A0k());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void write(JsonWriter jsonWriter, Object obj);
}
