package com.fasterxml.jackson.databind.ser.std;

import X.C27r;
import java.util.UUID;

/* loaded from: UUIDSerializer.class */
public class UUIDSerializer extends StdScalarSerializer implements C27r {
    public static final char[] A00 = "0123456789abcdef".toCharArray();
    public final Boolean _asBinary;

    public UUIDSerializer() {
        this(null);
    }

    public UUIDSerializer(Boolean bool) {
        super(UUID.class);
        this._asBinary = bool;
    }

    public static final void A03(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void A04(char[] cArr, int i, int i2) {
        char[] cArr2 = A00;
        cArr[i2] = cArr2[(i >> 12) & 15];
        int i3 = i2 + 1;
        cArr[i3] = cArr2[(i >> 8) & 15];
        int i4 = i3 + 1;
        cArr[i4] = cArr2[(i >> 4) & 15];
        cArr[i4 + 1] = cArr2[i & 15];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    @Override // X.C27r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer AJN(X.68U r302, X.C26c r303) {
        /*
            r301 = this;
            r0 = r301
            java.lang.Class r0 = r0._handledType
            r304 = r0
            r0 = r302
            r1 = r303
            r2 = r304
            X.25s r0 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r0, r1, r2)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5a
            r0 = r304
            X.25t r0 = r0._shape
            r305 = r0
            X.25t r0 = X.C25t.BINARY
            r304 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto L48
            r0 = 1
            r306 = r0
        L23:
            r0 = r306
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r305 = r0
        L2a:
            r0 = r301
            java.lang.Boolean r0 = r0._asBinary
            r304 = r0
            r0 = r305
            r1 = r304
            boolean r0 = X.2Go.A00(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L60
            com.fasterxml.jackson.databind.ser.std.UUIDSerializer r0 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer
            r304 = r0
            r0 = r304
            r1 = r305
            r0.<init>(r1)
            r0 = r304
            return r0
        L48:
            X.25t r0 = X.C25t.STRING
            r304 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto L5a
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
            goto L23
        L5a:
            r0 = 0
            r305 = r0
            goto L2a
        L60:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.UUIDSerializer.AJN(X.68U, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }
}
