package com.fasterxml.jackson.databind.ser.std;

import X.1BL;
import X.28Q;
import X.43N;
import X.C26c;
import X.C42h;
import X.C4Nr;
import X.Kls;

/* loaded from: NumberSerializers$DoubleSerializer.class */
public class NumberSerializers$DoubleSerializer extends NumberSerializers$Base {
    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        String[] strArr = 43N.A04;
        if (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue)) {
            r302.A0d(doubleValue);
            return;
        }
        Kls A0Z = 1BL.A0Z(r302, C42h.A0A, c4Nr, obj);
        r302.A0d(doubleValue);
        c4Nr.A02(r302, A0Z);
    }
}
