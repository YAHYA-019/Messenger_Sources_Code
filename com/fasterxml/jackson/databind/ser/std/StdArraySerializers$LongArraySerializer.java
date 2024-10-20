package com.fasterxml.jackson.databind.ser.std;

import X.24R;
import X.24S;
import X.28Q;
import X.AnonymousClass001;
import X.C26c;
import X.JR0;

/* loaded from: StdArraySerializers$LongArraySerializer.class */
public class StdArraySerializers$LongArraySerializer extends StdArraySerializers$TypedPrimitiveArraySerializer {
    public static final 24S A00 = 24R.A06.A0D(Long.TYPE);

    public StdArraySerializers$LongArraySerializer() {
        super(long[].class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        long[] jArr = (long[]) obj;
        int length = jArr.length;
        if (length == 1) {
            Boolean bool = this._unwrapSingle;
            if (bool == null ? JR0.A1T(c26c) : bool.booleanValue()) {
                r302.A0g(jArr[0]);
                return;
            }
        }
        28Q.A07(length, length);
        r302.A0n(jArr, length);
        for (long j : jArr) {
            r302.A0g(j);
        }
        r302.A0X();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        return AnonymousClass001.A1O(((long[]) obj).length);
    }
}
