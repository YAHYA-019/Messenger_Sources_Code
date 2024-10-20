package com.fasterxml.jackson.databind.ser.std;

import X.1BL;
import X.28Q;
import X.AnonymousClass001;
import X.C26c;
import X.C42h;
import X.C4Nr;
import X.Kls;

/* loaded from: ByteArraySerializer.class */
public class ByteArraySerializer extends StdSerializer {
    public static final long serialVersionUID = 1;

    public ByteArraySerializer() {
        super(byte[].class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        byte[] bArr = (byte[]) obj;
        Kls A0Z = 1BL.A0Z(r302, C42h.A07, c4Nr, bArr);
        r302.A0h(c26c._config._base._defaultBase64, bArr, 0, bArr.length);
        c4Nr.A02(r302, A0Z);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        byte[] bArr = (byte[]) obj;
        r302.A0h(c26c._config._base._defaultBase64, bArr, 0, bArr.length);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        return AnonymousClass001.A1O(((byte[]) obj).length);
    }
}
