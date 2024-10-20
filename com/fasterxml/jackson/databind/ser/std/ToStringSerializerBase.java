package com.fasterxml.jackson.databind.ser.std;

import X.1BL;
import X.28Q;
import X.C26c;
import X.C42h;
import X.C4Nr;
import X.Kls;

/* loaded from: ToStringSerializerBase.class */
public abstract class ToStringSerializerBase extends StdSerializer {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        Kls A0Z = 1BL.A0Z(r302, C42h.A0C, c4Nr, obj);
        A0A(r302, c26c, obj);
        c4Nr.A02(r302, A0Z);
    }
}
