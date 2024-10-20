package com.fasterxml.jackson.databind.ser.std;

import X.24Z;
import X.28Q;
import X.C24Y;
import X.C26c;
import X.C4Nr;

/* loaded from: SerializableSerializer.class */
public class SerializableSerializer extends StdSerializer {
    public static final SerializableSerializer A00 = new SerializableSerializer();

    public SerializableSerializer() {
        super(24Z.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        ((24Z) obj).ClK(r302, c26c, c4Nr);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        ((24Z) obj).ClJ(r302, c26c);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        24Z r0 = (24Z) obj;
        if (r0 instanceof C24Y) {
            return ((C24Y) r0).A01(c26c);
        }
        return false;
    }
}
