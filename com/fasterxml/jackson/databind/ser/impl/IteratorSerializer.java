package com.fasterxml.jackson.databind.ser.impl;

import X.24S;
import X.28Q;
import X.C26c;
import X.C4Nr;
import X.JQy;
import X.L2s;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.Iterator;

/* loaded from: IteratorSerializer.class */
public class IteratorSerializer extends AsArraySerializerBase {
    public static void A03(28Q r301, C26c c26c, IteratorSerializer iteratorSerializer, Iterator it) {
        L2s A01;
        if (it.hasNext()) {
            JsonSerializer jsonSerializer = iteratorSerializer._elementSerializer;
            if (jsonSerializer != null) {
                C4Nr c4Nr = iteratorSerializer._valueTypeSerializer;
                do {
                    Object next = it.next();
                    if (next == null) {
                        c26c.A0W(r301);
                    } else {
                        JQy.A1J(r301, jsonSerializer, c26c, c4Nr, next);
                    }
                } while (it.hasNext());
                return;
            }
            C4Nr c4Nr2 = iteratorSerializer._valueTypeSerializer;
            L2s l2s = iteratorSerializer._dynamicSerializers;
            do {
                Object next2 = it.next();
                if (next2 == null) {
                    c26c.A0W(r301);
                } else {
                    Class<?> cls = next2.getClass();
                    JsonSerializer A00 = l2s.A00(cls);
                    if (A00 == null) {
                        24S r0 = iteratorSerializer._elementType;
                        if (r0.A0L()) {
                            24S A0F = c26c.A0F(r0, cls);
                            A00 = c26c.A0G(iteratorSerializer._property, A0F);
                            A01 = l2s.A01(A00, A0F._class);
                        } else {
                            A00 = c26c.A0L(iteratorSerializer._property, cls);
                            A01 = l2s.A01(A00, cls);
                        }
                        if (l2s != A01) {
                            iteratorSerializer._dynamicSerializers = A01;
                        }
                        l2s = iteratorSerializer._dynamicSerializers;
                    }
                    JQy.A1J(r301, A00, c26c, c4Nr2, next2);
                }
            } while (it.hasNext());
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        Iterator it = (Iterator) obj;
        r302.A0l(it);
        A03(r302, c26c, this, it);
        r302.A0X();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        return !((Iterator) obj).hasNext();
    }
}
