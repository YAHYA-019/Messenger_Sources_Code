package com.fasterxml.jackson.databind.ser.std;

import X.24R;
import X.24S;
import X.28Q;
import X.AnonymousClass001;
import X.C26c;
import X.JR0;

/* loaded from: StdArraySerializers$BooleanArraySerializer.class */
public class StdArraySerializers$BooleanArraySerializer extends ArraySerializerBase {
    public static final 24S A00 = 24R.A06.A0D(Boolean.class);

    public StdArraySerializers$BooleanArraySerializer() {
        super(boolean[].class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        int length = zArr.length;
        if (length == 1) {
            Boolean bool = this._unwrapSingle;
            if (bool == null ? JR0.A1T(c26c) : bool.booleanValue()) {
                r302.A0v(zArr[0]);
                return;
            }
        }
        r302.A0n(zArr, length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                r302.A0X();
                return;
            } else {
                r302.A0v(zArr[i2]);
                i = i2 + 1;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        return AnonymousClass001.A1O(((boolean[]) obj).length);
    }
}
