package com.fasterxml.jackson.datatype.guava.ser;

import X.1BL;
import X.28Q;
import X.C1ko;
import X.C26c;
import X.C42h;
import X.C4Nr;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: CacheSerializer.class */
public class CacheSerializer extends StdSerializer {
    public static final long serialVersionUID = 1;

    public CacheSerializer() {
        super(C1ko.class, false);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        r302.A0O(obj);
        c4Nr.A02(r302, 1BL.A0Z(r302, C42h.A06, c4Nr, obj));
    }
}
