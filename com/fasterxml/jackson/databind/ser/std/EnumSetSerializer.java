package com.fasterxml.jackson.databind.ser.std;

import X.28Q;
import X.C26c;
import X.JR0;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.AbstractCollection;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: EnumSetSerializer.class */
public class EnumSetSerializer extends AsArraySerializerBase {
    public static void A03(28Q r301, C26c c26c, EnumSetSerializer enumSetSerializer, EnumSet enumSet) {
        JsonSerializer jsonSerializer = enumSetSerializer._elementSerializer;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            Enum r0 = (Enum) it.next();
            if (jsonSerializer == null) {
                jsonSerializer = c26c.A0L(enumSetSerializer._property, r0.getDeclaringClass());
            }
            jsonSerializer.A0A(r301, c26c, r0);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        Boolean bool;
        EnumSet enumSet = (EnumSet) obj;
        int size = enumSet.size();
        if (size == 1 && (((bool = this._unwrapSingle) == null && JR0.A1T(c26c)) || bool == Boolean.TRUE)) {
            A03(r302, c26c, this, enumSet);
            return;
        }
        r302.A0n(enumSet, size);
        A03(r302, c26c, this, enumSet);
        r302.A0X();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        return ((AbstractCollection) obj).isEmpty();
    }
}
