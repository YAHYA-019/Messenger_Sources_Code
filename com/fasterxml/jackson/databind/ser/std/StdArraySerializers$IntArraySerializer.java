package com.fasterxml.jackson.databind.ser.std;

import X.24R;
import X.24S;
import X.28Q;
import X.AnonymousClass001;
import X.C26c;
import X.JQx;
import X.JR0;

/* loaded from: StdArraySerializers$IntArraySerializer.class */
public class StdArraySerializers$IntArraySerializer extends ArraySerializerBase {
    public static final 24S A00 = 24R.A06.A0D(Integer.TYPE);

    public StdArraySerializers$IntArraySerializer() {
        super(int[].class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        int[] iArr = (int[]) obj;
        int length = iArr.length;
        if (length == 1) {
            Boolean bool = this._unwrapSingle;
            if (bool == null ? JR0.A1T(c26c) : bool.booleanValue()) {
                r302.A0f(JQx.A0M(iArr));
                return;
            }
        }
        28Q.A07(length, length);
        r302.A0n(iArr, length);
        for (int i : iArr) {
            r302.A0f(i);
        }
        r302.A0X();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        return AnonymousClass001.A1O(((int[]) obj).length);
    }
}
