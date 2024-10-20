package com.fasterxml.jackson.databind.ser.std;

import X.1BL;
import X.26D;
import X.28Q;
import X.AnonymousClass001;
import X.C26c;
import X.C42h;
import X.C4Nr;
import X.Kls;

/* loaded from: StdArraySerializers$CharArraySerializer.class */
public class StdArraySerializers$CharArraySerializer extends StdSerializer {
    public StdArraySerializers$CharArraySerializer() {
        super(char[].class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        Kls A0Z;
        char[] cArr = (char[]) obj;
        if (c26c._config.A0G(26D.A0C)) {
            A0Z = 1BL.A0Z(r302, C42h.A05, c4Nr, cArr);
            int length = cArr.length;
            for (int i = 0; i < length; i++) {
                r302.A0x(cArr, i, 1);
            }
        } else {
            A0Z = 1BL.A0Z(r302, C42h.A0C, c4Nr, cArr);
            r302.A0x(cArr, 0, cArr.length);
        }
        c4Nr.A02(r302, A0Z);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        char[] cArr = (char[]) obj;
        if (!c26c._config.A0G(26D.A0C)) {
            r302.A0x(cArr, 0, cArr.length);
            return;
        }
        int length = cArr.length;
        r302.A0n(cArr, length);
        for (int i = 0; i < length; i++) {
            r302.A0x(cArr, i, 1);
        }
        r302.A0X();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        return AnonymousClass001.A1O(((char[]) obj).length);
    }
}
