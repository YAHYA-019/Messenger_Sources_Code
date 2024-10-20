package com.fasterxml.jackson.databind.ser.impl;

import X.0Q8;
import X.1BK;
import X.1BL;
import X.28Q;
import X.C26c;
import X.C42h;
import X.C4Nr;
import X.JR0;
import X.Kls;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.List;

/* loaded from: IndexedStringListSerializer.class */
public final class IndexedStringListSerializer extends StaticListSerializerBase {
    public static final IndexedStringListSerializer A00 = new IndexedStringListSerializer();
    public static final long serialVersionUID = 1;

    public IndexedStringListSerializer() {
        super(List.class);
    }

    public static final void A03(28Q r301, C26c c26c, List list, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return;
            }
            try {
                String A14 = 1BK.A14(list, i3);
                if (A14 == null) {
                    c26c.A0W(r301);
                } else {
                    r301.A0r(A14);
                }
                i2 = i3 + 1;
            } catch (Exception e) {
                StdSerializer.A02(c26c, list, e, i3);
                throw 0Q8.createAndThrow();
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        List list = (List) obj;
        Kls A0Z = 1BL.A0Z(r302, C42h.A05, c4Nr, list);
        r302.A0O(list);
        A03(r302, c26c, list, list.size());
        c4Nr.A02(r302, A0Z);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        Boolean bool;
        List list = (List) obj;
        int size = list.size();
        if (size == 1 && (((bool = this._unwrapSingle) == null && JR0.A1T(c26c)) || bool == Boolean.TRUE)) {
            A03(r302, c26c, list, 1);
            return;
        }
        r302.A0n(list, size);
        A03(r302, c26c, list, size);
        r302.A0X();
    }
}
