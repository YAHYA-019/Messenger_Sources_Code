package com.fasterxml.jackson.databind.ser.impl;

import X.0Q8;
import X.1BL;
import X.28Q;
import X.AnonymousClass001;
import X.C26c;
import X.C42h;
import X.C4Nr;
import X.JR0;
import X.Kls;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: StringCollectionSerializer.class */
public class StringCollectionSerializer extends StaticListSerializerBase {
    public static final StringCollectionSerializer A00 = new StringCollectionSerializer();

    public StringCollectionSerializer() {
        super(Collection.class);
    }

    public static final void A03(28Q r301, C26c c26c, Collection collection) {
        int i = 0;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                if (A0i == null) {
                    c26c.A0W(r301);
                } else {
                    r301.A0r(A0i);
                }
                i++;
            }
        } catch (Exception e) {
            StdSerializer.A02(c26c, collection, e, i);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        Collection collection = (Collection) obj;
        Kls A0Z = 1BL.A0Z(r302, C42h.A05, c4Nr, collection);
        r302.A0O(collection);
        A03(r302, c26c, collection);
        c4Nr.A02(r302, A0Z);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        Boolean bool;
        Collection collection = (Collection) obj;
        int size = collection.size();
        if (size == 1 && (((bool = this._unwrapSingle) == null && JR0.A1T(c26c)) || bool == Boolean.TRUE)) {
            A03(r302, c26c, collection);
            return;
        }
        r302.A0n(collection, size);
        A03(r302, c26c, collection);
        r302.A0X();
    }
}
