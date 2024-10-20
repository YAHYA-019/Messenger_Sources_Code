package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: M9f.class */
public final class M9f extends 5Z5 {
    public final 5Z1 A00;
    public final 5Yn A01;

    public M9f(5Yj r302, 5Z1 r303) {
        1BL.A1F(r303, r302);
        this.A00 = r303;
        this.A01 = r302.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r0 = r0.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte ALo() {
        /*
            r301 = this;
            r0 = r301
            X.5Z1 r0 = r0.A00
            r302 = r0
            r0 = r302
            java.lang.String r0 = r0.A0B()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = 0
            X.11T.A0F(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L65
            r0 = 10
            r304 = r0
            r0 = r303
            r1 = r304
            X.147 r0 = X.C0zh.A00(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L65
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L45
            r0 = r305
            int r0 = r0.A00     // Catch: java.lang.IllegalArgumentException -> L65
            r306 = r0
            r0 = r306
            r1 = -1
            r2 = -1
            int r1 = r1 << r2
            r0 = r0 ^ r1
            r307 = r0
            r0 = -2147483393(0xffffffff800000ff, float:-3.57E-43)
            r304 = r0
            r0 = r307
            r1 = r304
            if (r0 == r1) goto L41
            r0 = r307
            r1 = r304
            if (r0 >= r1) goto L45
        L41:
            r0 = r306
            byte r0 = (byte) r0
            return r0
        L45:
            r0 = r303
            X.0CW.A0g(r0)     // Catch: java.lang.IllegalArgumentException -> L65
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.IllegalArgumentException -> L65 java.lang.IllegalArgumentException -> L65
            r305 = r0
            r0 = r305
            throw r0     // Catch: java.lang.IllegalArgumentException -> L65
        L51:
            java.lang.String r0 = "Failed to parse type '"
            java.lang.String r1 = "UByte"
            java.lang.String r2 = "' for input '"
            r3 = r303
            r4 = 39
            java.lang.String r0 = X.0Pz.A0w(r0, r1, r2, r3, r4)
            r1 = r302
            X.5Z1.A02(r0, r1)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L65:
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M9f.ALo():byte");
    }

    public int ALu(SerialDescriptor serialDescriptor) {
        throw AnonymousClass001.A0N("unsupported");
    }

    public int AM3() {
        5Z1 r0 = this.A00;
        String A0B = r0.A0B();
        try {
            11T.A0F(A0B, 0);
            AnonymousClass147 A00 = C0zh.A00(A0B, 10);
            if (A00 != null) {
                return A00.A00;
            }
            0CW.A0g(A0B);
            throw 0Q8.createAndThrow();
        } catch (IllegalArgumentException unused) {
            5Z1.A02(0Pz.A0w("Failed to parse type '", "UInt", "' for input '", A0B, '\''), r0);
            throw 0Q8.createAndThrow();
        }
    }

    public long AM6() {
        5Z1 r0 = this.A00;
        String A0B = r0.A0B();
        try {
            11T.A0F(A0B, 0);
            AnonymousClass141 A01 = C0zh.A01(A0B);
            if (A01 != null) {
                return A01.A00;
            }
            0CW.A0g(A0B);
            throw 0Q8.createAndThrow();
        } catch (IllegalArgumentException unused) {
            5Z1.A02(0Pz.A0w("Failed to parse type '", "ULong", "' for input '", A0B, '\''), r0);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r0 = r0.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public short AMD() {
        /*
            r301 = this;
            r0 = r301
            X.5Z1 r0 = r0.A00
            r302 = r0
            r0 = r302
            java.lang.String r0 = r0.A0B()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = 0
            X.11T.A0F(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L65
            r0 = 10
            r304 = r0
            r0 = r303
            r1 = r304
            X.147 r0 = X.C0zh.A00(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L65
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L45
            r0 = r305
            int r0 = r0.A00     // Catch: java.lang.IllegalArgumentException -> L65
            r306 = r0
            r0 = r306
            r1 = -1
            r2 = -1
            int r1 = r1 << r2
            r0 = r0 ^ r1
            r307 = r0
            r0 = -2147418113(0xffffffff8000ffff, float:-9.1834E-41)
            r304 = r0
            r0 = r307
            r1 = r304
            if (r0 == r1) goto L41
            r0 = r307
            r1 = r304
            if (r0 >= r1) goto L45
        L41:
            r0 = r306
            short r0 = (short) r0
            return r0
        L45:
            r0 = r303
            X.0CW.A0g(r0)     // Catch: java.lang.IllegalArgumentException -> L65
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.IllegalArgumentException -> L65 java.lang.IllegalArgumentException -> L65
            r305 = r0
            r0 = r305
            throw r0     // Catch: java.lang.IllegalArgumentException -> L65
        L51:
            java.lang.String r0 = "Failed to parse type '"
            java.lang.String r1 = "UShort"
            java.lang.String r2 = "' for input '"
            r3 = r303
            r4 = 39
            java.lang.String r0 = X.0Pz.A0w(r0, r1, r2, r3, r4)
            r1 = r302
            X.5Z1.A02(r0, r1)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L65:
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M9f.AMD():short");
    }

    public 5Yn BA6() {
        return this.A01;
    }
}
