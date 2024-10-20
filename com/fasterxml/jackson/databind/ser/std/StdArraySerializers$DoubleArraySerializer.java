package com.fasterxml.jackson.databind.ser.std;

import X.24R;
import X.24S;
import X.28Q;
import X.AnonymousClass001;
import X.C26c;
import X.JR0;

/* loaded from: StdArraySerializers$DoubleArraySerializer.class */
public class StdArraySerializers$DoubleArraySerializer extends ArraySerializerBase {
    public static final 24S A00 = 24R.A06.A0D(Double.TYPE);

    public StdArraySerializers$DoubleArraySerializer() {
        super(double[].class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        double[] dArr = (double[]) obj;
        int length = dArr.length;
        if (length == 1) {
            Boolean bool = this._unwrapSingle;
            if (bool == null ? JR0.A1T(c26c) : bool.booleanValue()) {
                r302.A0d(dArr[0]);
                return;
            }
        }
        28Q.A07(length, length);
        r302.A0n(dArr, length);
        for (double d : dArr) {
            r302.A0d(d);
        }
        r302.A0X();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        return AnonymousClass001.A1O(((double[]) obj).length);
    }
}
