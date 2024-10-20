package com.fasterxml.jackson.databind.ser.std;

import X.28Q;
import X.C26c;
import X.C4Nr;
import X.JQy;
import X.JR0;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Iterator;

/* loaded from: IterableSerializer.class */
public class IterableSerializer extends AsArraySerializerBase {
    public static void A03(28Q r301, C26c c26c, IterableSerializer iterableSerializer, Iterable iterable) {
        JsonSerializer jsonSerializer;
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            C4Nr c4Nr = iterableSerializer._valueTypeSerializer;
            Class<?> cls = null;
            JsonSerializer jsonSerializer2 = null;
            do {
                Object next = it.next();
                if (next == null) {
                    c26c.A0W(r301);
                } else {
                    JsonSerializer jsonSerializer3 = iterableSerializer._elementSerializer;
                    if (jsonSerializer3 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            jsonSerializer2 = c26c.A0N(iterableSerializer._property, cls2);
                            cls = cls2;
                        }
                        jsonSerializer = jsonSerializer2;
                    } else {
                        jsonSerializer = jsonSerializer2;
                        jsonSerializer2 = jsonSerializer3;
                    }
                    JQy.A1J(r301, jsonSerializer2, c26c, c4Nr, next);
                    jsonSerializer2 = jsonSerializer;
                }
            } while (it.hasNext());
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        Iterable iterable = (Iterable) obj;
        Boolean bool = this._unwrapSingle;
        if (((bool == null && JR0.A1T(c26c)) || bool == Boolean.TRUE) && iterable != null) {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                it.next();
                if (!it.hasNext()) {
                    A03(r302, c26c, this, iterable);
                    return;
                }
            }
        }
        r302.A0l(iterable);
        A03(r302, c26c, this, iterable);
        r302.A0X();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        return !((Iterable) obj).iterator().hasNext();
    }
}
