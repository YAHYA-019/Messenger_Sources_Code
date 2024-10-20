package com.fasterxml.jackson.databind.ser.std;

import X.1BL;
import X.28P;
import X.28Q;
import X.C26c;
import X.C42h;
import X.C4Nr;
import X.Kls;

/* loaded from: TokenBufferSerializer.class */
public class TokenBufferSerializer extends StdSerializer {
    public TokenBufferSerializer() {
        super(28P.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        28P r0 = (28P) obj;
        Kls A0Z = 1BL.A0Z(r302, C42h.A07, c4Nr, r0);
        r0.A0z(r302);
        c4Nr.A02(r302, A0Z);
    }
}
