package com.fasterxml.jackson.datatype.guava.ser;

import X.24R;
import X.24S;
import X.24W;
import X.43K;
import X.68U;
import X.C26c;
import X.C27r;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.Range;
import java.util.List;

/* loaded from: RangeSetSerializer.class */
public class RangeSetSerializer extends JsonSerializer implements C27r {
    public 24S A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object, com.fasterxml.jackson.datatype.guava.ser.RangeSetSerializer] */
    @Override // X.C27r
    public JsonSerializer AJN(68U r302, C26c c26c) {
        if (r302 == null) {
            return this;
        }
        ?? obj = new Object();
        24R A0A = c26c.A0A();
        obj.A00 = A0A.A0A(24R.A00(A0A.A07((43K) null, 24W.A01(new 24S[]{r302.BHb().A09(0)}[0], Range.class), Range.class), A0A), List.class);
        return obj;
    }
}
