package com.fasterxml.jackson.databind.ser.impl;

import X.24R;
import X.24S;
import X.28Q;
import X.68U;
import X.AnonymousClass001;
import X.C26c;
import X.C27r;
import X.JR0;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;

/* loaded from: StringArraySerializer.class */
public class StringArraySerializer extends ArraySerializerBase implements C27r {
    public final JsonSerializer _elementSerializer;
    public static final 24S A01 = 24R.A06.A0D(String.class);
    public static final StringArraySerializer A00 = new StringArraySerializer();

    public StringArraySerializer() {
        super(String[].class);
        this._elementSerializer = null;
    }

    public StringArraySerializer(68U r302, JsonSerializer jsonSerializer, StringArraySerializer stringArraySerializer, Boolean bool) {
        super(r302, stringArraySerializer, bool);
        this._elementSerializer = jsonSerializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r0.A0A(r301, r302, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        r0 = r304[r307];
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r301.A0Z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        r307 = r307 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r307 >= r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r301.A0r(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r0 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        r0 = r304[r307];
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        r302.A0W(r301);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        r307 = r307 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r307 >= r0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(X.28Q r301, X.C26c r302, com.fasterxml.jackson.databind.ser.impl.StringArraySerializer r303, java.lang.String[] r304) {
        /*
            r0 = r304
            int r0 = r0.length
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L6b
            r0 = r303
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0._elementSerializer
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 == 0) goto L43
        L17:
            r0 = r304
            r1 = r307
            r0 = r0[r1]
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L37
            r0 = r302
            r1 = r301
            r0.A0W(r1)
        L27:
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            r0 = r307
            r1 = r305
            if (r0 >= r1) goto L6b
            goto L17
        L37:
            r0 = r306
            r1 = r301
            r2 = r302
            r3 = r308
            r0.A0A(r1, r2, r3)
            goto L27
        L43:
            r0 = r304
            r1 = r307
            r0 = r0[r1]
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L62
            r0 = r301
            r0.A0Z()
        L52:
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            r0 = r307
            r1 = r305
            if (r0 >= r1) goto L6b
            goto L43
        L62:
            r0 = r301
            r1 = r308
            r0.A0r(r1)
            goto L52
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.A03(X.28Q, X.26c, com.fasterxml.jackson.databind.ser.impl.StringArraySerializer, java.lang.String[]):void");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        Boolean bool;
        String[] strArr = (String[]) obj;
        int length = strArr.length;
        if (length == 1 && (((bool = this._unwrapSingle) == null && JR0.A1T(c26c)) || bool == Boolean.TRUE)) {
            A03(r302, c26c, this, strArr);
            return;
        }
        r302.A0n(strArr, length);
        A03(r302, c26c, this, strArr);
        r302.A0X();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        return AnonymousClass001.A1O(((String[]) obj).length);
    }
}
