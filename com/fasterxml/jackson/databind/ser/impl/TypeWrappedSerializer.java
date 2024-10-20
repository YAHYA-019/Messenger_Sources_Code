package com.fasterxml.jackson.databind.ser.impl;

import X.28Q;
import X.68U;
import X.C26c;
import X.C27r;
import X.C4Nr;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: TypeWrappedSerializer.class */
public final class TypeWrappedSerializer extends JsonSerializer implements C27r {
    public final JsonSerializer A00;
    public final C4Nr A01;

    public TypeWrappedSerializer(JsonSerializer jsonSerializer, C4Nr c4Nr) {
        this.A01 = c4Nr;
        this.A00 = jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        this.A00.A09(r302, c26c, c4Nr, obj);
    }

    @Override // X.C27r
    public JsonSerializer AJN(68U r302, C26c c26c) {
        JsonSerializer jsonSerializer = this.A00;
        if (jsonSerializer instanceof C27r) {
            jsonSerializer = c26c.A0K(r302, jsonSerializer);
        }
        if (jsonSerializer == jsonSerializer) {
            return this;
        }
        return new TypeWrappedSerializer(jsonSerializer, this.A01);
    }
}
